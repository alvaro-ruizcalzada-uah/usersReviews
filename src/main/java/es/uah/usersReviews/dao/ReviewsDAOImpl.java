package es.uah.usersReviews.dao;

import es.uah.usersReviews.model.Review;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Repository
public class ReviewsDAOImpl implements IReviewsDAO {

    IReviewsJPA reviewsJPA;

    @Override
    public List<Review> findAll() {
        return reviewsJPA.findAll();
    }

    @Override
    public List<Review> findReviewsByIdFilm(Integer idFilm) {
        return reviewsJPA.findByIdFilm(idFilm);
    }

    @Override
    public Review findReviewById(Integer idReview) {
        Optional<Review> optional = reviewsJPA.findById(idReview);
        return optional.orElse(null);
    }

    @Override
    public void saveReview(Review review) {
        reviewsJPA.save(review);
    }

    @Override
    public void deleteReview(Integer idReview) {
        reviewsJPA.deleteById(idReview);
    }
}
