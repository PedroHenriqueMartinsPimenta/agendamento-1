package br.com.israel.eeep.agendamento.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.israel.eeep.agendamento.model.Equipamento;
import br.com.israel.eeep.agendamento.repository.EquipamentoRepository;




@RestController
@RequestMapping("/agendamento/cadastro/equipamento")
public class EquipamentoController {
    @Autowired
    private EquipamentoRepository equipamentoRepository;

    @GetMapping(produces="application/json")
    public @ResponseBody Iterable<Equipamento> listaUsuarios(){
        Iterable<Equipamento> listaUsuarios = equipamentoRepository.findAll();
        return listaUsuarios;
    }

    @PostMapping
    public Equipamento cadastroUsuario(@RequestBody @Valid Equipamento equipamento){
        return equipamentoRepository.save(equipamento);
    }

    @DeleteMapping
    public Equipamento deletarUsuario(@RequestBody Equipamento equipamento){
        equipamentoRepository.delete(equipamento);
        return equipamento;
    }
}
