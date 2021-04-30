package com.example.demo.controller;

import com.example.demo.model.Associate;
import com.example.demo.service.AssociateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
@GetMapping("/fname/{name}")
    public ResponseEntity<Associate> getbyfirstname(@PathVariable String name)
    {
        return ResponseEntity.ok(associateService.findByAssociateName(name));
    }
    @GetMapping("/byid/{aid}")
    public ResponseEntity<Optional<Associate>> getbyid(@PathVariable Integer aid)
    {
        return ResponseEntity.ok(associateService.findByid(aid));

    }
    @GetMapping("/bymail/{mail}")
    public ResponseEntity<Associate> getbyemail(@PathVariable String mail)
    {
        return ResponseEntity.ok(associateService.findByAssociateMail(mail));

    }
    @GetMapping("/byphone/{phone}")
    public ResponseEntity<Associate> getbyphone(@PathVariable String phone)
    {
        return ResponseEntity.ok(associateService.findByAssociatePhone(phone));

    }
    @GetMapping("/byskills/{skill}")
    public ResponseEntity<List<Associate>> getbyskill(@PathVariable String skill)
    {
        return ResponseEntity.ok(associateService.findBySkills(skill));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Associate> updateassociate(@PathVariable Integer id,@RequestBody Associate associate)
    {
        return ResponseEntity.ok(associateService.updateAssociate(id,associate));
    }




}
