package week3.day1;

public class DeskTop extends Computer {
  
	public void desktopSize() {
		System.out.println("size is 15inch");
		
	}
	
	public static void main(String[] args) {
		
		DeskTop dt=new DeskTop();
		dt.computerModel();
		dt.desktopSize();
	}
}
