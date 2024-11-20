package com.workout.dayToDay;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacterStreams {
	
	public static void main(String[] args) {
		        String input = "hello world";
		        findDuplicateCharacters(input);
		    }

		    public static void findDuplicateCharacters(String input) {
		        // Convert the input string to lowercase (if case-insensitive comparison is needed)
		        input = input.toLowerCase();

		        // Create a Map<Character, Long> where characters are keys and counts are values
		        Map<Character, Long> charCountMap = input.chars()
		                .mapToObj(c -> (char) c)
		                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		        System.out.println(charCountMap);
		        // Filter the map to find characters occurring more than once
		        charCountMap.entrySet()
		                .stream()
		                .filter(entry -> entry.getValue() > 1)
		                .forEach(entry -> System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue()));
		    }
		

}


