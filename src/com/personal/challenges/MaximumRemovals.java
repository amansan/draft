package com.personal.challenges;

import java.util.Arrays;

/**
 * Maximum Removals
 * Given a string, a move is made by either removing the substring "actor" or by removing the substring "intact". Upon removing a substring, a new string is produced, and moves may be made from the new string until no more moves are possible.
 *
 * For example, given the string "inactortact", one can first remove the substring "actor" to get "intact" and then remove the substring "intact" to get the empty string from which point, no more moves are possible.
 *
 * The goal of this challenge is to determine the maximum number of moves that can be made from a starting string. Note that in some situations, more than one move is possible, and not all moves allow for as long of sequences of moves.
 *
 * For example, consider the string "actintactor". One could remove the substring "intact" to get "actor" and then remove "actor" to get to the empty string (2 moves), but removing "actor" from the end produces the substring "actint", from which no more moves are possible.
 *
 * Examples
 * "intactor": intactor" ➞ "int" (1 move)
 * "actorbintact": "actorbintact" ➞ "bintact" ➞ "b" (2 moves)
 * "intor": "intor" has no moves that can be made
 * "intintactactororact": "intintactactororact" ➞ "intintactoract" ➞ "intintact" ➞ "int" (3 moves)
 * Notes
 * All strings are composed of lowercase letters.
 * Strings are between 0 and 1000 characters in length.
 * Time limit: 100 milliseconds.
 */
public class MaximumRemovals {

    public int moves(String s){
        int movesActorFirst = moves(s, "actor");
        int movesIntactFirst = moves(s, "intact");

        return Math.max(movesActorFirst, movesIntactFirst);
    }
    private int moves(String s, String word){

        String[] array = s.split(word, 2);

        if(array.length == 1 && array[0].equals(s)){
            return 0;
        }

        String newS = String.join("", array);

        return array.length - 1 + moves(newS);

    }

}
