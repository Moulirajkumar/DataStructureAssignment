package collections;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Stack;

public class StackImplementation 
{
	StackDataBase sdb=new StackDataBase();
	Stack<Integer> stack=new Stack<>();
	Scanner sc=new Scanner(System.in);
	public void fetchingData() throws SQLException
	{
		boolean isTrue=true;
		int language=0;
		while(isTrue)
		{
			if(stack.size()==0)
			{
				sdb.display(0, 0, language);
				System.out.println("Enter Your Choice: ");
				int choice=sc.nextInt();
				if(choice==0)
				{
					isTrue=false;
				}
				else if(choice<4 && choice>0)
				{
					stack.push(choice);
					language=choice;
				}
				else
				{
					System.out.println("Invalid Option");
				}
			}
			else
			{
				int value=stack.peek();
				sdb.display(value, stack.size(), language);
				System.out.println("9.Go Back");
				System.out.println("0.Exit");
				System.out.println("Enter the Choice");
				int choice=sc.nextInt();
				if(choice==9)
				{
					stack.pop();
				}
				else if(choice==0)
				{
					isTrue=false;
				}
				else
				{
					stack.push(choice);
				}
			}
			if(stack.size()==3)
			{
				System.out.println("Done");
				System.out.println("Thanks For Choosing my application");
				System.exit(0);
			}
		}
	}
	public static void main(String[] args) throws SQLException {
		StackImplementation si=new StackImplementation();
		si.fetchingData();
	}
}
