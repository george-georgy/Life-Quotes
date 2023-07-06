package com.george_georgy.lifequotes.view;

import com.george_georgy.lifequotes.model.Quote;


// MainActivity(View) implement this interface.
// Presenter knows about this interface.


import com.george_georgy.lifequotes.model.Quote;

public interface IMainView {

     void onGetQuoteSuccess(Quote quote);


}
