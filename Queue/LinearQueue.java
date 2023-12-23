import java.util.Scanner;

public class LinearQueue 
{
	int front,rear,MaxSize, Queue[];
	void createQueue(int size)
	{
		MaxSize=size;
		Queue=new int[size];
		front=0;
		rear=-1;
				
	}
	void enqueue(int e)
	{
		rear=rear+1;
		Queue[rear]=e;
	}
	boolean is_full()
	{
		if(rear==MaxSize-1)
			return true;
		else
			return false;
	}
	boolean is_empty()
	{
		if(front>rear)
			return true;
		else
			return false;
	}
	int dequeue()
	{
		int num=Queue[front];
		front=front+1;
		return num;
	}
	
	void print_Queue()
	{
		for(int i=front;i<=rear;i++)
		{
			int res=Queue[i];
			System.out.println("Queue element is: "+res);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of Queue");
		int size=sc.nextInt();
		LinearQueue obj=new LinearQueue();
		obj.createQueue(size);
		int ch;
		
		do
		{
			System.out.println("1.Enqueue \n 2.Dequeue \n 3.Print\n 0.exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				if (!obj.is_full())
				{
					System.out.println("Enter a number");
					int no=sc.nextInt();
					obj.enqueue(no);
					System.out.println("Added in Queue "+ no);
					
				}
				else
					System.out.println("Queue is full");
				break;
			case 2:
				if(!obj.is_empty())
				{
					int i=obj.dequeue();
					System.out.println("Number returned from Queue is"+i);
				
				}
				else
					System.out.println("Queue is empty..!!");
				break;
				
			case 3:
				if(!obj.is_empty())
				{
					System.out.println("Printing all Queue");
					obj.print_Queue();
				}
				else
					System.out.println("Queue empty");
				break;
				
			case 0:
				System.out.println("Exiting");
			
			default:
				System.out.println("NOthing to do with Queue..!!");
			
			
			}
			
		}while(ch!=0);

	}

}
