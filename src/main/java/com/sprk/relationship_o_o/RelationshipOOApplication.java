package com.sprk.relationship_o_o;

import java.sql.Timestamp;
import java.time.Instant;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sprk.relationship_o_o.entity.Instructor;
import com.sprk.relationship_o_o.entity.InstructorDetail;
import com.sprk.relationship_o_o.repository.AppDao;

@SpringBootApplication
public class RelationshipOOApplication {

    public static void main(String[] args) {
        SpringApplication.run(RelationshipOOApplication.class, args);
    }

    /*
     * @Bean
     * public CommandLineRunner runner(AppDao appDao) {
     * 
     * return run -> {
     * // Save instructor
     * // insertInstructor(appDao);
     * 
     * // Find Instructor
     * getInstructor(appDao);
     * 
     * // Delete Instructor
     * // deleteInstructor(appDao);
     * 
     * // Find Instructor Detail By Id
     * 
     * };
     * }
     */

    private void deleteInstructor(AppDao appDao) {

        appDao.deleteInstructor(2);
    }

    private void getInstructor(AppDao appDao) {

        Instructor instructor = appDao.findByInstructorId(3);

        System.out.println(instructor);

        System.out.println(instructor.getInstructorDetail());

    }

    private void insertInstructor(AppDao appDao) {

        Instructor instructor = new Instructor(0, "Pranjal", "Sharma", "pranjal@gmail.com", null);

        InstructorDetail instructorDetail = new InstructorDetail(0, "Phd", "Dancing",
                new Timestamp(System.currentTimeMillis()), null);

        /*
         * InstructorDetail instructorDetail = new InstructorDetail(0, "BE", "Cycling",
         * Timestamp.from(Instant.now()));
         */

        instructor.setInstructorDetail(instructorDetail);

        appDao.saveInstructor(instructor);

    }

}
