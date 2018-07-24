package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class TestWordCounter {

  // TODO complete this test class

  // TODO declare a reference to the SUT (system under test), i.e., WordCounter
  WordCounter wordcount;

  @Before
  public void setUp() {
    // TODO create the SUT instance
      Map<String, Integer> testMap = new HashMap<String, Integer>();
      wordcount = new WordCounter(testMap);
  }

  @After
  public void tearDown() {
    // TODO set the SUT instance to null
      wordcount = null;
  }

  @Test
  public void testGetCountEmpty() {

    // TODO verify that the SUT initially returns an empty map
      assertTrue(wordcount.getCounts().isEmpty());

  }

  @Test
  public void testGetCountNonEmpty() {

    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
      wordcount.countWords(
              Arrays.asList("hello", "who", "are", "you", "you", "goodbye", "are" ).iterator());
      assertEquals(wordcount.getCount("hi"), 0);
      assertEquals(wordcount.getCount("you"), 2);
      assertEquals(wordcount.getCount("are"), 2);
      assertEquals(wordcount.getCount("no"), 0);
  }


}
