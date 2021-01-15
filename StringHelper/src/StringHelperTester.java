/*
 * 10/16/2019
 * Lab 13
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

public class StringHelperTester {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the String Helper Tester!");
		
		// tests the hasAllUniqueCharacters method
		System.out.println("Testing to see if 'facetiously' has all unique characters...");
		System.out.println(StringHelper.hasAllUniqueCharacters("facetiously"));
		System.out.println("Testing to see if 'bananas' has all unique characters...");
		System.out.println(StringHelper.hasAllUniqueCharacters("bananas"));
		System.out.println("Testing to see if 'uncopyrightable' has all unique characters...");
		System.out.println(StringHelper.hasAllUniqueCharacters("uncopyrightable"));
		// tests a word with a repeating letter but different case (should return false)
		System.out.println("Testing to see if 'Unique' has all unique characters...");
		System.out.println(StringHelper.hasAllUniqueCharacters("Unique"));
		
		// tests the meshStrings method
		System.out.println("Meshing the strings 'harp' and 'fiddle'...");
		System.out.println(StringHelper.meshStrings("harp", "fiddle"));
		System.out.println("Meshing the strings 'pen' and 'apple'...");
		System.out.println(StringHelper.meshStrings("pen", "apple"));
		System.out.println("Meshing the strings 'pen' and 'pineapple'...");
		System.out.println(StringHelper.meshStrings("pen", "pineapple"));
		System.out.println("Meshing the strings 'pen pineapple' and 'apple pen'...");
		System.out.println(StringHelper.meshStrings("pen pineapple", "apple pen"));
		
		// tests the replaceVowelsWithOodle method
		System.out.println("Let's replace this vowels in 'burrito' with 'oodle'");
		System.out.println(StringHelper.replaceVowelsWithOodle("burrito"));
		System.out.println("Let's replace this vowels in 'poodle' with 'oodle'");
		System.out.println(StringHelper.replaceVowelsWithOodle("poodle"));
		// tests a differnt case
		System.out.println("Let's replace this vowels in 'AIOLI' with 'oodle'");
		System.out.println(StringHelper.replaceVowelsWithOodle("AIOLI"));
		
		// tests the weight method
		System.out.println("Let's see how much 'heavy' weighs...");
		System.out.println(StringHelper.weight("heavy"));
		System.out.println("Let's see how much 'light' weighs...");
		System.out.println(StringHelper.weight("light"));
		System.out.println("Let's see how much 'scale' weighs...");
		System.out.println(StringHelper.weight("scale"));
		// tests a different case
		System.out.println("Let's see how much 'WEIGHS' weighs..."); 
		System.out.println(StringHelper.weight("WEIGHS"));
	}

}
