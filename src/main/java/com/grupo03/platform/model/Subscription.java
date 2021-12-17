package com.grupo03.platform.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Entity
public class Subscription {

    @Id
    private int id;
    private double progress;
    private String status;
    private Timestamp created_at;
    private Timestamp updated_at;
    // ManyToOne -> Vários cetificados para um curso
    // JoinColumn -> Tabela correspondente possui uma coluna com uma chave estrangeira para a tabela referenciada
    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;
    // ManyToOne -> Vários cetificados para um curso
    // JoinColumn -> Tabela correspondente possui uma coluna com uma chave estrangeira para a tabela referenciada
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public Subscription(){

    }

    public Subscription(Users users, Course course) {
        this.users = users;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
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

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
