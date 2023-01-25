package com.TeamD.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PruebraController {
    @RequestMapping("/prueba")
    @ResponseBody
    public ResponseEntity<String>prueba(){
        return new ResponseEntity<>("hola TeamD",HttpStatus.ACCEPTED);
    }


}
