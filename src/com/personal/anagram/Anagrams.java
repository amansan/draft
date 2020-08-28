package com.personal.anagram;

import java.util.List;

public class Anagrams {

    public Anagrams(String word, String path) throws Exception {

        TextFileReader l = new TextFileReader();
        AnagramFinder af = new AnagramFinder();

        List<String> words = l.readFile(path);

        words.forEach(w -> System.out.print(w + ", "));

        List<String> anagrams = af.findAnagrams(word, words);

        if(anagrams.isEmpty()){
            System.out.println("\n\nNo anagrams found.");
        } else {

            System.out.println("\n\nAnagrams found:");

            anagrams.forEach(a -> System.out.println(a));
            System.out.println("Number of anagrams found: " + anagrams.size());
        }

    }

}
