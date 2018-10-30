package springboottest.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuanjiaping
 * @create 2018-10-29 14:26
 * @description TODO
 **/
@RestController
public class DemoController {

    @RequestMapping("/helloworld")
    public String helloWorld(){
        return "Hello World!";
    }
}
