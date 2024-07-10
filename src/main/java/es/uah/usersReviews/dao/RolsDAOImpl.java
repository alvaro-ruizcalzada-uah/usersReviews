package es.uah.usersReviews.dao;

import es.uah.usersReviews.model.Rol;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Repository
public class RolsDAOImpl implements IRolsDAO{

    private IRolsJPA rolsJPA;

    @Override
    public List<Rol> findAll() {
        return rolsJPA.findAll();
    }

    @Override
    public Rol findRolById(Integer idRol) {
        Optional<Rol> optional = rolsJPA.findById(idRol);
        return optional.orElse(null);
    }

    @Override
    public void saveRol(Rol rol) {
        rolsJPA.save(rol);
    }

    @Override
    public void deleteRol(Integer idRol) {
        rolsJPA.deleteById(idRol);
    }
}
