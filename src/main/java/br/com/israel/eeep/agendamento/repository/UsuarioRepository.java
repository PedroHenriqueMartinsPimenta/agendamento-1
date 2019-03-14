package br.com.israel.eeep.agendamento.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.israel.eeep.agendamento.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	List<Usuario> findByLogin(Usuario usuario);
}
