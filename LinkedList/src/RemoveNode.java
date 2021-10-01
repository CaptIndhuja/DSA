class LinkedList{
	int data;
	LinkedList next;
	public LinkedList() {
		this.next =null;
	}
	public LinkedList(int data) {
		this.data = data;
		this.next = null;
	}
	public LinkedList(int data, LinkedList node) {
		this.data = data;
		this.next = node;
	}	
}
class RemoveNode{
	public static void main(String[] args) {
		LinkedList head = new LinkedList();
		int[] arr = {1,3,7,8,9,10};
		LinkedList temp = head;
		for(int i=0;i<arr.length;i++) {
			temp.next = new LinkedList(arr[i],null);
			temp = temp.next;
		}
		temp = head;
		while(temp.data!=8) {
			temp = temp.next;
		}
		//Remove node 
		temp.data = temp.next.data;
		temp.next = temp.next.next;
		while(head!=null) {
			System.out.print(head.data +" ");
			head = head.next;
		}
	}
}