package es.uah.usersReviews.service;

import es.uah.usersReviews.model.Rol;

import java.util.List;

public interface IRolsService {

    List<Rol> findAll();

    Rol findRolById(Integer idRol);

    void saveRol(Rol rol);

    void deleteRol(Integer idRol);

}
