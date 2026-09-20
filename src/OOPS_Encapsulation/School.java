package OOPS_Encapsulation;

public class School {

	public static void main(String[] args) {
		
		//created object of Student class and pass arguments/values to the constructor
		Student s1 = new Student("Raj", 6, 'M', 15);
		Student s2 = new Student("Kedar", 8, 'M', 20);

		System.out.println("Name: "+ s1.getName() + "; Age: "+ s1.getAge()+"; Gender: "+s1.getGender()+"; fee: "+s1.getfee());
		System.out.println("Name: "+ s2.getName() + "; Age: "+ s2.getAge()+"; Gender: "+s2.getGender()+"; fee: "+s2.getfee());
		System.out.println("-------------------------------------");
		
		//update data after 2 years
		s1.setAge(8);
		s1.setfee(20);
		s2.setAge(10);
		s2.setfee(25);
		
		System.out.println("Name: "+ s1.getName() + "; Age: "+ s1.getAge()+"; Gender: "+s1.getGender()+"; fee: "+s1.getfee());
		System.out.println("Name: "+ s2.getName() + "; Age: "+ s2.getAge()+"; Gender: "+s2.getGender()+"; fee: "+s2.getfee());
		System.out.println("-------------------------------------");
		
	}

}
