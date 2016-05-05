package analyzer.finance.app.dao;

/**
 * Created by Denny on 5/2/2016.
 */

import analyzer.finance.app.model.Hero;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("heroDao")
//@ComponentScan("analyzer.finance.app.dao")
public class HeroDaoImpl extends AbstractDao<Integer, Hero> implements HeroDao {

    public Hero findById(int id) {
        return getByKey(id);
    }

    public void saveHero(Hero hero) {
        persist(hero);
    }

    public void deleteHeroByName(String name) {
        Query query = getSession().createSQLQuery("delete from Hero where name = :name"); //todo this may not work coz of name property
        query.setString("name", name);
        query.executeUpdate();
    }

    @SuppressWarnings("unchecked")
    public List<Hero> findAllHeros() {
        Criteria criteria = createEntityCriteria();
        return (List<Hero>) criteria.list();
    }

    public Hero findHeroByName(String name) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("name", name));
        return (Hero) criteria.uniqueResult();
    }
}