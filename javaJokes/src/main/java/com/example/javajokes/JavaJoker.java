package com.example.javajokes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JavaJoker {

    private final List<String> jokesList = new ArrayList<>();

    public JavaJoker() {

        jokesList.add("There are 10 types of people in the world: those who understand binary, and those who don't.");
        jokesList.add("How many programmers does it take to change a light bulb?\nNone. It's a hardware problem.");
        jokesList.add("A SEO couple had twins. For the first time they were happy with duplicate content.");
        jokesList.add("Why is it that programmers always confuse Halloween with Christmas?\nBecause 31 OCT = 25 DEC");
        jokesList.add("Why do they call it hyper text?\nToo much JAVA.");
        jokesList.add("Why was the JavaScript developer sad? Because he didn't Node how to Express himself");
        jokesList.add("In order to understand recursion you must first understand recursion.");
        jokesList.add("Why do Java developers wear glasses?\nBecause they can't C#");
        jokesList.add("What do you call 8 hobbits?\nA hobbyte");
        jokesList.add("Why did the developer go broke?\nBecause he used up all his cache");
        jokesList.add("Why did the geek add body { padding-top: 1000px; } to his Facebook profile?\nHe wanted to keep a low profile.");
        jokesList.add("An SEO expert walks into a bar, bars, pub, tavern, public house, Irish pub, drinks, beer, alcohol");
        jokesList.add("I would tell you a UDP joke, but you might not get it.");
        jokesList.add("8 bytes walk into a bar, the bartenders asks \"What will it be?\"\nOne of them says,\n\"Make us a double.\"");
        jokesList.add("Two bytes meet. The first byte asks, \"Are you ill?\" The second byte replies, \"No, just feeling a bit off.\"");
        jokesList.add("These two strings walk into a bar and sit down. The bartender says,\n\"So what'll it be?\"\n" +
                "The first string says,\n\"I think I'll have a beer quag fulk boorg jdk^CjfdLk jk3s d#f67howe%^U" +
                "r89nvy~~owmc63^Dz x.xvcu\" \n\"Please excuse my friend,\" the second string says,\n\"He isn't null-terminated.\"");
        jokesList.add("\"Knock, knock. Who's there?\" very long pause... \"Java.\"");
        jokesList.add("If you put a million monkeys on a million keyboards, one of them will eventually write a Java program.\n"
                + "The rest of them will write Perl programs.");
        jokesList.add("There's a band called 1023MB. They haven't had any gigs yet.");
        jokesList.add("There are only two hard things in computer science: cache invalidation, naming things, and off-by-one errors.");
    }

    public String getJoke() {
        Random random = new Random();
        int jokeNumber = random.nextInt(jokesList.size());
        return jokesList.get(jokeNumber);
    }


}
