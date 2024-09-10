package com.sprk.relationship_o_o.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "instructorDetail")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String first_name;

    private String last_name;

    private String email;

    // @JoinColumn(name = "instructor_detail_id")
    // @OneToOne
    @OneToOne(cascade = { CascadeType.ALL })
    @JsonManagedReference
    private InstructorDetail instructorDetail;

}
