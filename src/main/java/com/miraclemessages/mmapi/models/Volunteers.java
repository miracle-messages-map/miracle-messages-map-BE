package com.miraclemessages.mmapi.models;

import javax.persistence.*;

/*
*  This will act as the main table to hold volunteer data*/
@Entity
@Table(name = "volunteer")
public class Volunteers extends Auditable
{
    //Email
    @Column(nullable = false,
            unique = true)
    private String email;

    //First/Last name
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    //Phone
    @Column(unique = true)
    private int phoneNumber;

    //City
    @Column(nullable = false)
    private String city;

    //State Province
    @Column(nullable = false)
    private String state;

    //Interested In
    @Column(nullable = false)
    private boolean interestedIn;

    //Comment
    @Column(unique = true)
    private String comment;

    //Zip/Postal Code
    @Column(nullable = false)
    private String zip;

    //Full Address
    @Column(nullable = false,
            unique = true)
    private String address;

    //Time Zone
    @Column(nullable = false)
    private int timeZone;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable()
    private User user;
}
