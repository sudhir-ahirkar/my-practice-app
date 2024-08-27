package com.adidas;


import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*


 * /*

 * Complete a Java stream of strings, converting them into a

 * Map<String, Integer>. The strings represent key-value pairs

 * in the format "key:value”.  Need to ensure that only correctly

 * formatted strings are processed and included in the final map.

 * Please do not use .forEach stream method.

 * Map<String, Integer> result =

 * Stream.of("a:332", "b:42", "c:", "d", "f:2345", "i:-34").

 */
public class ConvertStringToMap {

    public static void main(String[] args) {
        Map<String, Integer> result =
                Stream.of("a:332", "b:42", "c:", "d",
                        "f:2345", "i:-34", "asd:123", ":::")
                        .filter(ele->ele.split(":").length==2)
                        .map(ele->ele.split(":"))
                        .collect(Collectors.toMap(entry->entry[0],entry->Integer.valueOf(entry[1])));
        System.out.println("result====>"+result);
    }
}
