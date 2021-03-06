package ru.hh.backend.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "resumes")
@Data
@EqualsAndHashCode(callSuper = true)
public class Resume extends BaseEntity{

    @Column
    private String title;

    @Column(name = "work_experience")
    private String workExperience;

    @Column
    private String contacts;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User applicant;
}
