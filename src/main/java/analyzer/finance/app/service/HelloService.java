package analyzer.finance.app.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * Created by Denny on 4/14/2016.
 */
@Service
public class HelloService {
    public static final Logger LOGGER = Logger.getLogger(HelloService.class);

    public String getDesc(){
        LOGGER.debug("log: getDesc is executed");
        return "getDesc is executed";
    }
}
