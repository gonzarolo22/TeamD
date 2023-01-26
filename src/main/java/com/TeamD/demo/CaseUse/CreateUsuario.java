package com.TeamD.demo.CaseUse;

import com.TeamD.demo.Entity.Usurious;
import com.TeamD.demo.Service.UsuarioService;
import org.springframework.stereotype.Component;

@Component
public class CreateUsuario {
    private UsuarioService usuarioService;

    public CreateUsuario(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public Usurious crear(Usurious nuevo){
        return usuarioService.create(nuevo);
    }

}
