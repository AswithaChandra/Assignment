package Examples;

public class Main_Class {
	public static void main(String[]args)
	{
		Student s = new Student();
		Student s1 = new Student();
		s.setRollno(501);
		s.setName("aswitha");
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		s1.setRollno(502);
		s1.setName("madhuri");
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
		
	}

}
