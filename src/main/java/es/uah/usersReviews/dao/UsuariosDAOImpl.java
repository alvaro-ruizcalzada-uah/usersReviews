package es.uah.usersReviews.dao;

import es.uah.usersReviews.model.Usuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Repository
public class UsuariosDAOImpl implements IUsuariosDAO {

    IUsuariosJPA usuariosJPA;

    IReviewsJPA reviewsJPA;

    @Override
    public List<Usuario> findAll() {
        return usuariosJPA.findAll();
    }

    @Override
    public Usuario findUserById(Integer idUsuario) {
        Optional<Usuario> optional = usuariosJPA.findById(idUsuario);
        return optional.orElse(null);
    }

    @Override
    public Usuario findUserByName(String name) {
        Optional<Usuario> optional = Optional.ofNullable(usuariosJPA.findByNombre(name));
        return optional.orElse(null);
    }

    @Override
    public Usuario findUserByEmail(String email) {
        Optional<Usuario> optional = Optional.ofNullable(usuariosJPA.findByCorreo(email));
        return optional.orElse(null);
    }

    @Override
    public Usuario findUserByEmailAndPassword(String email, String password) {
        Optional<Usuario> optional =
                Optional.ofNullable(usuariosJPA.findByCorreoAndClave(email, password));
        return optional.orElse(null);
    }

    @Override
    public void saveUser(Usuario user) {
        usuariosJPA.save(user);
    }

    @Override
    public void deleteUser(Integer idUsuario) {
        usuariosJPA.deleteById(idUsuario);
    }

    @Override
    public void updateUser(Usuario user) {
        usuariosJPA.save(user);
    }

    @Override
    public void removeReview(Integer idUsuario, Integer idReview) {
        Usuario user = findUserById(idUsuario);
        if (user != null) {
            user.removeReview(reviewsJPA.findById(idReview).orElse(null));
        }
        reviewsJPA.deleteById(idReview);
    }

}
