package es.uah.usersReviews.dao;

import es.uah.usersReviews.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuariosJPA extends JpaRepository<Usuario, Integer> {

    Usuario findByNombre(String name);

    Usuario findByCorreo(String email);

}
