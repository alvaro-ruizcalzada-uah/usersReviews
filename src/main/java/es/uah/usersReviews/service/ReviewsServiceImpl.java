package es.uah.usersReviews.service;

import es.uah.usersReviews.dao.IReviewsDAO;
import es.uah.usersReviews.model.Review;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ReviewsServiceImpl implements IReviewsService {

    IReviewsDAO reviewsDAO;

    @Override
    public List<Review> findAll() {
        return reviewsDAO.findAll();
    }

    @Override
    public List<Review> findReviewsByIdFilm(Integer idFilmm) {
        return reviewsDAO.findReviewsByIdFilm(idFilmm);
    }

    @Override
    public Review findReviewById(Integer idReview) {
        return reviewsDAO.findReviewById(idReview);
    }

    @Override
    public void saveReview(Review review) {
        reviewsDAO.saveReview(review);
    }

    @Override
    public void deleteReview(Integer idReview) {
        reviewsDAO.deleteReview(idReview);
    }

}
