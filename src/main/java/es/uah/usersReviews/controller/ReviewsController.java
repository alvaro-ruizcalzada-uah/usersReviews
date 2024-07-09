package es.uah.usersReviews.controller;

import es.uah.usersReviews.model.Review;
import es.uah.usersReviews.service.IReviewsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class ReviewsController {

    private IReviewsService reviewsService;

    @GetMapping("/reviews")
    public List<Review> findAll() {
        return reviewsService.findAll();
    }

    @GetMapping("/reviews/film/{idFilm}")
    public List<Review> findReviewsByIdFilm(@PathVariable("idFilm") Integer idFilm) {
        return reviewsService.findReviewsByIdFilm(idFilm);
    }

    @GetMapping("/reviews/{id}")
    public Review findReviewsById(@PathVariable("id") Integer id) {
        return reviewsService.findReviewsById(id);
    }

    @PostMapping("/reviews")
    public void saveReview(@RequestBody Review review) {
        reviewsService.saveReview(review);
    }

    @DeleteMapping("/reviews/{id}")
    public void deleteReview(@PathVariable("id") Integer id) {
        reviewsService.deleteReview(id);
    }

}
