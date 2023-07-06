package com.george_georgy.lifequotes.presenter;


import android.util.Log;


import com.george_georgy.lifequotes.model.Quote;
import com.george_georgy.lifequotes.model.QuoteApiClient;
import com.george_georgy.lifequotes.view.IMainView;

import java.util.List;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


// presenter does not know about view
public class QuotePresenter {

    // presenter knows about IMainView.
    private IMainView iMainView;

    // reference to hold returned value from model.
    private Quote randomQuote;


    // constructor
    public QuotePresenter(IMainView iMainView) {
        this.iMainView = iMainView;
    }


    // getting quote from model
    public void getQuotes() {

        /** Step Two : Presenter fetch data from model  **/
          QuoteApiClient.getQuotes().enqueue(new Callback<List<Quote>>() {
            @Override
            public void onResponse(Call<List<Quote>> call, Response<List<Quote>> response) {

                // get size of the list
                int sizeOfList = response.body().size();

                // random number
                final int random = new Random().nextInt(sizeOfList);

                /** Step Three : Model return data to Presenter **/
                randomQuote = response.body().get(random);
                iMainView.onGetQuoteSuccess(randomQuote);
            }

            @Override
            public void onFailure(Call<List<Quote>> call, Throwable t) {

                Log.d("MainActivity", "onFailure " + t.getMessage());


            }
        });


    }








}
