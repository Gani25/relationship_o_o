package com.sprk.relationship_o_o.repository;

import com.sprk.relationship_o_o.entity.Instructor;

public interface AppDao {

    void saveInstructor(Instructor instructor);

    Instructor findByInstructorId(int id);
}
