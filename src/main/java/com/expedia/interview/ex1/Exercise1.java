
package com.algorithm.offer;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Exercise1 {

    String timeInWords(int h, int m) {
        String[] num = {"one","two","three","four","five","six","seven","eight","nine","ten",
                "eleven","twelve","thirteen","fourteen","quarter","sixteen","seventeen","eighteen","nineteen","twenty",
                "twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine","half"};
        if(m == 0){
            return num[h-1] + " o'clock";
        }else if(m>0 && m<31){
            if(m == 15 || m==30){
                return num[m-1] +" past " +num[h-1];
            }else if(m==1){
                return num[m-1]+" minute past " +num[h-1];
            }else{
                return num[m-1]+" minutes past " +num[h-1];
            }
        }else{
            int index = 60 - m;
            if(index == 15){
                return num[index-1] + " to " +num[h];
            }else{
                return num[index-1] + " minutes to " +num[h];
            }
        }

    }

}
