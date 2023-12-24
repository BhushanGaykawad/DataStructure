
public class Node 
{
	int data;
	Node next; // self referencing: link's node is refering to another node(which is of similar type).
	Node(int data)
	{
		this.data=data;
		this.next=null;
		
	}

}
