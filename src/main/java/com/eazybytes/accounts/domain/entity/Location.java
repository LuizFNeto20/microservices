package com.eazybytes.accounts.domain.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Location {
    private String country;
    private String state;
    private String city;
}