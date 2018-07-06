## Gradle for Android and Java Final Project
Created as a part of [Udacity's Android Developer Nanodegree Program](https://www.udacity.com/course/android-developer-nanodegree-by-google--nd801).

Description (taken from rubric):

* Project contains a Java library for supplying jokes
* Project contains an Android library with an activity that displays jokes passed to it as intent extras.
* Project contains a Google Cloud Endpoints module that supplies jokes from the Java library. Project loads jokes from GCE module via an async task.
* Project contains connected tests to verify that the async task is indeed loading jokes.
* Project contains paid/free flavors. The paid flavor has no ads, and no unnecessary dependencies.
* The free app variant displays an interstitial ad between the main activity and the joke-displaying activity.
* The app displays a loading indicator while the joke is being fetched from the server.
* A custom Gradle task is added which starts the GCE dev server, runs the Android test, and shuts down the dev server.
