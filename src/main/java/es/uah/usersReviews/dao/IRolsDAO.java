package es.uah.usersReviews.dao;

import es.uah.usersReviews.model.Rol;

import java.util.List;

public interface IRolsDAO {

    List<Rol> findAll();

    Rol findRolById(Integer idRol);

    void saveRol(Rol rol);

    void deleteRol(Integer idRol);

}
