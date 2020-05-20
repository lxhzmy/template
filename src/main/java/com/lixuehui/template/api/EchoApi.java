package com.lixuehui.template.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/template")
public class EchoApi {

    @GetMapping(value = "/echo")
    public String echo(@RequestParam String receivedMessge) {
        return receivedMessge;
    }
}
