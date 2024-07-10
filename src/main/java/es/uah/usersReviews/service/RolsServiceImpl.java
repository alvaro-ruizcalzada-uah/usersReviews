package es.uah.usersReviews.service;

import es.uah.usersReviews.dao.IRolsDAO;
import es.uah.usersReviews.model.Rol;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class RolsServiceImpl implements IRolsService {

    private IRolsDAO rolsDAO;

    @Override
    public List<Rol> findAll() {
        return rolsDAO.findAll();
    }

    @Override
    public Rol findRolById(Integer idRol) {
        return rolsDAO.findRolById(idRol);
    }

    @Override
    public void saveRol(Rol rol) {
        rolsDAO.saveRol(rol);
    }

    @Override
    public void deleteRol(Integer idRol) {
        rolsDAO.deleteRol(idRol);
    }

}
