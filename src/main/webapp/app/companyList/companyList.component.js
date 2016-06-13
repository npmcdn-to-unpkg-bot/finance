System.register(["@angular/core", '@angular/router-deprecated', '../company/company.service'], function(exports_1) {
    var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
        var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
        if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
        else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
        return c > 3 && r && Object.defineProperty(target, key, r), r;
    };
    var __metadata = (this && this.__metadata) || function (k, v) {
        if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
    };
    var core_1, router_deprecated_1, company_service_1;
    var CompanyListComponent;
    return {
        setters:[
            function (core_1_1) {
                core_1 = core_1_1;
            },
            function (router_deprecated_1_1) {
                router_deprecated_1 = router_deprecated_1_1;
            },
            function (company_service_1_1) {
                company_service_1 = company_service_1_1;
            }],
        execute: function() {
            CompanyListComponent = (function () {
                function CompanyListComponent(router, companyService) {
                    this.router = router;
                    this.companyService = companyService;
                    this.companyList = [];
                }
                CompanyListComponent.prototype.ngOnInit = function () {
                };
                CompanyListComponent = __decorate([
                    core_1.Component({
                        selector: 'test',
                        templateUrl: './companyList.component.html',
                        styleUrls: './companyList.component.css'
                    }), 
                    __metadata('design:paramtypes', [(typeof (_a = typeof router_deprecated_1.Router !== 'undefined' && router_deprecated_1.Router) === 'function' && _a) || Object, company_service_1.CompanyService])
                ], CompanyListComponent);
                return CompanyListComponent;
                var _a;
            })();
            exports_1("CompanyListComponent", CompanyListComponent);
        }
    }
});
//# sourceMappingURL=companyList.component.js.map