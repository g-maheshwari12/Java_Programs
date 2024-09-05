public class StudentInfo
{
	public static void main(String []args)
	{
		String name=args[0];
		String course=args[1];
		int universityrollno=Integer.parseInt(args[2]);
		int sem=Integer.parseInt(args[3]);
		System.out.println("Name:               "+name);
		System.out.println("Course:             "+course);
		System.out.println("University Roll No: "+universityrollno);
		System.out.println("Semester:           "+sem);
	}
}