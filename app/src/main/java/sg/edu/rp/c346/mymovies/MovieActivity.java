package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MovieActivity extends AppCompatActivity {

    TextView tvTitle;
    TextView tvGenreandyear;
    TextView tvDescription;
    TextView tvWatched;
    TextView tvtheatre;
    ImageView ivRated;
    RatingBar rbRating;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        ivRated = findViewById(R.id.imageView);
        tvTitle = findViewById(R.id.textViewTitle);
        tvGenreandyear = findViewById(R.id.textViewGenre);
        tvDescription = findViewById(R.id.textViewDescription);
        tvWatched = findViewById(R.id.textViewWatched);
        tvtheatre = findViewById(R.id.textViewTheatre);
        rbRating = findViewById(R.id.ratingBar);

        Intent intentReceived = getIntent();
        movie mov = (movie) intentReceived.getSerializableExtra("MyList");


        tvTitle.setText(mov.getTitle());
        tvGenreandyear.setText(mov.getYear() + " - " + mov.getGenre());
        tvDescription.setText(mov.getDescription());
        tvWatched.setText("Watch on: " + mov.getDateString());
        tvtheatre.setText("In Theatre: " + mov.getIn_theatre());

        rbRating.setNumStars(5);
        rbRating.setRating(mov.getRating());
        rbRating.setIsIndicator(true);

    }
}
