import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TokenizeSortRemoveAddApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence ="The big black bear and the big black dog ran down the road";
		
		ArrayList<String> tokenizedSentence = new ArrayList<String>();
		
		tokenizedSentence = tokenizeSentence(sentence); //task one complete for 2 points
		
		printArrayList(tokenizedSentence); //task two complete for 2 points
		
		ArrayList<String > sortedTokenizedSentence = new ArrayList<String>();
		sortedTokenizedSentence = sortTheArrayList(tokenizedSentence); //task three completed for 4 points
		
		printArrayList(sortedTokenizedSentence);
		
		ArrayList<String> listNoDuplicates = new ArrayList<String>();
		
		listNoDuplicates = removeDuplicates(sortedTokenizedSentence);
		
		printArrayList(listNoDuplicates);
		
		//now adding word, but keeping same ArrayList
		
		listNoDuplicates = addWord(listNoDuplicates, "maple");
		listNoDuplicates = addWord(listNoDuplicates, "able");
		listNoDuplicates = addWord(listNoDuplicates, "zebra");
		
		printArrayList(listNoDuplicates);
		
		printAllLists(sentence, tokenizedSentence, sortedTokenizedSentence, listNoDuplicates);

	}

	private static void printAllLists(String sentence, ArrayList<String> tokenizedSentence, ArrayList<String> sortedTokenizedSentence, ArrayList<String> listNoDuplicates) {
		// TODO Auto-generated method stub
		System.out.println("Here is the original sentence, with various task outputs");
		System.out.println("original:  " + sentence);
		System.out.println("Tokenized (split into words: " +  tokenizedSentence);
		System.out.println("Sorted version:  " + sortedTokenizedSentence);
		System.out.println("list with no duplicates and words added:  " + listNoDuplicates);
		

	}

	private static ArrayList<String> addWord(ArrayList<String> list, String string) {
		// TODO Auto-generated method stub
		//compareTo() method is used for comparing two strings lexicographically.
		//if first object is less than second, then return negative
		//ob1.compareTo(obj2)
		//stringA.compareTo( stringB ) returns 0.
		//Memory Aid: think of the strings in a dictionary as arranged from smallest to largest. 
		//Then stringA - stringB would produce a negative values if stringA came before StringB.
		
		for(int i=0;i<list.size();i++) {
			if(!(list.get(i).compareTo(string)<=0)) {
				//System.out.println("looks like " + string + " comes just before  " + list.get(i));
				list.add(i, string);
				break;
			}
			else if(i == list.size()-1){
				//System.out.println(string + " shoudl be put at end");
				list.add(string);
				break;
				
			}
		}
		
		return list;
	}

	private static ArrayList<String> removeDuplicates(ArrayList<String> list) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<list.size();i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i).equals(list.get(j))){
					list.remove(j);
					j--;
				}
			}
		}
		
		return list;
	}

	private static ArrayList<String> sortTheArrayList(ArrayList<String> tokenizedSentence) {
		Collections.sort(tokenizedSentence);
		return tokenizedSentence;
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
