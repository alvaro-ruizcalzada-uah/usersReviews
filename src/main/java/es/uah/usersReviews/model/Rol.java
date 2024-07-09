package es.uah.usersReviews.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Authorities", schema = "usuariosdbsec")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRol", nullable = false)
    private Integer id;

    @Column(name = "authority", nullable = false, length = 45)
    private String authority;
}