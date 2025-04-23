package com.springbootapi.springbootapi;
// PostgreSQL is this socket: /var/run/postgresql/.s.PGSQL.5432"
import jakarta.persistence.*;

import java.util.List;

@Entity
public class SoftwareEngineer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String teckStack;

    @Column(columnDefinition = "TEXT")
    private String aiReview;

    public SoftwareEngineer(Integer id, String name, String teckStack, String aiReview) {
        this.id = id;
        this.name = name;
        this.teckStack = teckStack;
        this.aiReview = aiReview;
    }

    public SoftwareEngineer() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeckStack() {
        return teckStack;
    }

    public void setTeckStack(String teckStack) {
        this.teckStack = teckStack;
    }

    public String getAiReview() {return aiReview;}
    public void setAiReview(String aiReview) {this.aiReview = aiReview;}

}
