package comparablee;
import java.util.*;
public class Student {

	
	public static void main(String[] args) {
		ArrayList<Sample>list=new ArrayList();
		
		list.add(new Sample(121,"shohan",20));
		list.add(new Sample(120,"Mamun",35));
		list.add(new Sample(156,"siyam",11));
		
		Collections.sort(list);
		Iterator<Sample>c=list.iterator();
		while(c.hasNext()) {
			Sample st=c.next();
			System.out.println(st.roll+" "+st.name+" "+st.age );
		}
		
		

	}

}
