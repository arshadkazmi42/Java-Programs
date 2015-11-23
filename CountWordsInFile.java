import java.io.*;
import java.util.*;

public class CountWordsInFile {

    public static void main (String args[]) throws Exception {
       System.out.println ("Counting Words");       
	   String inputFile = args[0];
       File file = new File(inputFile);
       Scanner in = new Scanner(file);
	   int words = 0;
		while(in.hasNextLine())  {
			String line = in.nextLine();
			words += new StringTokenizer(line, " ,").countTokens();
		}
		System.out.println("Number of words: " + words);
	
    }
}

