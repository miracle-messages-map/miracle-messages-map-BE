//package com.miraclemessages.mmapi.models;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "voludata")
//public class VoluData extends Auditable
//{
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long volunteerid;
//
//    //Email
//    @Column(nullable = false,
//            unique = true)
//    private String email;
//
//    //First/Last name
//    @Column(nullable = false)
//    private String firstName;
//
//    @Column(nullable = false)
//    private String lastName;
//
//    //Phone
//    @Column(unique = true)
//    private int phoneNumber;
//
//    //City
//    @Column(nullable = false)
//    private String city;
//
//    //State Province
//    @Column(nullable = false)
//    private String state;
//
//    //Interested In
//    @Column(nullable = false)
//    private String interestedIn;
//
//    //Comment
//    @Column(unique = true)
//    private String comment;
//
//    //Zip/Postal Code
//    @Column(nullable = false)
//    private String zip;
//
//    //Full Address
//    @Column(nullable = false,
//            unique = true)
//    private String address;
//
//    //Time Zone
//    @Column(nullable = false)
//    private int timeZone;
//
////    @OneToMany(mappedBy = "voluData",
////            cascade = CascadeType.ALL)
////    @JsonIgnoreProperties("voludata")
////    private List<UserVolu> userVolu = new ArrayList<>();
//
//    public VoluData() {
//    }
//
//    public VoluData(String email, String firstName, String lastName, int phoneNumber, String city, String state, String interestedIn, String comment, String zip, String address, int timeZone, UserVolu userVolu) {
//        this.email = email;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.phoneNumber = phoneNumber;
//        this.city = city;
//        this.state = state;
//        this.interestedIn = interestedIn;
//        this.comment = comment;
//        this.zip = zip;
//        this.address = address;
//        this.timeZone = timeZone;
//    }
//
//    public long getVolunteerid() {
//        return volunteerid;
//    }
//
//    public void setVolunteerid(long volunteerid) {
//        this.volunteerid = volunteerid;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public int getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(int phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public String getInterestedIn() {
//        return interestedIn;
//    }
//
//    public void setInterestedIn(String interestedIn) {
//        this.interestedIn = interestedIn;
//    }
//
//    public String getComment() {
//        return comment;
//    }
//
//    public void setComment(String comment) {
//        this.comment = comment;
//    }
//
//    public String getZip() {
//        return zip;
//    }
//
//    public void setZip(String zip) {
//        this.zip = zip;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public int getTimeZone() {
//        return timeZone;
//    }
//
//    public void setTimeZone(int timeZone) {
//        this.timeZone = timeZone;
//    }
//
//    public List<UserVolu> getUserVolu() {
//        return userVolu;
//    }
//
//    public void setUserVolu(List<UserVolu> userVolu) {
//        this.userVolu = userVolu;
//    }
//}
