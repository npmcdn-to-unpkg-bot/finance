package analyzer.finance.app.controller;

import analyzer.finance.app.model.Company;
import analyzer.finance.app.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Denny on 5/29/2016.
 */
@RestController
public class CompanyController {

    @Autowired
    CompanyService service;

    @Autowired
    MessageSource messageSource;

    /*
     * This method will list all existing heros.
     */
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = { "/", "/list" })
    public List<Company> listCompanies() {
        List<Company> companyList = service.getAll();
        return companyList;
    }
}
