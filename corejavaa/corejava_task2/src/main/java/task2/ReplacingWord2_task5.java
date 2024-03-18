package task2;

import java.util.Scanner;
public class ReplacingWord2_task5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	        System.out.println("Enter a sentence:");
	        String sentence = scanner.nextLine();
	        System.out.println("Enter the new first word:");
	        String newFirstWord = scanner.next();

	        // Replace the first word in the sentence
	        String modifiedSentence = replaceFirstWord(sentence, newFirstWord);

	        // Print the modified sentence
	        System.out.println("Modified sentence: " + modifiedSentence);
	      
	        
	    }

	    public static String replaceFirstWord(String sentence, String newFirstWord) {
	        char[] chars = sentence.toCharArray();

	        // Find the index of the first space
	        int index = 0;
	        for (int i = 0; i < chars.length; i++) {
	            if (chars[i] == ' ') {
	                index = i;
	                break;
	            }
	        }

	        // Construct the modified sentence
	        StringBuilder modifiedSentence = new StringBuilder();
	        modifiedSentence.append(newFirstWord).append(sentence.substring(index));

	        return modifiedSentence.toString();
	    }

	   
	
	
	}
	
	


