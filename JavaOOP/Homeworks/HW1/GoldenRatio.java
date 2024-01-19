import java.lang.Math;
public class GoldenRatio
{
    public static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
    
    public static double countGoldenRatio(int Fn, int Fn_1) {
        return (double)Fn/Fn_1;
	}
    
	public static void main(String[] args) {
	    GoldenRatio gr = new GoldenRatio();
	    int n = 11;
		System.out.println(gr.countGoldenRatio(fib(n), fib(n - 1)));
		System.out.println((1 + Math.sqrt(5))/2); //golden ratio

	}
}
