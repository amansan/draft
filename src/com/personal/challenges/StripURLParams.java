package com.personal.challenges;

import java.util.*;

/**
 * Strip URL Query Parameters
 * Create a function that takes a URL (string), removes duplicate query parameters and parameters specified within the 2nd argument (which will be an optional array).
 *
 * Examples
 * stripUrlParams("https://edabit.com?a=1&b=2&a=2") ➞ "https://edabit.com?a=2&b=2"
 *
 * stripUrlParams("https://edabit.com?a=1&b=2&a=2", ["b"]) ➞ "https://edabit.com?a=2"
 *
 * stripUrlParams("https://edabit.com", ["b"]) ➞ "https://edabit.com"
 * Notes
 * The 2nd argument paramsToStrip is optional.
 * paramsToStrip can contain multiple params.
 * If there are duplicate query parameters with different values, use the value of the last occurring parameter (see examples #1 and #2 above).
 */
public class StripURLParams {

    public String stripUrlParams(String url){
        return stripUrlParams(url, null);
    }

    public String stripUrlParams(String url, String[] paramsToStrip){

        String stringParams = url.substring(url.indexOf('?')+1);

        String[] params = stringParams.split("&");

        return removeDuplicatedParam(params, paramsToStrip);
    }


    public String removeDuplicatedParam(String[] params, String[] paramsToStrip){
        Map<String, String> paramSet = new HashMap<String, String>();

        //Put the params in a map
        for(String p: params){
            String k = p.substring(0,1);
            String v = p.substring(2);

            paramSet.put(k, v);
        }

        for(String keyToBeRemoved: paramsToStrip){
            paramSet.remove(keyToBeRemoved);
        }

        return paramSet.toString();

    }
}
