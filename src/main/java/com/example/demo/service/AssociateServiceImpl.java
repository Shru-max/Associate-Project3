package com.example.demo.service;

import com.example.demo.model.Associate;
import com.example.demo.repository.AssociateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Associate findByAssociateName(String name) {
        return associateRepo.findByAssociateName(name);
    }

    @Override
    public Optional<Associate> findByid(Integer aid) {
        return associateRepo.findById(aid);
    }

    @Override
    public Associate findByAssociateMail(String mail) {
        return associateRepo.findByAssociateMail(mail);
    }

    @Override
    public Associate findByAssociatePhone(String phone) {
        return associateRepo.findByAssociatePhone(phone);
    }

    @Override
    @Transactional
    public Associate updateAssociate(Integer id, Associate associate) {
    Associate associate1=associateRepo.findByAssociateId(id);
    if(associate1==null)
    {
        System.out.println("ACCOUNT NOT FOUND");
    }
    else
    {
        associate1.setAssociateName(associate.getAssociateName());
        associate1.setAssociateMail(associate.getAssociateMail());
        associate1.setAssociatePhone(associate.getAssociatePhone());
        associateRepo.save(associate1);

    }
    return associate1;


    }

    @Override
    public List<Associate> findBySkills(String skill) {
        return associateRepo.findBySkills(skill);
    }
}
