package com.adidas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistConceptRegardsRemoving {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

//        removeUsingIndex(numbers); // safe remove and no concurrent modification exception
//        System.out.println("numbers====>"+numbers); // [2,4]
//        removeUsingIterator(numbers); // safe remove and no concurrent modification exception
//        System.out.println("numbers====>"+numbers); // [2,4]
        removeUsingObject(numbers); // not safe and throw concurrent modification exceptions
        System.out.println("numbers====>"+numbers); // java.util.ConcurrentModificationException

    }

    // This will throw ConcurrentModificationException
    private static void removeUsingObject(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                numbers.remove(number);  // Unsafe removal
            }
        }
        System.out.println("List after removing odd elements: " + numbers);
    }


    private static void removeUsingIterator(List<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 != 0) {
                iterator.remove();  // Safe removal
            }
        }
    }

    private static void removeUsingIndex(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                numbers.remove(i);
                i--;  // Decrement the index to account for the shift
            }
        }

        System.out.println("List after removing odd elements: " + numbers);
    }
}
