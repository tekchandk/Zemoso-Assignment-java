// Date: 8th July, 2019
// Author: Tek Chand

/*Using TextFile and a Map<Character,Integer>, create a program that takes the file name as a command line argument 
and counts the occurrence of all the different characters. Save the results in a text file.*/


import java.io.*; 

public class IO
{ 

    

	public static void main(String[] args) throws IOException 
	{ 
		File file = new File("/home/zadmin/Assignment-7/input.txt"); 
		FileInputStream fileStream = new FileInputStream(file); 
		InputStreamReader input = new InputStreamReader(fileStream); 
		BufferedReader reader = new BufferedReader(input); 
		
		String line; 
		
		// Initializing counters 
        int countWord = 0; 
        int countInt = 0; 
		int sentenceCount = 0; 
		int characterCount = 0; 
		int paragraphCount = 1; 
		int whitespaceCount = 0; 
		
		// Reading line by line from the 
		// file until a null is returned 
		while((line = reader.readLine()) != null) 
		{ 
			if(line.equals("")) 
			{ 
				paragraphCount++; 
			} 
			if(!(line.equals(""))) 
			{ 
				
                characterCount += line.length(); 
				
				// \\s+ is the space delimiter in java 
				String[] wordList = line.split("\\s+"); 
				
				countWord += wordList.length; 
				whitespaceCount += countWord -1; 
				
				// [!?.:]+ is the sentence delimiter in java 
				String[] sentenceList = line.split("[!?.:]+"); 
				
				sentenceCount += sentenceList.length; 
			} 
		} 
		
		System.out.println("Total word count = " + countWord); 
		System.out.println("Total number of sentences = " + sentenceCount); 
		System.out.println("Total number of characters = " + characterCount); 
		System.out.println("Number of paragraphs = " + paragraphCount); 
		System.out.println("Total number of whitespaces = " + whitespaceCount); 
	} 
} 
