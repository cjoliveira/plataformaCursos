package com.grupo03.platform.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="course_approval")
public class CourseApproval {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String approved_by;
    private String status;
    private Timestamp created_at;
    private Timestamp updated_at;

    // OneToOne -> Um curso aprovado para um curso
    // JoinColumn -> Tabela correspondente possui uma coluna com uma chave estrangeira para a tabela referenciada
    @OneToOne
    @JoinColumn(name="course_id")
    private Course course;

    public CourseApproval() {
    }

    public CourseApproval(Course course){
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApproved_by() {
        return approved_by;
    }

    public void setApproved_by(String approved_by) {
        this.approved_by = approved_by;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
