package dev.thisal.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies") //collection of the movies in database
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id //System will know this is the unique ID
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference //this will save the ids of reviews on the movies collection and another collection to store reviews
    private List<Review> reviewIds; //imported reviews from another class
}
