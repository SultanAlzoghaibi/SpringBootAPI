package com.springbootapi.springbootapi;
// PostgreSQL is this socket: /var/run/postgresql/.s.PGSQL.5432"
import java.util.List;

public class SoftwareEngineer {
    private Integer id;
    private String name;
    private List<String> teckStack;

    public SoftwareEngineer(Integer id, String name, List<String>  teckStack) {
        this.id = id;
        this.name = name;
        this.teckStack = teckStack;
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

    public List<String> getTeckStack() {
        return teckStack;
    }

    public void setTeckStack(List<String> teckStack) {
        this.teckStack = teckStack;
    }

}
