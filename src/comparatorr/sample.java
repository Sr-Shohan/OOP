package comparatorr;
import java.util.*;
public class sample    {

	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList();
		list.add(new Student (101,23,"siyam"));
		list.add(new Student(99,21,"Shohan"));
		list.add(new Student(103,25,"Mamun"));
		
		System.out.println("Sorted by age");
		
		
		Collections.sort(list,new AgeComparator());
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			Student st=(Student)itr.next();
			System.out.println(st.roll+" "+st.name+" "+st.age);
		}
		
		
		
	}

}
  