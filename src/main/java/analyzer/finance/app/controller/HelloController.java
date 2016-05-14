package analyzer.finance.app.controller;

import analyzer.finance.app.dto.Hero;
import analyzer.finance.app.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denny on 4/14/2016.
 */
@RestController
public class HelloController {
    // why another logger, differ from service logger
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    HelloService helloService;

    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/test/")
    public List<Hero> getUserInfo() {
        List<Hero> result = new ArrayList<>();
        result.add(new Hero("magneto", 1L));
        result.add(new Hero("qwe", 2L));
        return result;
    }

    /*
     * This method will be called on form submission, handling POST request for
     * saving employee in database. It also validates the user input
     */
    /*@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
    public String saveEmployee(@Valid Employee employee, BindingResult result,
                               ModelMap model) {

        if (result.hasErrors()) {
            return "registration";
        }

        *//*
         * Preferred way to achieve uniqueness of field [ssn] should be implementing custom @Unique annotation
         * and applying it on field [ssn] of Model class [Employee].
         *
         * Below mentioned peace of code [if block] is to demonstrate that you can fill custom errors outside the validation
         * framework as well while still using internationalized messages.
         *
         *//*
        if(!service.isEmployeeSsnUnique(employee.getId(), employee.getSsn())){
            FieldError ssnError =new FieldError("employee","ssn",messageSource.getMessage("non.unique.ssn", new String[]{employee.getSsn()}, Locale.getDefault()));
            result.addError(ssnError);
            return "registration";
        }

        service.saveEmployee(employee);

        model.addAttribute("success", "Employee " + employee.getName() + " registered successfully");
        return "success";
    }*/

    /*@ResponseBody
    @ResponseStatus(HttpStatus.OK)
    //@RequestMapping(method = RequestMethod.GET)
    public Map<String,Object> home() {
        Map<String,Object> model = new HashMap<>();
        model.put("id", 123);
        model.put("content", "Hello World");
        return model;
    }*/

    /*private final HelloService HelloService;

    @Autowired
    public HelloController(HelloService HelloService) {
        this.HelloService = HelloService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model) {

        logger.debug("index() is executed!");

        //model.put("msg", HelloService.getDesc());
        model.put("msg", "qweqweqweqwe");

        return "index";
    }*/
}
