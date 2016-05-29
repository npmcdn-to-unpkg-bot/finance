package analyzer.finance.app.dao;

/**
 * Created by Denny on 5/2/2016.
 */

import analyzer.finance.app.model.Company;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("companyDao")
public class CompanyDaoImpl extends AbstractDao<Integer, Company> implements CompanyDao {

    public Company findById(int id) {
        return getByKey(id);
    }

    @SuppressWarnings("unchecked")
    public List<Company> getAll() {
        Criteria criteria = createEntityCriteria();
        return (List<Company>) criteria.list();
    }
}