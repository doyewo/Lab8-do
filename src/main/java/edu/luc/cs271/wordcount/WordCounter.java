package edu.luc.cs271.wordcount;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/** A map-based class for counting word frequencies from an iterator. */
public class WordCounter {

  /** The map for storing the word counts. */
  private final Map<String, Integer> theMap;

  /** Creates a word counter instance based on the given map. */
  public WordCounter(final Map<String, Integer> theMap) {

    // TODO
    this.theMap = theMap;

  }

  /** Counts the frequencies of all words in the given iterator. */
  public void countWords(final Iterator<String> words) {

    // TODO for each word in the iterator, update the corresponding frequency in the map
    // HINT to do this without a conditional, use the getOrDefault method
    int wordCount = 0;
    while (words.hasNext()) {
      String text = words.next();
      if (theMap.containsKey(text)) {
        wordCount = theMap.get(text);

        theMap.put(text, wordCount = wordCount + 1);

      } else {
        theMap.put(text, 1);
      }
    }
  }
  /** Retrieve the frequency of a particular word. */
  public int getCount(final String word) {

    // TODO
    int counter = 0;
    if (theMap.containsKey(word)) {
      counter = theMap.get(word);
      theMap.put(word, counter);
    } else theMap.put(word, 0);
    return counter;
  }

  /** Retrieve the map representing all word frequencies. */
  public Map<String, Integer> getCounts() {
    return Collections.unmodifiableMap(theMap);
  }
}
