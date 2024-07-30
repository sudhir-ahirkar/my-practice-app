package com.practice.test.concept.comparator1;

import java.util.Comparator;

/**
 * Created by sudhir.ahirkar on 11/17/2017.
 */
public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        Integer i1=(Integer) o1;
        Integer i2=(Integer) o2;

        //Descending order
        /*if(i1<i2){
            return 1;
        }else if(i1>i2){
            return -1;
        }else{
           return  0;
        }*/


        //Ascending order
       /* if(i1<i2){
            return -1;
        }else if(i1>i2){
            return 1;
        }else{
            return  0;
        }*/

        //Ascending order
       /* return  i1.compareTo(i2);*/

        //Descending order
         return  -i1.compareTo(i2);
    }
}
