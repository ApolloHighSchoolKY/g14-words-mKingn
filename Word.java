import java.util.List;
import java.util.ArrayList;

public class Word
{
	private String word;
	private static final String VOWELS = "AEIOUaeiou";   //static means only one


	public Word()
	{
		word = "";
	}

	public Word(String newWord)
	{
		setWord(word);
	}

	public void setWord(String newWord)
	{
		word = newWord;
	}

	public int getNumVowels()
	{
		String letter = "";
		int count = 0;

		for(int i =0; i <word.length(); i++ )
		{
			letter = word.substring(i,i+1);
		//Loop for every letter in "word"
			if (VOWELS.indexOf(letter) == -1 );
			//Use indexOf to see if the letter is in the string "vowels"
		}

		return count;
	}

	public int getLength()
	{
		return word.length();
		
	}

	public String toString()
	{
	   return word;
	}
}