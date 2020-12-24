package com.api.api_request.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "menu")
public class Menu implements Serializable {

    @EmbeddedId
    MenuKey id;

    @ManyToOne
    @MapsId("localeId")
    @JoinColumn(name = "id_locale")
    Locale locale;

    @ManyToOne
    @MapsId("bevandaId")
    @JoinColumn(name = "id_bevanda")
    Bevanda bevanda;

    @Column(name = "price")
    float price;

    public void setBevanda(Bevanda bevanda) {
        this.bevanda = bevanda;
    }

    public void setId(MenuKey id) {
        this.id = id;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Bevanda getBevanda() {
        return bevanda;
    }

    public MenuKey getId() {
        return id;
    }

    public Locale getLocale() {
        return locale;
    }

    public float getPrice() {
        return price;
    }
}
