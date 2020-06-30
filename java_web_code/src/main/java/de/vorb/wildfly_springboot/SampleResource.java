package de.vorb.wildfly_springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleResource {

    @RequestMapping("/")
    public String hello() {
        return "jfnvjsbvdfsvnBye.bye.bye.byeHello Shubham! to new ethans class new batch";
    }

}
