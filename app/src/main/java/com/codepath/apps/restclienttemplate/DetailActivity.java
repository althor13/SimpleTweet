package com.codepath.apps.restclienttemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.codepath.apps.restclienttemplate.models.Tweet;

import org.parceler.Parcels;

public class DetailActivity extends AppCompatActivity {

    TextView textView;
    TextView tvName;
    TextView tvHandle;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textView = findViewById(R.id.textView);
        tvName = findViewById(R.id.tvName);
        tvHandle = findViewById(R.id.tvHandle);
        imageView = findViewById(R.id.imageView);

        Tweet tweet = Parcels.unwrap(getIntent().getParcelableExtra("tweet"));
        textView.setText(tweet.getBody());
        tvName.setText(tweet.user.name);
        tvHandle.setText("@"+tweet.user.screenName + " • "+ tweet.getFormattedTimestamp());
        //Glide.with(context).load(tweet.user.profileImageUrl).into(imageView);

    }
}