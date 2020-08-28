package com.personal.anagram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TextFileReader {

    public List<String> readFile(String path) throws Exception {
        List<String> wordList = new ArrayList<>();

        File file = new File(path);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String word;
        while ((word = br.readLine()) != null) {
            wordList.add(word);
        }

        return wordList;
    }
}
