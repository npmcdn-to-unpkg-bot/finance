import { Company } from './company';
import { Injectable } from '@angular/core';

import {Http, Response} from '@angular/http';
import {Headers, RequestOptions} from '@angular/http';
import {Observable}     from 'rxjs/Observable';

@Injectable()
export class CompanyService {
    private urlGetCompanies = 'http://localhost:8080/list';

    constructor (private http: Http) {}

    getCompanies(): Observable<Company[]> {
        return this.http.get(this.urlGetCompanies)
            .map(this.extractData)
            .catch(this.handleError);
    }

    /*getHero(id: number) {
        return Promise.resolve(HEROES).then(
            heroes => heroes.filter(hero => hero.id === id)[0]
        );
    }*/



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