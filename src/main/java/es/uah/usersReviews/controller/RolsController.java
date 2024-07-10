package es.uah.usersReviews.controller;

import es.uah.usersReviews.model.Rol;
import es.uah.usersReviews.service.IRolsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class RolsController {

    private IRolsService rolsService;

    @GetMapping("/rols")
    public List<Rol> findAll() {
        return rolsService.findAll();
    }

    @GetMapping("/rols/{id}")
    public Rol findRolById(@PathVariable("id") Integer idRol) {
        return rolsService.findRolById(idRol);
    }

    @PostMapping("/rols")
    public void saveUser(@RequestBody Rol rol) {
        rolsService.saveRol(rol);
    }

    @DeleteMapping("/rols/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        rolsService.deleteRol(id);
    }

}
