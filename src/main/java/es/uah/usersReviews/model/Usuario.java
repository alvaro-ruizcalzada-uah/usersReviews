package es.uah.usersReviews.model;

import lombok.Data;
import org.hibernate.Hibernate;

import jakarta.persistence.*;
import java.util.List;
import java.util.Objects;

@Data
@Entity
@Table(name = "Users", schema = "usuariosdbsec")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario", nullable = false)
    private Integer idUsuario;

    @Column(name = "username", nullable = false, length = 45)
    private String nombre;

    @Column(name = "password", nullable = false, length = 60)
    private String clave;

    @Column(name = "correo", nullable = false, length = 45)
    private String correo;

    @Column(name = "enable", nullable = false)
    private Boolean enable = false;

    @OneToMany(mappedBy = "user", cascade = {CascadeType.ALL}, orphanRemoval = true)
    private List<Review> reviews;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Users_has_Authorities", joinColumns = {
            @JoinColumn(name = "Users_idUsuario", referencedColumnName = "idUsuario")}, inverseJoinColumns = {
            @JoinColumn(name = "Authorities_idRol", referencedColumnName = "idRol")})
    private List<Rol> roles;

    public void addReview(Review review) {
        getReviews().add(review);
        review.setUser(this);
    }

    public void removeReview(Review review) {
        if (review != null) {
            getReviews().remove(review);
        }
    }

}