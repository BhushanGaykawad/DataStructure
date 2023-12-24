import java.util.*;
public class LinearLinkedList 
{
	Node root;
	
	void createList()
	{
		root=null; 
	}
	
	void insert_left(int e)
	{
		Node n=new Node(e);
		if(root==null)
			root=n;
		else
		{
			n.next=root;
			root=n;
		}
		System.out.println("Inserted");
	}
	void delete_left()
	{
		if(root==null)
			System.out.println("Empty List..!!");
		else
		{
			Node t=root;
			root=root.next;
			System.out.println(t.data+"deleted");
		}
	}
	
	void insert_right(int e)
	{
		Node n=new Node(e);
		if(root==null)
			root=n;
		else
		{
			Node t=root;
			while(t.next!=null)
			{
				t=t.next;
				
			}
			t.next=n;
			System.out.println("Inserted");
		}
	}
	void delete_right()
	{
		if(root==null)
			System.out.println("List is empty..!!");
		else
		{
			Node t=root;
			Node t2=t;
			while(t.next!=null)
			{
				t2=t;
				t=t.next;
			}
			if(root==t)
				root=null;
			else
			{
				t2.next=null;
				
			}
			System.out.println(t.data+"Deleted");
			
		}
		
	}
	
	void print_List()
	{
		if(root==null)
			System.out.println("Empty List..!!");
		else
		{
			Node t=root;
			
			while(t!=null)
			{
				System.out.println("Data"+t.data);
				t=t.next;
			}
			
		}
		
	}
	void search(int key)
	{
		if(root==null)
			System.out.println("Empty List");
		else
		{
			Node t=root;
			while(t!=null)
			{
				if(key==t.data)
					System.out.println(key+ "KeyFound..!!");
				
				else
					t=t.next;
				break;
			}
			if(t==null)
				System.out.println(key+"key not found in the list.");
			
						
		}
		
		/*
		 * if(root==null) System.out.println("empty list"); else { Node t =root;
		 * while(t!=null && key!=t.data) { t=t.next; } if(t==null)
		 * System.out.println(key+"Key not found"); else
		 * System.out.println(key+"key found in the list"); }
		 */
		
	
	}
	
	void delete_Key(int key)
	{
		if(root==null )
			System.out.println();
		
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		LinearLinkedList obj= new LinearLinkedList();
		obj.createList();
		int ch;
		
		
		do 
		{
			System.out.println("Eneter the choice: \n 1.Insert_left \n 2.Insert_right \n 3.Delete_left  \n4.Delete_right  \n5.Search \n6.Print \n0.Exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter data to insert");
				int num=sc.nextInt();
				obj.insert_left(num);
				System.out.println("Data Inserted to left:"+num);
				break;
			
			case 2:
				System.out.println("Enter data to insert");
				int no=sc.nextInt();
				obj.insert_right(no);
				System.out.println("Data inserted to right:"+no);
				break;
			
			case 3:
				System.out.println("selected choice for Delete left");
				obj.delete_left();
				
				break;
			
			case 4:
				System.out.println("Selected choice for right left");
				obj.delete_right();
				break;
			
			case 5:
				System.out.println("Enter key to Search:");
				int key=sc.nextInt();
				obj.search(key);
				break;
			case 6:
				System.out.println("Printing data");
				obj.print_List();
				break;
			case 0:
				System.out.println("Exiting");
				break;
			
			default:
				System.out.println("Error");
				
			}
			
		}while(ch!=0);
		
	}
	

}   
