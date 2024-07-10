package es.uah.usersReviews.service;

import es.uah.usersReviews.model.Review;

import java.util.List;

public interface IReviewsService {

    List<Review> findAll();

    List<Review> findReviewsByIdFilm(Integer idFilmm);

    Review findReviewById(Integer idReview);

    void saveReview(Review review);

    void deleteReview(Integer idReview);

}
