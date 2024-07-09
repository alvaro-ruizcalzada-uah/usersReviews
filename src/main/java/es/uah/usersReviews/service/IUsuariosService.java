package es.uah.usersReviews.service;

import es.uah.usersReviews.model.Usuario;

import java.util.List;

public interface IUsuariosService {

    List<Usuario> findAll();

    Usuario findUserById(Integer idUsuario);

    Usuario findUserByName(String name);

    Usuario findUserByEmail(String email);

    void saveUser(Usuario user);

    void deleteUser(Integer idUsuario);

    void updateUser(Usuario user);

    void removeReview(Integer idUsuario, Integer idReview);

}
