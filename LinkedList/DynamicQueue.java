import java.util.Scanner;

public class DynamicQueue {
	Node front,rear;
	
	void createQueue()
	{
		front=null;
		rear=null;
	}
	
	void enqueue(int e)
	{
		Node n=new Node(e);
		if(rear==null && front==null)
			front=rear=n;
			
		else
		{
			Node t=rear;
			while(t.next!=null)
			{
				t=t.next;
				
			}
			t.next=n;
			System.out.println(e+"enqueued");
		}
	}
	void Dequeue()
	{
		if(front==null)
			
			System.out.println("Empty Queue..!!");
		else
		{
			
			Node t=front;
			
			
				front=front.next;
				System.out.println(t.data+"dequeued");
			
			
		}
	}
	void Print_Queue()
	{
		if(front==null)
		{
			System.out.println("Empty Queue..!!");
		}
			
		else
		{
			Node t=front;
			
			while(t!=null)
			{
				System.out.println("Data"+t.data);
				t=t.next;
			}
			
		}
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of Queue");
		//1int size=sc.nextInt();
		DynamicQueue obj=new DynamicQueue();
		obj.createQueue();
		int ch;
		
		do
		{
			System.out.println("1.Enqueue \n 2.Dequeue \n 3.Print\n 0.exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				
				{
					System.out.println("Enter a number");
					int no=sc.nextInt();
					obj.enqueue(no);
					System.out.println("Added in Queue "+ no);
					
				}
				
				break;
			case 2:
				
					obj.Dequeue();
					
				
				
				break;
				
			case 3:
				
				
					System.out.println("Printing all Queue");
					obj.Print_Queue();
				
				break;
				
			case 0:
				System.out.println("Exiting");
			
			default:
				System.out.println("NOthing to do with Queue..!!");
			
			
			}
			
		}while(ch!=0);

	}

}
