import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Words
{
	private ArrayList<Word> wordList;

	public Words()
	{

	}

	public Words(String s)
	{

	}

	public void setWords(String s)
	{
		//Create a Scanner for the list of words in the string "s"


		//Continue to loop while there are more words to read

			//Add objects of the type Word to our ArrayList "wordList"


	}

	public int countWordsWithXChars(int size)
	{
		int count=0;

		//for every Word in the ArrayList "wordList"

			//if the length of the "theWord" is the same as the parameter "size"
			for(int i : wordList)
			{
				if(wordList[i].length == size);
					count++;
			}

		return count;
	}

	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		int vowelCount = 0;

		//for each Word in the ArrayList "words" loop

			//if the Word has "size" characters


		return vowelCount;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;

		//for every Word in the ArrayList "words"

			//if the number of vowels in "theWord" is the same as the parameter "numVowels"
			for(int i: wordList)
			{
				if(wordList[i].getNumVowels == numVowels);
					count++;
			}

		return count;
	}

	public String toString()
	{
	   return "";
	}
}