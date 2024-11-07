package meth;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exception {

	public static void main(String[] args) {
	try { 
		PrintWriter p=new PrintWriter("C:\\Users\\mailt\\OneDrive\\Documents\\Desktop\\Shakthi\\output.txt");
		p.println("Pentagon space");
		p.close();
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
System.out.println("terminated sucessfully..");
	}

}
