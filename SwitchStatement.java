import java.util.Scanner:

public class SwitchStatement{
    public static void main(String[] args){
	
	    Scanner input = new Scanner(System.in);
		
	    System.out.println("Enter *131# To Subscribe Data");
		System.out.println("Enter *310# To Check Balance");
		System.out.println("Enter *606# To Borrow Data");
		System.out.println("");
		
		System.out.print(Enter Code: ");
		String code = input.nextLine();
		
		switch(code){
		    case "*131#":
			{
		        System.out.println("Enter 1 for 1 Month sub");
		        System.out.println("Enter 2 for 2 Months sub");
		        System.out.println("Enter 3 for 3 Months sub");
				System.out.println("Enter 4 for 4 Months sub");
				System.out.println("");
				
				System.out.print(Enter Code: ");
				int option = input.nextInt();
				
				switch(option)
				    case 1:
					{
						System.out.println("Your 1 month subscription has been activated");
					}
					break;
					
					case 2:
					{
					    System.out.println("Your 2 months subscription has been activated");
					}
					break;
					
					case 3:
					{
					    System.out.println("Your 3 months subscription has been activated");
					}
					break;
					
					case 4:
					{
					    System.out.println("Your 4 months subscription has been activated");
					}
					break;
					
					default:
					System.out.println("Invalid input");
                }	
					
				
			}
            break;

            case "*310#
            {
            	System.out.println("Your balance is : N700.89");
				System.out.println("");
			}
			break;
			
			case "*606#":
			{
				System.out.println("Enter 1 To borrow 1000");
		        System.out.println("Enter 2 To borrow 2000");
		        System.out.println("Enter 3 To borrow 3000");
				System.out.println("Enter 4 To borrow 4000");
				System.out.println("");
				
				System.out.print(Enter Code: ");
				int option = input.nextInt();
				
				switch(option){
					case 1:
					{
						System.out.println("You have borrowed N1000");
					}
					break;
					
					case 2:
					{
					    System.out.println("You have borrowed N2000");
					}
					break;
					
					case 3:
					{
					    System.out.println("You have borrowed N3000"");
					}
					break;
					
					case 4:
					{
					    System.out.println("You have borrowed N4000"");
					}
					break;
					
					default:
					System.out.println("Invalid input");
                }
			}
			break;
		}
	}
}	
					
					
			
		
		