import java.util.Scanner;

public class Main
{
    public static int giveTheLength()
    {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        return length;
    }
    
    public static boolean isRowCorrect(int i)
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num == 1)
            return true;
        return false;
    }
    
    public static boolean isLetterCorrect(int i)
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num == 1)
            return true;
        return false;
    }
    
    public static void printAlphabet(char[][] alph)
    {
        System.out.println("A B C D E");
        System.out.println("F G H I J");
        System.out.println("K L M N O");
        System.out.println("P Q R S T");
        System.out.println("U V W X Y");
    }
    
    public static void itsLaloTime()
    {
        System.out.println("Give me the length of the word.");
		int wordLength = giveTheLength();
		int l = 0; 
		String word = "";
		char[][] alph = new char[5][5];
		char aChar = 'A';
        for (int row = 0; row < alph.length; row++)
        {
            for (int column = 0; column < alph[row].length; column++)
            {
                alph[row][column] = aChar;
                aChar++;
            }
        }   
        
		while (l < wordLength)
		{
		    char c = ' ';
		    for (int i = 0; i < 5; ++i)
		    {
		        printAlphabet(alph);
		        System.out.println("Is the letter in row " + i + "?");
		        if (isRowCorrect(i))
		        {
		            for (int j = 0; j < 5; ++j)
		            {
		                printAlphabet(alph);
		                System.out.println("Is the letter " + alph[i][j] + "?");
		                if (isLetterCorrect(alph[i][j]))
		                {
		                    c = alph[i][j];
		                    break;
		                }
		            }
		            break;
		        }
		    }
		    word += c;
		    l++;
		}
		
		System.out.println("Word is " + word);
    }
    
	public static void main(String[] args) {
		itsLaloTime();
	}
}
