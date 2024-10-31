package com.company;

import com.personal.anagram.Anagrams;
import com.personal.challenges.KaprekarsConstant;
import com.personal.challenges.StripURLParams;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

//        int times = new KaprekarsConstant().timesToKaprekar(6621);

//        System.out.println(new KaprekarsConstant().timesToKaprekar(6621));

        String s = "https://edabit.com?a=2&b=2&a=3";

        String result = new StripURLParams().stripUrlParams(s, "c", "b");

        System.out.println(result);

    }
}
