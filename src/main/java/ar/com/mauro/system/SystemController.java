package ar.com.mauro.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SystemController {

    @RequestMapping("/")
    String index() {
        return "index";
    }
}
