public class CountDays
{
    public static int countDays(int t, int c, int f) {
        int days = 0, read = 0;
	    while (read < t)
	    {
	        read += c - f;
	        days++;
	    }
	    return days;

	    /*if (t % 2 == 0)
	        return t / (c - f);
	    else
	        return t / (c - f) + 1;
	    */
	}
    
	public static void main(String[] args) {
	    CountDays cd = new CountDays();
		System.out.println(cd.countDays(15, 5, 3));
	}
}
