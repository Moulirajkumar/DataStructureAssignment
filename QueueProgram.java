package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueProgram 
{
	Queue<String> queue=new LinkedList<>();
	Scanner sc=new Scanner(System.in);
	public int WaitingHallCapacity=0;
	public int NumberOfPeopleCanInterview;
	String name;
	public void logic()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Waiting Hall Capacity");
		WaitingHallCapacity=sc.nextInt();
		System.out.println("Enter Number of People can Interview At a Time");
		NumberOfPeopleCanInterview=sc.nextInt();
		while(WaitingHallCapacity!=0)
		{
			if(NumberOfPeopleCanInterview<=WaitingHallCapacity)
			{
				for(int i=0;i<NumberOfPeopleCanInterview;i++)
				{			
					System.out.println("Enter the Name of the Candidates");
					name=sc.next();
					queue.add(name);
				}
				for(int j=0;j<NumberOfPeopleCanInterview;j++) {
				System.out.println(queue.poll()+" Interview Is Going..!");
				System.out.println(queue.size()+" Interview has to be Done");
			}
				WaitingHallCapacity-=NumberOfPeopleCanInterview;
			}
			else
			{
				for(int i=0;i<=WaitingHallCapacity-NumberOfPeopleCanInterview+1;i++)
				{			
					System.out.println("Enter the Name of the Candidates");
					name=sc.next();
					queue.add(name);
				}
				System.out.println(queue+" Interview Done");
				break;
			}
		}
		sc.close();
	}
	public static void main(String[] args) {
		new QueueProgram().logic();
	}
}
