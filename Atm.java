import java.util.Scanner;

public class Atm{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		Account[] account=new Account[10];
		for(int i=0; i<account.length;i++){
			account[i]= new Account(i, 100);
		}
		
		int checker=0;
		
			System.out.println("Enter an id:");
		int id =input.nextInt();
	
		while(id>9){
			System.out.print("You have entered an incorrect id \n please enter a correct id:");
		    id =input.nextInt();
		}
		
		do{
		
		System.out.print("Main menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\n");
		System.out.println("Enter a choice");
		int choice=input.nextInt();
		
		if(choice==4){
			checker++;
		}
		
		switch(choice){
			case 1: System.out.print("The balance is "+account[id].getBalance());
			break;
			case 2: 
			System.out.print("Enter an amount to withdraw:");
			double amount=input.nextDouble();
			account[id].withdraw(amount);
			break;
			case 3: 
			System.out.print("\nEnter the amount to be deposited: ");
			double deposit =input.nextDouble();
			account[id].deposit(deposit);
			break;
		}
		}
		while(checker==0);
		
		 
		
		
		
		
		
	}
}