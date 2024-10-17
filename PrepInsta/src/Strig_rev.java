import java.util.Scanner;

public class Strig_rev {
	public static void main(String[] args) {
		
	
	Scanner sca = new Scanner(System.in);

    System.out.println("give input");
    String n1=sca.nextLine();
    System.out.println("give input");
    String n2=sca.nextLine();
    
    int res =(n1.compareTo(n2));
    
    if(n1==n2)
    {
    	System.out.println("equal");
    }
   
    else if(res>0)
    {
    	System.out.println(res);
    }
    else if(res<0)
    {
    	System.out.println(res);
    }
	
	}

}
