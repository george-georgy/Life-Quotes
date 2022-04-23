package com.george_georgy.lifequotes.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


// This class responsible for getting call of quotes.
public  class QuoteApiClient {

    private static final String BASE_URL = "https://type.fit/api/";


    // creating instance of retrofit.
    private static Retrofit retrofit =
            new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

    // creating instance of MovieApiService.
    private static QuoteService quoteApiService = retrofit.create(QuoteService.class);


    // getter Instance of Call<List<Quote>>.
    public static Call<List<Quote>> getQuotes(){
        return quoteApiService.getQuotes();
    }


}
