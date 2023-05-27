package br.es.ufpi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.es.ufpi.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByNomeUsuario(String nomeUsuario);
}
