

public class BinomialCoefficient
{
    static int factorial(int n)
    { 
        if (n == 1 || n == 0)
            return 1;
        return n * factorial(n - 1);
    }
    
	public static void main(String[] args) {
	    int n = 7, k = 3;
	    int C = factorial(n) / (factorial(k) * factorial(n - k));
        System.out.println(C);
	}
}

//O(n)
