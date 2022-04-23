package com.george_georgy.lifequotes.view;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.george_georgy.lifequotes.databinding.ActivityMainBinding;
import com.george_georgy.lifequotes.model.Quote;
import com.george_georgy.lifequotes.presenter.QuotePresenter;


public class MainActivity extends AppCompatActivity implements IMainView {

    private ActivityMainBinding binding;
    private QuotePresenter quotePresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        // View (Main Activity knows about presenter)
        quotePresenter = new QuotePresenter(this);



        /** Step One : View (MainActivity) informs presenter about user UI event **/
        binding.randomQuoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //  presenter method
                quotePresenter.getQuotes();

            }
        });

    }


    @Override
    public void onGetQuoteSuccess(Quote quote) {
        /** Step Four : IMainView tells View (MainActivity) to update **/
        binding.quoteText.setText(quote.getText());
        binding.authorText.setText(quote.getAuthor());

    }
}