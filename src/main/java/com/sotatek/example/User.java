package com.sotatek.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "users")
public class User {
    @Id
    private Long id;

    private String name;

    @Column(columnDefinition = "text[]")
    @Type(value = CustomStringArrayType.class)
    private String[] roles;

    @Column(columnDefinition = "int[]")
    @Type(value = CustomIntegerArrayType.class)
    private Integer[] locations;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public Integer[] getLocations() {
        return locations;
    }

    public void setLocations(Integer[] locations) {
        this.locations = locations;
    }
}
