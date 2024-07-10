package es.uah.usersReviews.dao;

import es.uah.usersReviews.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRolsJPA extends JpaRepository<Rol, Integer> {

}
