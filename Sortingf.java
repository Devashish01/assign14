import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sortingf {

	public static void main(String[] args) {
     ArrayList<String> s=new ArrayList<String>();
     System.out.println("Enter names");
     Scanner input=new Scanner(System.in);
     for(int i=0;i<4;i++) {
    	 String g=input.nextLine();
    	 s.add(g);
     }
     Collections.sort(s);
     System.out.println("After sorting");
     System.out.println(s);
     System.out.println("Enter numbers");
     ArrayList<Integer> s1=new ArrayList<Integer>();

     for(int j=0;j<4;j++) {
    	int gg=input.nextInt();
    	 s1.add(gg);
     }
     Collections.sort(s1);
     System.out.println("After sorting");
     System.out.println(s1);
	}

}