//package com.miraclemessages.mmapi.models;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.util.Objects;
//
//@Entity
//@Table(name = "uservolu")
//public class UserVolu extends Auditable implements Serializable
//{
////    @Id
////    @OneToOne
////    @JoinColumn(name = "userid")
////    @JsonIgnoreProperties("userVolu")
////    private User user;
////
////    @Id
////    @OneToOne
////    @JoinColumn(name = "volunteerid")
////    @JsonIgnoreProperties("userVolu")
////    private VoluData voluData;
//
//    public UserVolu() {
//    }
//
//    public UserVolu(User user, VoluData voluData) {
//        this.user = user;
//        this.voluData = voluData;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public VoluData getVoluData() {
//        return voluData;
//    }
//
//    public void setVoluData(VoluData voluData) {
//        this.voluData = voluData;
//    }
//
//    @Override
//    public boolean equals(Object o)
//    {
//        if (this == o)
//        {
//            return true;
//        }
//        if (!(o instanceof UserRoles))
//        {
//            return false;
//        }
//        UserRoles userRoles = (UserRoles) o;
//        return getUser().equals(userRoles.getUser()) && getVoluData().equals(userRoles.getRole());
//    }
//
//    @Override
//    public int hashCode()
//    {
//        return Objects.hash(getUser(), getVoluData());
//    }
//}
