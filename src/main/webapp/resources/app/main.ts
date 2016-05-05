import {bootstrap}        from 'angular2/platform/browser';
import { HTTP_PROVIDERS } from 'angular2/http';

import 'rxjs/Rx';

import { TohComponent }   from './toh/toh.component.ts';

bootstrap(TohComponent, [HTTP_PROVIDERS]);

/*
 Copyright 2016 Google Inc. All Rights Reserved.
 Use of this source code is governed by an MIT-style license that
 can be found in the LICENSE file at http://angular.io/license
 */