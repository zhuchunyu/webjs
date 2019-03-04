package com.habage.webjs.ctrl;

import com.habage.webjs.handler.SpringWebSocketHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    /**
     * 这个注解会从Spring容器拿出Bean
     * @return
     */
    @Bean
    public SpringWebSocketHandler infoHandler() {
        return new SpringWebSocketHandler();
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
