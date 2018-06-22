public class Generic {
  
  
  public static void main(String args[]) {
   
    Integer[] integera = { 1, 2, 3, 4, 5, 6 };
    Character[] charactera = { 'D' ,'E', 'V', 'A', 'S','H','I','S','H' };
    Double[] doublea = { 7.7, 5.8, 9.2, 5.7, 1.6 };
    

    System.out.println("integer values");
    show(integera); 
    System.out.println("character values");
    show(charactera);
    System.out.println("double values");
    show(doublea); 
    
  } 
  public static <T> void show(T[] inputArray) {
	  
	    for (T print : inputArray)
	      System.out.printf("%s \n", print);

	  }

}
