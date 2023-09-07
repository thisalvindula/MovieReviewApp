package dev.thisal.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //we have to create a method to fetching movies by another entity.
    //for getting a movie by ImdbId Because Spring doesn't have a method to get something without objectId.
    //its call DynamicQuery
    Optional<Movie> findMovieByImdbId(String imdbId);
}
