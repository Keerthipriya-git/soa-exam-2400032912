
package com.klef.soa.exam.service;

import java.util.List;
import com.klef.soa.exam.entity.SolarInstallationEntity;

public interface SolarInstallationService {

    SolarInstallationEntity addInstallation(
            SolarInstallationEntity installation);

    List<SolarInstallationEntity> displayAll();

    String deleteInstallation(Long id);
}