package analyzer.finance.app.service;

/**
 * Created by Denny on 5/2/2016.
 */

import analyzer.finance.app.dao.HeroDao;
import analyzer.finance.app.model.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("heroService")
//@Service
@Transactional
public class HeroServiceImpl implements HeroService {

    @Autowired
    private HeroDao dao;

    public Hero findById(int id) {
        return dao.findById(id);
    }

    public void saveHero(Hero hero) {
        dao.saveHero(hero);
    }

    /*
     * Since the method is running with Transaction, No need to call hibernate update explicitly.
     * Just fetch the entity from db and update it with proper values within transaction.
     * It will be updated in db once transaction ends.
     */
    public void updateHero(Hero hero) {
        Hero entity = dao.findById(hero.getId());
        if(entity != null){
            entity.setName(hero.getName());
            entity.setDescription(hero.getDescription());
        }
    }

    public void deleteHeroByName(String name) {
        dao.deleteHeroByName(name);
    }

    public List<Hero> findAllHeros() {
        return dao.findAllHeros();
    }

    public Hero findHeroByName(String ssn) {
        return dao.findHeroByName(ssn);
    }

    public boolean isHeroNameUnique(Integer id, String ssn) {
        Hero hero = findHeroByName(ssn);
        return ( hero == null || ((id != null) && (hero.getId() == id)));
    }

}