package com.practice.test.coding_test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static Boolean canAttendAll(Collection<Seminar> seminars) {
       for (Seminar seminar : seminars){
           System.out.println("seminar.getStart()===>"+seminar.getStart());
           System.out.println("seminar.getStart().compareTo(seminar.getEnd())===>"+seminar.getEnd().compareTo(seminar.getStart()));
           if(!(seminar.getEnd().compareTo(seminar.getStart())>0 &&
                   seminar.getEnd().compareTo(seminar.getStart())!=0)){
               return false;

           }
       }
        return true;
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m");

        ArrayList<Seminar> seminars = new ArrayList<Seminar>();
        seminars.add(new Seminar(sdf.parse("2015-01-13 09:00"), sdf
//                .parse("2015-01-13 16:30")));
                        .parse("2015-01-13 09:30")));

        seminars.add(new Seminar(sdf.parse("2015-01-12 09:30"), sdf
                .parse("2015-01-12 17:00")));
        seminars.add(new Seminar(sdf.parse("2015-01-14 09:10"), sdf
                .parse("2015-01-14 16:30")));

        System.out.println(Main.canAttendAll(seminars));
    }
}

