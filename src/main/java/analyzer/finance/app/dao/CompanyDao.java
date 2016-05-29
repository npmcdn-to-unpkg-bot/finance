package analyzer.finance.app.dao;

/**
 * Created by Denny on 5/2/2016.
 */
import analyzer.finance.app.model.Company;

import java.util.List;

public interface CompanyDao {

    Company findById(int id);

    List<Company> getAll();

}