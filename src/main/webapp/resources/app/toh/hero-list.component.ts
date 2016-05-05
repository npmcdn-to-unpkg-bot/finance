import {Component, OnInit} from 'angular2/core';
import {Hero}              from './hero';
import {HeroService}       from './hero.service.ts';

@Component({
    selector: 'hero-list',
    templateUrl: '/resources/app/toh/hero-list.component.html',
    styles: ['.error {color:red;}']
})
export class HeroListComponent implements OnInit {

    constructor (private _heroService: HeroService) {}

    errorMessage: string;
    heroes:Hero[];

    ngOnInit() { this.getHeroes(); }

    getHeroes() {
        this._heroService.getHeroes()
            .subscribe(
                heroes => this.heroes = heroes,
                error =>  this.errorMessage = <any>error);
    }

    addHero (name: string) {
        if (!name) {return;}
        this._heroService.addHero(name)
            .subscribe(
                hero  => this.heroes.push(hero),
                error =>  this.errorMessage = <any>error);
    }
}


/*
 Copyright 2016 Google Inc. All Rights Reserved.
 Use of this source code is governed by an MIT-style license that
 can be found in the LICENSE file at http://angular.io/license
 */