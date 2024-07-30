package com.practice.test.coding_test.other;

public class CodingSkill {

    Integer a = 0;
    Integer b = 10;




    public static void main(String[] args) {
/*        String str = "a b c b d";
        Map<Character,Long> mapCharFreq =
                str.chars()
                .mapToObj(ele->(char)ele)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("mapCharFreq=====>"+mapCharFreq);
        // O(n)


        Runnable n = ()->{


        };*/

        int[] arr = {1,2,4,58,};
        int[] arr1 = {1,2,4,58,};

        /// arr = 5 arr1 6

        // o/p: 5,6,45

        int count  = 0;
        int sum = 0;
        for (int num : arr){
            sum+=num;
            count++;
        }
        int average = sum/count;


    }
}
