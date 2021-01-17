package nl.gettoworktogether.restful_controller.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CustomersController {

    @RequestMapping(value = "/")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping(value = "/message")
    public ResponseEntity<Object> getMessage() {
        return new ResponseEntity<>("REST endpoint: /message", HttpStatus.OK);
    }

    @RequestMapping(value = "/customers")
    public ResponseEntity<Object> getCurstomers() {
        List<String> data = new ArrayList<>();
        data.add("Jansen");
        data.add("Pietersen");
        data.add("Kardol");
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @ResponseStatus(value = HttpStatus.I_AM_A_TEAPOT)
    @GetMapping(value = "/coffee")
    public String coffee() { return "I_AM_A_TEAPOT"; }

}
