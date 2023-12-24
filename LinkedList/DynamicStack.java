import java.util.Scanner;

public class DynamicStack 
{
	Node tos;
	 LinearLinkedList obj=new LinearLinkedList();
	 
	 
	 
	 void createList()
		{
			tos=null; 
		}
	 
	 void push(int e)
		{
			Node n=new Node(e);
			if(tos==null)
				tos=n;
			else
			{
				n.next=tos;
				tos=n;
			}
			System.out.println("Inserted");
		}
	 void pop()
		{
			if(tos==null)
				System.out.println("Empty List..!!");
			else
			{
				Node t=tos;
				tos=tos.next;
				System.out.println(t.data+"deleted");
			}
		}
	 void print_Stack()
		{
			if(tos==null)
				System.out.println("Empty List..!!");
			else
			{
				Node t=tos;
				
				while(t!=null)
				{
					System.out.println("Data"+t.data);
					t=t.next;
				}
				
			}
			
		}
	 



}   