package analyzer.finance.app.service;

/**
 * Created by Denny on 5/2/2016.
 */

import analyzer.finance.app.dao.CompanyDao;
import analyzer.finance.app.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("companyService")
@Transactional
public class CompanyService implements ICompanyService {

    @Autowired
    private CompanyDao dao;

    public Company findById(int id) {
        return dao.findById(id);
    }

    public List<Company> getAll() {
        return dao.getAll();
    }
}