package at.rovo.stemmer;


/**
 * Represents any character in the range from a to z in an English alphabet.
 * <p>
 * Note that this class is abstract and is implemented by {@link Consonant} and {@link Vowel} class which correspond to
 * consonants and vowels in the alphabet depicted
 * <p>
 * Sequences of the same type (e.g. consonants) can be added together using the {@link #add(char)} method.
 *
 * @author Roman Vottner
 */
public abstract class Letter
{
	protected String letter;

	/**
	 * Initializes a new instance of a letter with the provided character as starting letter.
	 *
	 * @param letter
	 * 		Character this letter should start with
	 */
	protected Letter(char letter)
	{
		this.letter = "" + letter;
	}

	/**
	 * Returns all characters of this sequence.
	 *
	 * @return All characters of this sequence
	 */
	public String getLetter()
	{
		return this.letter;
	}

	/**
	 * Adds a character to the letter-sequence.
	 *
	 * @param c
	 * 		The character to add
	 */
	public void add(char c)
	{
		this.letter += c;
	}

}
