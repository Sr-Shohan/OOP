package comparablee;

public class Sample implements Comparable {

	int roll;
	int age;
	String name;
	
	
	Sample(int roll,String name,int age ){
		this.roll=roll;
		this.name=name;
		this.age=age; 
	}
		

	

	@Override
	public int compareTo(Object o) {
		Sample stt=(Sample) o;
		System.out.println();
		
		//return this.age - stt .age;
		
		return stt.age-this.age;
	}
	
}    