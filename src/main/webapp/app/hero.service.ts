import { Hero } from './hero';
import { HEROES } from './mock-heroes';
import { Injectable } from '@angular/core';

import {Http, Response} from '@angular/http';
import {Headers, RequestOptions} from '@angular/http';
import {Observable}     from 'rxjs/Observable';

@Injectable()
export class HeroService {
  private _heroesUrl = 'http://localhost:8080/list';  // URL to web api

  constructor (private http: Http) {}

  /*getHeroes() {
    return Promise.resolve(HEROES);
  }*/

  getHeroes (): Observable<Hero[]> {
            return this.http.get(this._heroesUrl)
                .map(this.extractData)
                .catch(this.handleError);
        }

  // See the "Take it slow" appendix
  getHeroesSlowly() {
    return new Promise<Hero[]>(resolve =>
      setTimeout(()=>resolve(HEROES), 2000) // 2 seconds
    );
  }

  getHero(id: number) {
    return Promise.resolve(HEROES).then(
      heroes => heroes.filter(hero => hero.id === id)[0]
    );
  }



     private extractData(res: Response) {
           if (res.status < 200 || res.status >= 300) {
                 throw new Error('Bad response status: ' + res.status);
             }
           let body = res.json();
           return body || { };
       }
 
     private handleError (error: any) {
         // In a real world app, we might send the error to remote logging infrastructure
             let errMsg = error.message || 'Server error';
         console.error(errMsg); // log to console instead
         return Observable.throw(errMsg);
     }
}

/*
Copyright 2016 Google Inc. All Rights Reserved.
Use of this source code is governed by an MIT-style license that
can be found in the LICENSE file at http://angular.io/license
*/