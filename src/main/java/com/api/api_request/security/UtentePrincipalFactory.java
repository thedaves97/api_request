package com.api.api_request.security;

import java.util.List;
import java.util.stream.Collectors;

import com.api.api_request.entity.auth.Utente;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class UtentePrincipalFactory {
    public static UtentePrincipal build(Utente utente) {
        List<GrantedAuthority> authorities = utente.getRuoli().stream()
                .map(rol -> new SimpleGrantedAuthority(rol.getRuoloEnum().name())).collect(Collectors.toList());
        return new UtentePrincipal(utente.getEmail(), utente.getPassword(), authorities);
    }

}
