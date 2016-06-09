package analyzer.finance.app.controller;

/**
 * Created by Denny on 5/2/2016.
 */

import analyzer.finance.app.model.Hero;
import analyzer.finance.app.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Locale;

@RestController
public class HeroController {

    @Autowired
    HeroService service;

    @Autowired
    MessageSource messageSource;

    /*
     * This method will list all existing heros.
     */
    /*@ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = { "/", "/list" })
    public List<Hero> listHeros() {
        List<Hero> heros = service.findAllHeros();
        return heros;
    }*/

    /*
     * This method will provide the medium to add a new hero.
     */
    @RequestMapping(value = { "/new" }, method = RequestMethod.GET)
    public String newHero(ModelMap model) {
        Hero hero = new Hero();
        model.addAttribute("hero", hero);
        model.addAttribute("edit", false);
        return "registration";
    }

    /*
     * This method will be called on form submission, handling POST request for
     * saving hero in database. It also validates the user input
     */
    @RequestMapping(value = { "/new" }, method = RequestMethod.POST)
    public String saveHero(@Valid Hero hero, BindingResult result,
                               ModelMap model) {

        if (result.hasErrors()) {
            return "registration";
        }

        /*
         * Preferred way to achieve uniqueness of field [name] should be implementing custom @Unique annotation
         * and applying it on field [name] of Model class [Hero].
         *
         * Below mentioned peace of code [if block] is to demonstrate that you can fill custom errors outside the validation
         * framework as well while still using internationalized messages.
         *
         */
        if(!service.isHeroNameUnique(hero.getId(), hero.getName())){
            FieldError nameError =new FieldError("hero","name",messageSource.getMessage("non.unique.name", new String[]{hero.getName()}, Locale.getDefault()));
            result.addError(nameError);
            return "registration";
        }

        service.saveHero(hero);

        model.addAttribute("success", "Hero " + hero.getName() + " registered successfully");
        return "success";
    }


    /*
     * This method will provide the medium to update an existing hero.
     */
    @RequestMapping(value = { "/edit-{name}-hero" }, method = RequestMethod.GET)
    public String editHero(@PathVariable String name, ModelMap model) {
        Hero hero = service.findHeroByName(name);
        model.addAttribute("hero", hero);
        model.addAttribute("edit", true);
        return "registration";
    }

    /*
     * This method will be called on form submission, handling POST request for
     * updating hero in database. It also validates the user input
     */
    @RequestMapping(value = { "/edit-{name}-hero" }, method = RequestMethod.POST)
    public String updateHero(@Valid Hero hero, BindingResult result,
                                 ModelMap model, @PathVariable String name) {

        if (result.hasErrors()) {
            return "registration";
        }

        if(!service.isHeroNameUnique(hero.getId(), hero.getName())){
            FieldError nameError =new FieldError("hero","name",messageSource.getMessage("non.unique.name", new String[]{hero.getName()}, Locale.getDefault()));
            result.addError(nameError);
            return "registration";
        }

        service.updateHero(hero);

        model.addAttribute("success", "Hero " + hero.getName()  + " updated successfully");
        return "success";
    }


    /*
     * This method will delete an hero by it's SSN value.
     */
    @RequestMapping(value = { "/delete-{name}-hero" }, method = RequestMethod.GET)
    public String deleteHero(@PathVariable String name) {
        service.deleteHeroByName(name);
        return "redirect:/list";
    }

}