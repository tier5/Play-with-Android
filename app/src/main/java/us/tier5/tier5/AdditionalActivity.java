package us.tier5.tier5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.button;

public class AdditionalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_additional);
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        //startActivity(intent);
        String received_string = getIntent().getStringExtra("name");
        int received_rating = getIntent().getIntExtra("rating", 0);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        TextView textView = (TextView) findViewById(R.id.textView);
        ratingBar.setRating(received_rating);
        textView.setText(received_string);
        Button back = (Button) findViewById(R.id.back_to_activity);
        back.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
