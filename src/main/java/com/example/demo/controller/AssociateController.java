package com.example.demo.controller;

import com.example.demo.model.Associate;
import com.example.demo.service.AssociateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asociate")
public class AssociateController {
    AssociateService associateService;
@Autowired
    public AssociateController(AssociateService associateService) {
        this.associateService = associateService;
    }
    @PostMapping("/add")
    public ResponseEntity<Associate> addassociate(@RequestBody Associate associate)
    {
        return ResponseEntity.ok(associateService.addAssociate(associate));
    }
    @GetMapping("/display")
    public ResponseEntity<List<Associate>> displayassociates()
    {
        return ResponseEntity.ok(associateService.displayAssociate());
    }

}
