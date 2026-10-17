package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.soa.exam.entity.SolarInstallationEntity;
import com.klef.soa.exam.service.SolarInstallationService;

@RestController
public class SolarInstallationController {

    @Autowired
    private SolarInstallationService service;

    @GetMapping("/")
    public String home() {
        return "CRUD Service is running";
    }

  
    @PostMapping("/Add")
    public SolarInstallationEntity add(
            @RequestBody SolarInstallationEntity installation) {
        return service.addInstallation(installation);
    }

    
    @GetMapping("/DisplayAll")
    public List<SolarInstallationEntity> displayAll() {
        return service.displayAll();
    }

   
    @DeleteMapping("/Delete/{id}")
    public String delete(@PathVariable Long id) {
        return service.deleteInstallation(id);
    }
}