package com.grupo03.platform.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Entity
public class Certificate {

    @Id
    private int id;
    private Timestamp issued_at;
    private Timestamp created_at;
    private Timestamp updated_at;
    // ManyToOne -> Vários cetificados para um curso
    // JoinColumn -> Tabela correspondente possui uma coluna com uma chave estrangeira para a tabela referenciada
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
    // ManyToOne -> Vários cetificados para um curso
    // JoinColumn -> Tabela correspondente possui uma coluna com uma chave estrangeira para a tabela referenciada
    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;

    public Certificate() {
    }

    public Certificate(Course course, Users users) {
        this.course = course;
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getIssued_at() {
        return issued_at;
    }

    public void setIssued_at(Timestamp issued_at) {
        this.issued_at = issued_at;
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

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
