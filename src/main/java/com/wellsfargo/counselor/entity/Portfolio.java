package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private long clientId;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio() {} ;

    public Portfolio(Long clientId, String creationDate) {
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() { return portfolioId; }

    public Long getClientId() { return clientId; }

    public String getCreationDate() { return creationDate; }

    public void setCreationDate(String creationDate) { this.creationDate = creationDate; }
}
