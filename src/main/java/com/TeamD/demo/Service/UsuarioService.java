package com.TeamD.demo.Service;

import com.TeamD.demo.Entity.Usurious;
import com.TeamD.demo.Repository.UsuriousRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private UsuriousRepository usuriousRepository;

    public UsuarioService(UsuriousRepository usuriousRepository) {
        this.usuriousRepository = usuriousRepository;
    }

    public List<Usurious>getAll(){
        return usuriousRepository.findAll();
    }

    public void delete(Integer id){
        usuriousRepository.deleteById(id);
    }

    public Usurious create(Usurious nuevo){
        return usuriousRepository.save(nuevo);
    }






}
