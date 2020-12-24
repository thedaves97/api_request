package com.api.api_request.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="bevanda")
public class Bevanda
{
    @ManyToMany
    @JoinTable(name = "menu", joinColumns = @JoinColumn(name = "id_locale"), inverseJoinColumns = @JoinColumn(name = "id_bevanda"))
    private Set<Bevanda> bevande = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="type")
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
