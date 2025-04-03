package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Registration;
import com.example.demo.model.service.RegistrationService;

import java.util.List;

@RestController
@RequestMapping("/api/registrations")
public class RegistrationController {
    
    @Autowired
    private RegistrationService service;
    
    @GetMapping
    public List<Registration> getAllRegistrations() {
        return service.getAllRegistrations();
    }
    
    @PostMapping
    public Registration addRegistration(@RequestBody Registration registration) {
        return service.saveRegistration(registration);
    }
    
    @GetMapping("/{id}")
    public Registration getRegistration(@PathVariable Long id) {
        return service.getRegistrationById(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteRegistration(@PathVariable Long id) {
        service.deleteRegistration(id);
    }
}
