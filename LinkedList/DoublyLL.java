
public class DoublyLL 
{
	Dnode root;
	
	void createList()
	{
		root=null;
	}
	
	void insert_left(int e)
	{
		Dnode n=new Dnode(e);
		if(root==null)
		{
			root=n;
			root.left=null;
			root.right=null;
		}
		
		else
		{
			n.right=root;
			root.left=n;
			root=n;
		}
		System.out.println("Inserted");
	}
	void insert_right(int e)
	{  
		Dnode n =new Dnode( e);
		if(root==null)
		{
			root=n;
			root.left=null;
			root.right=null;
		}
		else 
		{
			Dnode t =root;
			while(t.right!=null)
			{
				t=t.right;
				
			}
			t.right=n;
			n.left=t;
			
		}
		
		 
		
	}

}
