package Beginner;
import java.util.ArrayList;
import java.util.Scanner;

public class 큐_1697 {
	private ArrayList<Integer> queue = new ArrayList<Integer>();
	
	public void enqueue(Integer data) {
		queue.add(data);
	}
	public String dequeue() {
		if(queue.isEmpty()) {
			return "empty";
		}
		String num = queue.get(0).toString();
		queue.remove(0);
		return num;
	}
	public int getSize() {
		return queue.size();
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Main q = new Main();
		
		int n = input.nextInt(); // 주어지는 명령의 수
		
		for(int i = 0; i <  n; i++) {
			String str = input.next();
			
			switch(order) {
			case "i" :
				int num = input.nextInt();
				q.enqueue(num);
				break;
			}
			case "o" : {
				if(q.isEmpty()) {
					System.out.println("empty");
				} else {
					q.dequeue();
					System.out.println(num);
				}
				break;				
			}
			case "c" : {
				System.out.println();
				break;
			}
			
		}
	}
	
	
}
