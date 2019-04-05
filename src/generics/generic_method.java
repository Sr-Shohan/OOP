package generics;

public class generic_method {

  public static <E>void  print(E[] elements){
	for(E e:elements) {
		System.out.println(e);
	}
	System.out.println();
  }
  
  
  public static void main(String[] args) {
	  Integer[] intArray= { 10, 20, 30, 40, 50 };  
	  Character[] charArray= { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };
	  String[] str= {"Shohan","shosh"};
	  
	  System.out.println("Printing interger array");
	  print(intArray);
	  
	  System.out.println("Printing character array");
	  print(charArray);
	  
	  System.out.println("Printing String array");
	  print(str);
	  
	  
  }
  
  
  

}