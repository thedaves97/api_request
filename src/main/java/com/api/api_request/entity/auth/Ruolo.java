package com.api.api_request.entity.auth;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import com.api.api_request.enums.RuoloEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "ruolo", schema = "autenticazione")
public class Ruolo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    @NotNull
    @Column(name = "nome_ruolo")
    private RuoloEnum ruoloEnum;

    // @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "utente_ruolo", joinColumns = @JoinColumn(name = "id_ruolo_fk"), inverseJoinColumns = @JoinColumn(name = "id_utente_fk"))
    private Set<Ruolo> ruoli = new HashSet<>();

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setRuoli(Set<Ruolo> ruoli) {
        this.ruoli = ruoli;
    }

    public Set<Ruolo> getRuoli() {
        return ruoli;
    }

    public void setRuoloEnum(RuoloEnum ruoloEnum) {
        this.ruoloEnum = ruoloEnum;
    }

    public RuoloEnum getRuoloEnum() {
        return ruoloEnum;
    }

}
