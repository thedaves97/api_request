package com.api.api_request.security;

import com.api.api_request.entity.auth.Utente;
import com.api.api_request.service.UtenteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UtenteService utenteService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Utente utente = utenteService.findbyEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("email not found"));
        return UtentePrincipalFactory.build(utente);
    }
}
