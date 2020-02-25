package classwork;
import java.util.Scanner;

public class ClassDemo {
	public static void main(String[] args) {
 
		
		//Add code to create an object repeatedly
		
		String name,ans;
		int age;
		Person p;
		Scanner input = new Scanner(System.in);
		
		int [] Age = new int[10];
		int i = 0;
		do {
			
			
			System.out.println("Enter name :");
			name = input.nextLine();
			System.out.println("Enter age :");
			age = input.nextInt();
			p = new Person(name,age,20);
			
			Age[i] = age;
			
			System.out.println(p.getName() + 
					   " You are " +p.getAge() + " Years old");
			input.nextLine();
			System.out.println("Do you want to continue?");
			ans = input.nextLine();
			System.out.println(Age[i]);
			i++;
			
		}while (ans.equals("y") || i <= 9);
		
		input.close();
	}
}