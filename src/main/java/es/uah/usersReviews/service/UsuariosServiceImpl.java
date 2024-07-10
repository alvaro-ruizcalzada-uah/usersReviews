package es.uah.usersReviews.service;

import es.uah.usersReviews.dao.IUsuariosDAO;
import es.uah.usersReviews.model.Usuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UsuariosServiceImpl implements IUsuariosService {

    IUsuariosDAO usuariosDAO;

    @Override
    public List<Usuario> findAll() {
        return usuariosDAO.findAll();
    }

    @Override
    public Usuario findUserByName(String name) {
        return usuariosDAO.findUserByName(name);
    }

    @Override
    public Usuario findUserById(Integer idUsuario) {
        return usuariosDAO.findUserById(idUsuario);
    }

    @Override
    public Usuario findUserByEmail(String email) {
        return usuariosDAO.findUserByEmail(email);
    }

    public Usuario findUserByEmailAndPassword(String email, String password) {
        return usuariosDAO.findUserByEmailAndPassword(email, password);
    }

    @Override
    public void saveUser(Usuario usuario) {
        usuariosDAO.saveUser(usuario);
    }

    @Override
    public void deleteUser(Integer idUsuario) {
        usuariosDAO.deleteUser(idUsuario);
    }

    @Override
    public void updateUser(Usuario usuario) {
        usuariosDAO.updateUser(usuario);
    }

    @Override
    public void removeReview(Integer idUsuario, Integer idMatricula) {
        usuariosDAO.removeReview(idUsuario, idMatricula);
    }

}
