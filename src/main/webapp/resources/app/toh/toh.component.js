var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var core_1 = require('angular2/core');
var http_1 = require('angular2/http');
var hero_list_component_ts_1 = require('./hero-list.component.ts');
var hero_service_ts_1 = require('./hero.service.ts');
// in-memory web api imports
/*import { InMemoryBackendService,
    SEED_DATA }         from 'a2-in-memory-web-api/core';
import { HeroData }          from '../hero-data';*/
var TohComponent = (function () {
    function TohComponent() {
    }
    TohComponent = __decorate([
        core_1.Component({
            selector: 'my-toh',
            template: "\n  <h1>Tour of Heroes</h1>\n  <hero-list></hero-list>\n  ",
            directives: [hero_list_component_ts_1.HeroListComponent],
            providers: [
                http_1.HTTP_PROVIDERS,
                hero_service_ts_1.HeroService,
            ]
        })
    ], TohComponent);
    return TohComponent;
})();
exports.TohComponent = TohComponent;
/*
 Copyright 2016 Google Inc. All Rights Reserved.
 Use of this source code is governed by an MIT-style license that
 can be found in the LICENSE file at http://angular.io/license
 */ 
//# sourceMappingURL=toh.component.js.map