package com.klef.soa.exam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name = "solar_installation")
public class SolarInstallationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "site_name")
    private String siteName;

    @Column(name = "capacity_kw")
    private Double capacityKw;

    @Column(name = "installation_date")
    private String installationDate;

    @Column(name = "operational")
    private Boolean operational;

    public SolarInstallationEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public Double getCapacityKw() {
        return capacityKw;
    }

    public void setCapacityKw(Double capacityKw) {
        this.capacityKw = capacityKw;
    }

    public String getInstallationDate() {
        return installationDate;
    }

    public void setInstallationDate(String installationDate) {
        this.installationDate = installationDate;
    }

    public Boolean getOperational() {
        return operational;
    }

    public void setOperational(Boolean operational) {
        this.operational = operational;
    }
}
