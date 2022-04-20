package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App1
{
    public static void main( String[] args )
    {

        int[] numbers = new int[] {1,1,1,1,1,2,2,2,2,4,4,4};
        int target = 4;
        int [] result = getTwoSum(numbers, target);
        System.out.println(result[0] + " " + result[1]);

        Map<Integer, Integer> map = getDuplicates(numbers);




//        for (int i = 0; i <= map.keySet().size(); i++){
//            System.out.println(i + " " + map.get(i));
//        }
//        Set<Integer> array = (map.keySet());
//        System.out.println(array.size());

        for (Map.Entry<Integer, Integer> entry:
             map.entrySet()) {
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }

        System.out.println(map.entrySet());

//
    }

    public static Map<Integer, Integer> getDuplicates(int[] numbers){
        Map<Integer, Integer> duplicateNumbers = new HashMap<>();
        for (int i = 0; i < numbers.length; i++){
            if(duplicateNumbers.containsKey(numbers[i])){
                duplicateNumbers.put(numbers[i], duplicateNumbers.get(numbers[i]) + 1);
            }
            else {
                duplicateNumbers.put(numbers[i], 1);
            }
        }
        return duplicateNumbers;
    }

    public static int[] getTwoSum(int[] numbers, int target){
        Map<Integer, Integer> visitedNumbers = new HashMap<>();
        for (int i = 0; i < numbers.length; i++){
            int delta = target - numbers[i];
            if(visitedNumbers.containsKey(delta)){
                return new int[] {i, visitedNumbers.get(delta)};
            }
            visitedNumbers.put(numbers[i], i);
        }
        return new int[] {-1,-1};
    }
}
