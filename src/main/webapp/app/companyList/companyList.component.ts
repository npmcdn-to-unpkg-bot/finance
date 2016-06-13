import {Component, OnInit} from "@angular/core";
import { Router } from '@angular/router-deprecated';
import {Company} from "../company/company";
import { CompanyService } from '../company/company.service';

@Component({
    selector: 'test',
    templateUrl: './companyList.component.html',
    styleUrls: './companyList.component.css'
})
export class CompanyListComponent implements OnInit{
    companyList: Company[] = [];

    constructor(
        private router: Router,
        private companyService: CompanyService
    ){}

    ngOnInit(){

    }
}