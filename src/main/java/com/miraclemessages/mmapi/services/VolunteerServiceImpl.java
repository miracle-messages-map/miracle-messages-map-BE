//package com.miraclemessages.mmapi.services;
//
//import com.miraclemessages.mmapi.models.VoluData;
//import com.miraclemessages.mmapi.repository.VolunteerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service(value = "volunteerService")
//public class VolunteerServiceImpl implements VolunteerService
//{
//    @Autowired
//    VolunteerRepository volunteerRepository;
//
//    @Transactional
//    @Override
//    public VoluData save(VoluData voluData)
//    {
//        VoluData newVol = new VoluData();
//
//        newVol.setFirstName(voluData.getFirstName());
//        newVol.setLastName(voluData.getLastName());
//        newVol.setEmail(voluData.getEmail());
//        newVol.setPhoneNumber(voluData.getPhoneNumber());
//        newVol.setAddress(voluData.getAddress());
//        newVol.setState(voluData.getState());
//        newVol.setCity(voluData.getCity());
//        newVol.setComment(voluData.getComment());
//        newVol.setZip(voluData.getZip());
//        newVol.setTimeZone(voluData.getTimeZone());
//        newVol.setInterestedIn(voluData.getInterestedIn());
//
//        return volunteerRepository.save(newVol);
//    }
//
//}
