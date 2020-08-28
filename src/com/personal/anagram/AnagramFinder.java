package com.personal.anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramFinder {

    public List<String> findAnagrams(String word, List<String> wordList){
        List<String> anagrams = new ArrayList<>();

        wordList.forEach(w -> {

            if(!(w.trim().equalsIgnoreCase(word))){

                char[] wChar = w.toLowerCase().trim().toCharArray();
                char[] wordChar = word.toLowerCase().toCharArray();

                Arrays.sort(wChar);
                Arrays.sort(wordChar);

                if(Arrays.equals(wChar, wordChar)){
                    anagrams.add((w));
                }
            }
        });

        return anagrams;
    }

}
