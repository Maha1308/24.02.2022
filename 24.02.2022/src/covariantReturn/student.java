package covariantReturn;

public class student extends Organization {

	double Student_mark;

	static String orgName;

	public student() 
	{
		Student_Roll=2345;
		Student_name="vijai";
		Student_mark=678.90;


	}

	static
	{
		orgName = "PKIET";
	}

	public student getstudentInfo()
	{

		System.out.println(orgName);
		System.out.println(Student_Roll);
		System.out.println(Student_name);
		System.out.println(Student_mark);
		return null;	
	}


	public static void main(String[] args) 
	{
		System.out.println("Student Details:");
		System.out.println("___________________________________");

		student Student = new student();


		Student.getstudentInfo();

		Organization organization = new Organization();
		organization.getInfo();

	}


}
