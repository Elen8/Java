public class AreaOfStrips
{
    public static int countAreaOfStrips(int n, int w) {
        int area = 0;
	    /*for (int height = n; height >= 1; height--)
	    {
	        int stripArea = height * w;
	        area += stripArea;
	    }*/
	    area = w * n * (1 + n) / 2;
	    
	    return area;
	}
    
	public static void main(String[] args) {
	    AreaOfStrips as = new AreaOfStrips();
		System.out.println(as.countAreaOfStrips(5, 2));
	}
}
