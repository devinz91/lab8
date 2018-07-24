package edu.luc.cs271.wordcount;

import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");

    // TODO complete this main program
    // 1. create a WordCounter instance
      WordCounter wCounter = new WordCounter(new HashMap<>());
    // 2. use this to count the words in the input
      wCounter.countWords(input);
    // 3. determine the size of the resulting map
      int size = wCounter.getCounts().size();
    // 4. create an ArrayList of that size and
      List<Map.Entry<String, Integer>> MapEntries = new ArrayList<>(size);
    // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>
      MapEntries.addAll(wCounter.getCounts().entrySet());
    // 6. sort the ArrayList in descending order by count
      Collections.sort(MapEntries, new DescendingByCount());
    //    using Collections.sort and an instance of the provided comparator (after fixing the latter)

    // 7. print the (up to) ten most frequent words in the text
      if (wCounter.getCounts().size() < 11) {
          for (int i = 0; i < wCounter.getCounts().size(); i++) {
              System.out.println(MapEntries.get(i));
          }
      } else {
          for (int i = 0; i < 10; i++) {
              System.out.println(MapEntries.get(i));
          }
      }

  }
}
