package com.tads_prog4.controller;

import com.tads_prog4.model.Kid;
import com.tads_prog4.model.Node;
import com.tads_prog4.service.ListSEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/listse")
public class ListSEController {
    @Autowired
    private ListSEService listSEService;

    @GetMapping
    public ResponseEntity<Node> getAll(){
        return new ResponseEntity<Node>(
                listSEService.getKids().getHead(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> add(@RequestBody Kid kid){
        // irian las validaciones de la entrada
        listSEService.getKids().add(kid);
        return new ResponseEntity<String>(
                "Adicionado exitosamente", HttpStatus.OK);
    }

    @PostMapping(path = "/tostart")
    public ResponseEntity<String> addToStart(@RequestBody Kid kid){
        // irian las validaciones de la entrada
        listSEService.getKids().addToStart(kid);
        return new ResponseEntity<String>(
                "Adicionado exitosamente", HttpStatus.OK);
    }
}
