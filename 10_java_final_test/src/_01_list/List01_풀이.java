package _01_list;


class LinkedList{
	private ListNode head;
	
	public LinkedList() {
		head = null;
	} // 생성자 오버로딩
	
	public void insertMiddleNode(ListNode pre, String data ) {
		ListNode newNode = new ListNode(data);
		newNode.link = pre.link;
		pre.link = newNode;
	}
	
	public void insertLastNode(String data) {
		ListNode newNode = new ListNode(data);
		
		if(head == null) {
			this.head = newNode;
		}
		else {
			ListNode temp = head;
			while(temp.link != null) {
				temp = temp.link;
			}
			temp.link = newNode;
		}
	}
	
	public void deleteLastNode() {
		
		ListNode pre, temp;
		if(head == null) return;
		
		if(head.link == null) {
			head = null;
		}
		else {
			pre = head;
			temp = head.link;
			while(temp.link != null) {
				pre = temp;
				temp = temp.link;
			}
			pre.link = null;
		}
	}
	
	public 
	
}

public class List01_풀이 {

}
