package analyzer.finance.app.dao;

/**
 * Created by Denny on 5/2/2016.
 */
import analyzer.finance.app.model.Hero;

import java.util.List;

public interface HeroDao {

    Hero findById(int id);

    void saveHero(Hero hero);

    void deleteHeroByName(String name);

    List<Hero> findAllHeros();

    Hero findHeroByName(String name);

}