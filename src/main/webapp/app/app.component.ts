import { Component } from '@angular/core';
import { RouteConfig, ROUTER_DIRECTIVES, ROUTER_PROVIDERS } from '@angular/router-deprecated'; //todo ?

import { CompanyListComponent } from './companyList/companyList.component';
import { DashboardComponent } from './dashboard/dashboard.component';

import {HeroService} from './oldstuff/hero.service'; // todo

@Component({
    selector: 'my-app',
    templateUrl: 'app/menu.html',
    styleUrls: ['app/app.component.css'],
    directives: [ROUTER_DIRECTIVES],
    providers: [
        ROUTER_PROVIDERS,
        HeroService
    ]
})
@RouteConfig([
    {
        path: '/dashboard',
        name: 'Dashboard',
        component: DashboardComponent,
        useAsDefault: true
    },
    /*{
        path: '/detail/:id',
        name: 'HeroDetail',
        component: HeroDetailComponent
    },*/
    {
        path: '/companies',
        name: 'CompanyList',
        component: CompanyListComponent
    }
])
export class AppComponent {
    title = 'Analysis';
}


/*
 Copyright 2016 Google Inc. All Rights Reserved.
 Use of this source code is governed by an MIT-style license that
 can be found in the LICENSE file at http://angular.io/license
 */