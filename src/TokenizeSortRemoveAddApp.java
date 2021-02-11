import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TokenizeSortRemoveAddApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence ="The big black bear and the big black dog ran down the road";
		
		ArrayList<String> tokenizedSentence = new ArrayList<String>();
		
		tokenizedSentence = tokenizeSentence(sentence);
		
		printArrayList(tokenizedSentence);
		
		
		
		

	}

	private static void printArrayList(ArrayList<String> tokenizedSentence) {
		System.out.println("outputed tokenized sentence:  " +  tokenizedSentence);
	}

	private static ArrayList<String> tokenizeSentence(String sentence) {
		// TODO Auto-generated method stub
		ArrayList<String> list =new ArrayList<String>();
		
		Collections.addAll(list, sentence.split(" "));  //If students don't know Collections, they can add each element in a loop to the ArrayList.
		//System.out.println("temp outputing of tokenized list" + list);
		

		return  list;
	}

}
