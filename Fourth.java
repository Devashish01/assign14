import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
class Student
{
	String name;
	int age,rollno;

	Student( String name1, int age1)
	{
		this.name = name1;
		this.age = age1;
	}
}

class Name implements Comparator
{
	public int compare(Object o1,Object o2){
		Student s1=(Student)o1;
		Student s2=(Student)o2;

		return s1.name.compareTo(s2.name);
	}
}
class Age implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Student s1=(Student)o1;
		Student s2=(Student)o2;

		if(s1.age==s2.age)
		{
		return 0;
		}
		else if(s1.age>s2.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
class Fourth
{
	
	
	
	
	public static void main(String args[]){ 
		Scanner input=new Scanner(System.in);
		ArrayList<Student> arr=new ArrayList<Student>();
		//for(int i=0;i<4;i++)
//		{int b=input.nextInt();
//			String a=input.nextLine();
//			input.nextLine();
//			array.add(new Student(a,b));
//			
//		}
		arr.add(new Student("Devashish",19));
		arr.add(new Student("Kriti",18));
		arr.add(new Student("Anmol",25));
		arr.add(new Student("Pardeep",21));
		arr.add(new Student("Manash",2));
		
		System.out.println("**By Age\n");
		Collections.sort(arr,new Age());
		
		Iterator look=arr.iterator();
		
		while(look.hasNext())
			{
			Student st=(Student)look.next();
			System.out.println(st.name+" "+st.age);
			}
		
		
		System.out.println("**By name\n");
		Collections.sort(arr,new Name());
		Iterator arrange=arr.iterator();
		while(arrange.hasNext())
		{
			Student st=(Student)arrange.next();
			System.out.println(st.name+" "+st.age);
		}

	}
}
