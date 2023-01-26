package com.TeamD.demo.CaseUse.Usuario;

import com.TeamD.demo.Entity.Usurious;
import com.TeamD.demo.Service.UsuarioService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListarUsuarios {
    private UsuarioService usuarioService;

    public ListarUsuarios(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public List<Usurious> listar(){
        return usuarioService.getAll();
    }
}
