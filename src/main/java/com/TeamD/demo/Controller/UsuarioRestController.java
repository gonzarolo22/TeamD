package com.TeamD.demo.Controller;

import com.TeamD.demo.CaseUse.Usuario.ListarUsuarios;
import com.TeamD.demo.Entity.Usurious;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usurious")
public class UsuarioRestController {

    private ListarUsuarios listarUsuarios;

    public UsuarioRestController(ListarUsuarios listarUsuarios) {

        this.listarUsuarios = listarUsuarios;
    }

    @GetMapping("/")
    List<Usurious>listar(){
        return listarUsuarios.listar();
    }



}
