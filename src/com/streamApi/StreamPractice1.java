package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class StreamPractice1 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);
//        int res = 0;
//        for (int i: values){
//            res = res + i;
//        }
        System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e) -> c+e));
    }
}

