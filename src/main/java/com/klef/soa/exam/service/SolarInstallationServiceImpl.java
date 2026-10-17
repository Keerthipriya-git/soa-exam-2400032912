package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.SolarInstallationEntity;
import com.klef.soa.exam.repository.SolarInstallationRepository;

@Service
public class SolarInstallationServiceImpl
        implements SolarInstallationService {

    @Autowired
    private SolarInstallationRepository repository;

    @Override
    public SolarInstallationEntity addInstallation(
            SolarInstallationEntity installation) {
        return repository.save(installation);
    }

    @Override
    public List<SolarInstallationEntity> displayAll() {
        return repository.findAll();
    }

    @Override
    public String deleteInstallation(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Solar installation deleted successfully";
        } else {
            return "Solar installation not found with ID: " + id;
        }
    }
}