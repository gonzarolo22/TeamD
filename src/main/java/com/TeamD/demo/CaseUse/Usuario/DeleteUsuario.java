package com.TeamD.demo.CaseUse.Usuario;

import com.TeamD.demo.Service.UsuarioService;
import org.springframework.stereotype.Component;

@Component
public class DeleteUsuario {
    private UsuarioService usuarioService;

    public DeleteUsuario(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public void eliminar (Integer id){
        usuarioService.delete(id);
    }


}
