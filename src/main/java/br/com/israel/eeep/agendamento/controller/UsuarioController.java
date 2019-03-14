package br.com.israel.eeep.agendamento.controller;
import br.com.israel.eeep.agendamento.model.Usuario;
import br.com.israel.eeep.agendamento.repository.UsuarioRepository;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/agendamento")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping(produces="application/json")
    public @ResponseBody Iterable<Usuario> listaUsuarios(){
        Iterable<Usuario> listaUsuarios = usuarioRepository.findAll();
        return listaUsuarios;
    }

    @PostMapping
    public Usuario cadastroUsuario(@RequestBody @Valid Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @DeleteMapping
    public Usuario deletarUsuario(@RequestBody Usuario usuario){
        usuarioRepository.delete(usuario);
        return usuario;
    }
}
