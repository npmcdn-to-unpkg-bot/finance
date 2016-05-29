package analyzer.finance.app.service;

/**
 * Created by Denny on 5/2/2016.
 */

import analyzer.finance.app.model.Company;

import java.util.List;

public interface ICompanyService {

    Company findById(int id);

    List<Company> getAll();

}