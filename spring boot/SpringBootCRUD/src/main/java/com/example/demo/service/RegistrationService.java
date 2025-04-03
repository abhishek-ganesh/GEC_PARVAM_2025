package com.example.demo.service;

import com.example.demo.model.Registration;
import com.example.demo.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {
    
    @Autowired
    private RegistrationRepository repository;
    
    public List<Registration> getAllRegistrations() {
        return repository.findAll();
    }
    
    public Registration saveRegistration(Registration registration) {
        return repository.save(registration);
    }
    
    public Registration getRegistrationById(Long id) {
        return repository.findById(id).orElse(null);
    }
    
    public void deleteRegistration(Long id) {
        repository.deleteById(id);
    }
}
