package com.sprk.relationship_o_o.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sprk.relationship_o_o.entity.Instructor;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class AppDaoImpl implements AppDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public void saveInstructor(Instructor instructor) {

        // entityManager.persist(instructor.getInstructorDetail());

        entityManager.persist(instructor);
    }

    @Override
    public Instructor findByInstructorId(int id) {
        Instructor instructor = entityManager.find(Instructor.class, id);
        return instructor;
    }

    @Override
    @Transactional
    public void deleteInstructor(int id) {
        Instructor instructor = findByInstructorId(id);
        entityManager.remove(instructor);
    }

}
