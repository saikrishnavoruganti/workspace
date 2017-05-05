package Constructors;
import java.util.ArrayList;
import java.util.List;


public class Student {
	
		String course;
		
		List <Student> students = new ArrayList<Student>(5);

		public Student(String courseName)
		{
			course=courseName;
		}
		
		public void addStudent(Student student)
		{
			students.add(student);
		}
		
		public float average()
		{
			float sum = 0;
			for(int i=0; i<5; i++)
			{
				Student student= students.get(i);
				sum = sum + student.average();
			}
			return sum/5;
		}
		
		public void roll()
		{
			for(int i=0; i<5; i++)
			{
				Student student= students.get(i);
				System.out.println(student.toString());
			}
			
		}

	}


