class Student
{
	private String name;
	public Student()
	{
		this.name="Unknown";
	}
	public Student(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
}

class Q4
{
	public static void main(String args[])
	{
		Student_call clarkson = new Student_call("Clarkson");
		Student_call hammond = new Student_call("Hammond");
		Student_call may = new Student_call("May");
		Student_call atharv = new Student_call();

		System.out.println(clarkson.getName());
		System.out.println(hammond.getName());
		System.out.println(may.getName());
		System.out.println(atharv.getName());
	}
}