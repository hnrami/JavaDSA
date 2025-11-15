package com.meybise.basic;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Java_Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		mapSample();
//		case_one_Number();
//		System.out.println("============================================");
//		case_two_Number();
//		System.out.println("============================================");
//		case_three_Number();
//		System.out.println("============================================");
//		case_four_Number();
//		System.out.println("================DuplicateNumber============================");
//		case_five_Number();
//		System.out.println("================distinct-second-case============================");
//		case_six_Number();
		suplierExmple();
		
		predicateExmaple();
		
		consumberExample();
		
		
		System.out.println(lengthOfLongestSubstring("abcabcbb"));;	
		
		
		

	}
	
	public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (map.containsKey(c)) {
                left = Math.max(map.get(c) + 1, left);
            }

            map.put(c, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
	
	private static void consumberExample() {
		
		
		 List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

	        // Consumer to print each name
	        Consumer<String> printName = name -> System.out.println(name);

	        // Apply the consumer to each element in the list
	        names.forEach(printName);
		
	}

	public static void predicateExmaple() {
		
		  // Predicate to check if a number is even
        Predicate<Integer> isEven = number -> number % 2 == 0;

        // Test some numbers
        System.out.println("Is 4 even? " + isEven.test(4)); // true
        System.out.println("Is 7 even? " + isEven.test(7)); // false
	}
	
	public static void suplierExmple() {
		
		 // Supplier that provides a random number
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(100);

        // Get a random number
        Integer randomNumber = randomNumberSupplier.get();
        System.out.println("Random Number: " + randomNumber);
	}
	
	
	public static void case_six_Number() {
		
		  List<Integer> myList = Arrays.asList(12,45,67,34,56,78,78,14,15,17);
		     myList.stream().distinct().forEach(noDuplicateData -> System.out.println(noDuplicateData));

		
		
	}
	public static void case_five_Number() {
		
		
		List<Integer> inputs = List.of(12,45,67,34,56,78,78,78,14,15,17);
		Set<Integer> numberSet = new HashSet<>();
		inputs.stream().filter(n -> !numberSet.add(n)).forEach(System.out::println);
	}
	public static void case_three_Number() {
		
		List<Integer> inputs = List.of(12,45,67,34,56,78,93,14,15,17);
		inputs.stream().map(n -> n +"").filter(n -> n.startsWith("1")).forEach(System.out::println);
		
	}

public static void case_four_Number() {
		
		List<String> inputs = List.of("12","14","35","17");
		inputs.stream().filter(n -> n.startsWith("1")).forEach(System.out::println);
		
	}
	public static void case_one_Number() {
		
		List<Integer> inputs = List.of(5,6,4,7);
		inputs.stream().filter(n -> n%2 != 0 ).forEach(System.out::println);
		
	}

public static void case_two_Number() {
		
		List<Integer> inputs = List.of(5,6,4,7);
		inputs.stream().filter(n -> n%2 == 0 ).forEach(System.out::println);
		
	}
	
	
	public static void  mapSample() {
		
		
		  List<String> teams = List.of("RTI", "LKO", "POI");
		  List<String> upperCaseNames = teams.stream().map(String::toUpperCase).toList();
		  assert List.of("RTI", "LKO", "POI").equals(upperCaseNames);
		  
		  
	}

	
	public static void filterSample() {
		
		
		  List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		  List<Integer> evenNumbers  = numbers.stream().filter(number -> number % 2 == 0).toList();
		  
		  
		  
	}
	
	public static void collectSample() {
		List<String> fruits = List.of("apple", "peach", "banana", "cherry", "banana", "peach");
		Set<String> fruitSet = fruits
	            .stream()
	            .collect(Collectors.toSet());
		
	}
	
	
	
	public static void flatMapsample() {
		
		List<List<String>> shapes = List.of(
	            List.of("triangle", "rectangle", "square"), // sharp forms
	            List.of("circle", "ellipse", "cylinder") // rounded forms
	    );
		
		 List<String> flattenedShapes = shapes
		            .stream()
		            .flatMap(Collection::stream)
		            .toList();	
	}
	
	
}
