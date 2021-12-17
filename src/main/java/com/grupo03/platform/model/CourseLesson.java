package com.grupo03.platform.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="course_lesson")
public class CourseLesson {

    @Id
    private int id;
    private String title;
    private double duration;
    private Timestamp created_at;
    private Timestamp updated_at;
    // ManyToOne -> Vários cetificados para um curso
    // JoinColumn -> Tabela correspondente possui uma coluna com uma chave estrangeira para a tabela referenciada
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public CourseLesson() {
    }

    public CourseLesson(Course course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
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
