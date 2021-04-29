package com.example.demo.service;

import com.example.demo.model.Associate;
import com.example.demo.repository.AssociateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssociateServiceImpl implements AssociateService{
    AssociateRepo associateRepo;
@Autowired
    public AssociateServiceImpl(AssociateRepo associateRepo) {
        this.associateRepo = associateRepo;
    }

    @Override
    public Associate addAssociate(Associate associate) {
      return associateRepo.save(associate);
    }

    @Override
    public List<Associate> displayAssociate() {
       return associateRepo.findAll();
    }
}
