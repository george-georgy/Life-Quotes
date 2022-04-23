package com.george_georgy.lifequotes;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.george_georgy.lifequotes.databinding.ActivityMainBinding;
import com.george_georgy.lifequotes.model.Quote;
import com.george_georgy.lifequotes.model.QuoteApiClient;

import java.util.List;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    // Activity must hold references to views (binding) so activity act as a view.
    private ActivityMainBinding binding;

    private Quote randomQuote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        /** controller handle user input **/
        binding.randomQuoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getRandomQuote();
            }
        });


    }

    public void getRandomQuote() {
        /** Step One : controller manipulates model **/
        QuoteApiClient.getQuotes().enqueue(new Callback<List<Quote>>() {
            @Override
            public void onResponse(Call<List<Quote>> call, Response<List<Quote>> response) {
                if (response.isSuccessful()) {

                    final int random = new Random().nextInt(response.body().size());

                    /** Step Two : model update controller with response **/
                    randomQuote = response.body().get(random);


                    /** Step Three : Controller update view **/
                    binding.quoteText.setText(randomQuote.getText());
                    binding.authorText.setText(randomQuote.getAuthor());

                }
            }
            @Override
            public void onFailure(Call<List<Quote>> call, Throwable t) {

                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
                Log.d("MainActivity", "onFailure");

            }
        });

    }


}