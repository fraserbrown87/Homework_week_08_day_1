package com.example.codeclan.wordcounter;

/**
 * Created by fraserbrown on 18/12/2017.
 */

public class WordCounter {

    String words;

    public WordCounter(String words){
        this.words = words;
    }

    public int countAnswer(){

        String[] result = words.split(" ");
        return result.length;

    }


}
