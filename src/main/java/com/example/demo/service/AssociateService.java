package com.example.demo.service;

import com.example.demo.model.Associate;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AssociateService {
    public Associate addAssociate(Associate associate);
    public List<Associate> displayAssociate();
    public Associate findByAssociateName(String name);
    public Optional<Associate> findByid(Integer aid);
    public Associate findByAssociateMail(String mail);
    public Associate findByAssociatePhone(String phone );
    public Associate updateAssociate(Integer id, Associate associate);
    public List<Associate> findBySkills(String skill);
}
