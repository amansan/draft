package com.company;

import com.personal.anagram.Anagrams;
import com.personal.challenges.BellNumbers;
import com.personal.challenges.KaprekarsConstant;
import com.personal.challenges.MaximumRemovals;
import com.personal.challenges.StripURLParams;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

//        int times = new KaprekarsConstant().timesToKaprekar(6621);
//        System.out.println(new KaprekarsConstant().timesToKaprekar(6621));
//        String s = "https://edabit.com?a=2&b=2&a=3";
//        String result = new StripURLParams().stripUrlParams(s, "c", "b");
//        System.out.println(result);

//        BellNumbers b = new BellNumbers();
//        System.out.println(b.bellNumber(5));
//        System.out.println("\n\n");
//        System.out.println(b.bellNumberAlternative(5));


        long start = System.currentTimeMillis();

        MaximumRemovals vr = new MaximumRemovals();
        int m = vr.moves("intintactactororact");

        long end = System.currentTimeMillis();

        System.out.println(m + "\nTempo: " + (end - start));
    }
}
