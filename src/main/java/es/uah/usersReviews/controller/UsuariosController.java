package es.uah.usersReviews.controller;

import es.uah.usersReviews.model.Usuario;
import es.uah.usersReviews.service.IUsuariosService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class UsuariosController {

    private IUsuariosService usuariosService;

    @GetMapping("/usuarios")
    public List<Usuario> findAll() {
        return usuariosService.findAll();
    }

    @GetMapping("/usuarios/{id}")
    public Usuario findUserById(@PathVariable("id") Integer idUsuario) {
        return usuariosService.findUserById(idUsuario);
    }

    @GetMapping("/usuarios/email/{email}")
    public Usuario findUserByEmail(@PathVariable("email") String email) {
        return usuariosService.findUserByEmail(email);
    }

    @GetMapping("/usuarios/name/{name}")
    public Usuario findUserByName(@PathVariable("name") String name) {
        return usuariosService.findUserByName(name);
    }

    @PostMapping("/usuarios")
    public void saveUser(@RequestBody Usuario user) {
        usuariosService.saveUser(user);
    }

    @PutMapping("/usuarios")
    public void updateUser(@RequestBody Usuario user) {
        usuariosService.updateUser(user);
    }

    @DeleteMapping("/usuarios/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        usuariosService.deleteUser(id);
    }

}
