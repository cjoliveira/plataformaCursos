package com.grupo03.platform.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="course_approval")
public class CourseApproval {

    @Id
    private int id;

    @OneToOne
    private int course_id;
    private String approved_by;
    private String status;
    private Timestamp created_at;
    private Timestamp updated_at;

    public CourseApproval() {
    }

    public CourseApproval(int course_id){
        this.course_id = course_id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
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
}
