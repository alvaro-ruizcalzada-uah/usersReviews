package es.uah.usersReviews.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.Hibernate;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Data
@Table(name = "Reviews", schema = "usuariosdbsec")
public class Review {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idReview")
    private Integer idReview;

    @Column(name = "idFilm", nullable = false)
    private Integer idFilm;

    @Column(name = "rating", nullable = false)
    private Integer rating;

    @Column(name = "opinion")
    private String opinion;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "Users_idUsuario", referencedColumnName = "idUsuario", nullable = false)
    @JsonIgnoreProperties("reviews")
    private Usuario user;

}