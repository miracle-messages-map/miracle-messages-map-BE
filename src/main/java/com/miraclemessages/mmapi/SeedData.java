package com.miraclemessages.mmapi;

import com.miraclemessages.mmapi.models.*;
import com.miraclemessages.mmapi.services.RoleService;
import com.miraclemessages.mmapi.services.UserService;
import com.opencsv.CSVReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;
import java.util.ArrayList;

@Transactional
@Component
public class SeedData implements CommandLineRunner
{
    @Autowired
    RoleService roleService;

    @Autowired
    UserService userService;

    //@Autowired
    //VolunteerService volunteerService;


    @Override
    public void run(String[] args) throws Exception {

        // For reading and phrasing the csv file
        String csvFile = "D:\\Lamda_Java_Backend\\Build Week\\miracle-messages-map-BE\\src\\main\\resources\\miracle_messages.csv";

        Role r1 = new Role("admin");
        Role r2 = new Role("volunteer");

        roleService.save(r1);
        roleService.save(r2);

        ArrayList<UserRoles> admins = new ArrayList<>();
        admins.add(new UserRoles(new User(), r1));
        admins.add(new UserRoles(new User(), r2));
        User u1 = new User("admin", "adminpass", admins);
        userService.save(u1);

        ArrayList<UserRoles> users = new ArrayList<>();
        users.add(new UserRoles(new User(), r2));
        User u3 = new User("Barn@bmail.com", "1234", "Barn", "Barn", "1234567899", "McTown", "Texas", "", "", "", "78504", "5050 N. 15th", users);
        userService.save(u3);

        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(csvFile));
            String[] newUser;
            while ((newUser = reader.readNext()) != null) {
                //System.out.println(newUser[0] + " " + newUser[1] + " " + newUser[2] + " " + newUser[3] + " " + newUser[4] + " " + newUser[5] + " " + newUser[6] + " " + newUser[7] + " " + newUser[8] + " " + newUser[9] + " " + newUser[10] + " " + newUser[11] + " " + newUser[12]);
                User csvUser = new User(newUser[2], "", newUser[3], newUser[4], newUser[5], newUser[6], newUser[7], newUser[8], newUser[9], "", newUser[10], newUser[11], users);
                userService.save(csvUser);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
