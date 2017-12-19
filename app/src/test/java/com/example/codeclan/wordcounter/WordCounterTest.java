package com.example.codeclan.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by fraserbrown on 18/12/2017.
 */

public class WordCounterTest {
    WordCounter wordcounter;

    @Before
    public void before() {
        wordcounter = new WordCounter("code clan");
    }

    @Test
    public void canCountWords(){
        assertEquals(2, wordcounter.countAnswer());

    }
}
