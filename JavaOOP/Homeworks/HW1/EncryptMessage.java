
public class EncryptedMessage
{
    public static int powerOf(int a, int b)
    {
        if (b == 0) {
            return 1;
        }
        return  a * powerOf(a, b - 1);
    }
    
    public static void encrypt(char[] str, int a, int b) {
        for (int i = 0; i < str.length; ++i)
        {
            if (str[i] != '#')
            {
                str[i] = (char)((str[i] + powerOf(a, b) % 26));
            }
        }
        System.out.println(str);
	}
    
	public static void main(String[] args) {
	    EncryptedMessage em = new EncryptedMessage();
	    int a = 3; //[1, 5] 
	    int b = 2; //[1, 10]
	    char[] str = "abc#bca".toCharArray();
		em.encrypt(str, a, b);
	}
}
