package com.practice.test.coding_test;

import java.util.Arrays;
import java.util.List;

public class CodingSkillPayPalFirst {

    /*
    *
    * The American red cross Inc

The American red cross Incorporation

American red cross Inc

American red cross Incorporation

American red cross.
    *
    * */
    public static void main(String[] args) {


        List<String> lst = Arrays.asList("The American red cross Inc","The American red cross Incorporation",
                "American red cross Inc","American red cross Incorporation", "American red cross.",
                "American red cross Inc Org");

//        String str = "The American red cross Inc";
        String str = "The American red cross Incorporation";


        boolean result = checkStringValidOrNot(str);
        System.out.println("result===>"+result);



/*        System.out.println("checking0 ===>"+str.indexOf("American red cross"));

        System.out.println("checking1 ===>"+str.lastIndexOf("American red cross"));

        String str1 = str.substring(str.indexOf("American red cross"),str.length());
        System.out.println("str1===>"+str1);
       List<String> resultLst = new ArrayList<>();
        for (String st : lst){
            if(st.startsWith("The ")){
                String strSub = st.substring(4,st.length());
                System.out.println("strSub===>"+strSub);
                if(strSub.endsWith(" Inc") || strSub.endsWith(" Incorporation")){
//                    st.substring(0,)
                }

            }


//            if(st.contains("American red cross")){
////                String[] strArr = st.split(" ");
//                String dummyStr = st.toLowerCase();
//                if(dummyStr.startsWith("the") || dummyStr.startsWith("the")
//                && (dummyStr.endsWith("inc") ||  dummyStr.endsWith("incorporation"))){
//                    resultLst.add(st);
//                }
//
//            }

        }*/
//        System.out.println("resultLst===>"+resultLst);

    }

    private static boolean checkStringValidOrNot(String str) {
        boolean result = false;
        String[] strArr = str.split("American red cross");
        for (String st : strArr){
            System.out.println("st===>"+st);
            if(st.startsWith("The")){
                System.out.println("st start with ==>"+st);
            }

            if(st.endsWith("The")){
                System.out.println("st end with ==>"+st);
            }
        }
        if((strArr[0].startsWith("The") || strArr[0].endsWith("The") || strArr[0].startsWith(""))
                || strArr[1].startsWith("Inc")){
            return true;
        }
        return result;
    }
}
