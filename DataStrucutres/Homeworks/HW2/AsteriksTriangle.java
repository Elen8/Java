
public class AsteriksTriangle
{
    static void print_space(int space)
    {
        if (space == 0) 
            return;
            
        System.out.print(" ");
        print_space(space - 1);
    }
    
    static void print_asterisk(int asterisk)
    {
        if (asterisk == 0)
            return;
            
        System.out.print("*");
        print_asterisk(asterisk - 1);
    }
    
    public static void makeTriangle(int n1, int n2)
    {
        if (n1 == 0)
            return;
        print_space(n1 - 1);
        print_asterisk(n2 - n1 + 1);
        System.out.println();
        makeTriangle(n1 - 1, n2);
    }
    
	public static void main(String[] args) {
	    int n = 6;
	    makeTriangle(n, n);
		System.out.println();
	}
}

//O(n^2)
