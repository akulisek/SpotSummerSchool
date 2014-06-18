import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Anagram {

	public static boolean isAnagram(String str1, String str2) // is string str2 anagram of string str1 ?
	{
		int i;
		char c;
		
		if (str1.length() != str2.length()) // string lengths don't match
			return false;
		
		int str1Array[] = new int[256];  // Arrays of char occurrences for each string //
		int str2Array[] = new int[256];  ////////////////////////////////////////////////
		
		for (i=0;i<str1.length();i++)
		{
		   c = str1.charAt(i);           // get char at certain position
		   c = Character.toLowerCase(c); // if anagram is not case sensitive
		   str1Array[(int)c]++;          // increment # of occurrences
		   //System.out.println("Debug: str1 char:"+c+" #:"+str1Array[(int)c]);  // debug output
		}
		for (i=0;i<str2.length();i++)
		{
		   c = str2.charAt(i);           // get char at certain position
		   c = Character.toLowerCase(c); // if anagram is not case sensitive
		   str2Array[(int)c]++;          // increment # of occurrences
		   //System.out.println("Debug: str2 char:"+c+" #:"+str2Array[(int)c]);  // debug output
		}
		
		for (i=0;i<255;i++)
			if (str1Array[i]!=str2Array[i]) // if number of given char occurrences doesn't match, str2 is not an anagram of str1
				return false;
		
		return true; // str2 is an anagram of str1
	}
	
	
	public static void main(String[] args) throws IOException {
		
	      String mainword;
	      String line;
	      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	      List<String> words = new ArrayList<String>(); // list of words on input
	      
	      System.out.println("Anagram:");
	      mainword = stdin.readLine();  // read the word
	      
	      System.out.println("Set of words:");
	      while((line = stdin.readLine())!= null && !line.equals("")) // read set of words to check
	      {
	    	  words.add(line);
	    	  //System.out.println("line is:"+line+".")  ;  // debug output
	      } 
	      
	      System.out.println("I found these anagrams:"); 
	      for (String s: words) // for every loaded word, check whether it is an anagram 
	      {
	    	  if (isAnagram(mainword,s))
	    		  System.out.print("["+s+"] ");
	      }
	      System.out.println("\nEnd of program");
       }
}
