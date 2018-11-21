import java.util.Scanner;

//public class UserInput {
//
//	private static Scanner scanner;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		System.out.println("Enter a byte value");
//		
//		byte b1 = scanner.nextByte();
//		//System.out.println("My byte value is "+b1);
//		
//		System.out.println("Enter a short value");
//		short s1 = scanner.nextShort();
//		
		//System.out.println("Enter a int value");
		//int i1 = scanner.nextInt();
//		
//		System.out.println("Enter a boolean");
//		boolean bool = scanner.hasNext();
//		
//		System.out.println(b1 + "|" + s1 + "|" + i1 + "|" + bool);
		
//		scanner.nextLine();
//		
//		System.out.println("Enter your name");
//		String str = scanner.nextLine();
//		System.out.println(str);
//		scanner.close();
//	}
	
	public class UserInput{
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int sum=0;
			int counter=1;
			
			while(counter<11) {
				System.out.println("Enter your number-"+counter);
				boolean bool =scanner.hasNextInt();
				if(bool) {
					counter++;
					int number=scanner.nextInt();
				}else {
					System.out.println("Invalid Number");
				}	
	               scanner.nextLine();
				
			}
			System.out.println(sum);
			scanner.close();
		}
		
	
	}

}
