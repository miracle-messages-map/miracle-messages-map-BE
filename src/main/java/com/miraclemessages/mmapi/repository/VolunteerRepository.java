//package com.miraclemessages.mmapi.repository;
//
//import com.miraclemessages.mmapi.models.VoluData;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.transaction.annotation.Transactional;
//
//public interface VolunteerRepository extends CrudRepository<VoluData, Long>
//{
//    @Transactional
//    @Modifying
//    @Query(value = "DELETE from UserVolu where userid = :userid")
//    void deleteUserRolesByUserId(long userid);
//
//    @Transactional
//    @Modifying
//    @Query(value = "INSERT INTO UserVolu(userid, volunteerid) values (:userid, :volunteerid)", nativeQuery = true)
//    void insertUserRoles(long userid, long volunteerid);
//
//    VoluData findByNameIgnoreCase(String name);
//}
