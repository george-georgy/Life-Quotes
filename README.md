# Life Quotes 

Life Quotes is a project to showcase different architectural approaches to developing Android apps implements different architecture, with MVC and MVP architecture pattern.


# Application

The application is a basic quote app. That uses [Quotes API](https://type.fit/api/quotes) to get a list of
quotes.

This repository hosts MVP in main branch and MVC in separated architecture . For more information, see the `README.md` file in each branch.

|     Branch     | Description |
| ------------- | ------------- | 
| [main](https://github.com/george-georgy/Life-Quotes/) | implements Model View Presenter (MVP) with Retrofit and Viewbinding.  |
| [mvc](https://github.com/george-georgy/Life-Quotes/tree/mvc) | implements Model View Controller (MVC) with Retrofit and Viewbinding. |


# Architecture


This sample is written in MVP for Life Quotes app.
Project is a MVP (Model View Presenter) architecture pattern.


* MVP's goal is moving the Controller out of the Activity into its own class so that the Controller can be unit testable is MVP, and is consists of these parts: 

* Model consists of the data objects.

* View displays the UI and listens to user actions.This is typically an Activity (or Fragment). 

* Presenter is the glue class that talks to both the Model and View. Any code that does not directly handle UI should be moved out of the View and into the Presenter class.

<p>
<img src="https://github.com/george-georgy/Life-Quotes/blob/mvp/Screenshots/MVP%20Digram.png" />
</p>

## Screenshots

<p>
<img src="https://github.com/george-georgy/Life-Quotes/blob/mvp/Screenshots/Screenshot_20220402_185318.png" height=450 width=230 />
<img src="https://github.com/george-georgy/Life-Quotes/blob/mvp/Screenshots/Screenshot_20220402_185350.png" height=450 width=230 />
<img src="https://github.com/george-georgy/Life-Quotes/blob/mvp/Screenshots/Screenshot_20220402_185425.png" height=450 width=230 />
</p>

## Tech-stack 🛠
* [Retrofit](https://square.github.io/retrofit/) - Used for type-safe HTTP client for Android.
* [View Binding](https://developer.android.com/topic/libraries/view-binding) - Allows you to more easily write code that interacts with views.





