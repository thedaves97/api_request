package com.api.api_request.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="menu")
@IdClass(MenuKey.class)
public class Menu implements Serializable {

    @Id
    private int id_locale;
    @Id
    private int id_bevanda;

    @Column(name="price")
    private float price;

    public int getId_locale() {
        return id_locale;
    }

    public void setId_locale(int id_locale) {
        this.id_locale = id_locale;
    }

    public int getId_bevanda() {
        return id_bevanda;
    }

    public void setId_bevanda(int id_bevanda) {
        this.id_bevanda = id_bevanda;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
