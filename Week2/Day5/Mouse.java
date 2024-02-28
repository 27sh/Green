package day05;

public class Mouse {
	
	public void clickLeft() {
		System.out.println("왼쪽 클릭");
	}
	
	public void clickRight() {
		System.out.println("오른쪽 클릭");
	}

}
package day05;

public class WheelMouse extends Mouse {
	public void scroll() {
		System.out.println("스크롤 기능 추가");
	}
}
package day05;

public class OpticalMouse extends Mouse {
	@Override
	public void clickLeft() {
		System.out.println("광센서로 왼쪽 클릭");

	}
	
	@Override
	public void clickRight() {
		System.out.println("광센서로 오른쪽 클릭");

	}
}
package day05;

public class MouseTest3 {

	public static void main(String[] args) {

		Mouse[] arr = new Mouse[3];
		
		arr[0] = new Mouse();

		arr[1] = new WheelMouse();
		//arr[2] = new WheelMouse();

		
		arr[2] = new OpticalMouse();
			
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof WheelMouse) System.out.println("휠마우스입니다.");
			else if(arr[i] instanceof OpticalMouse) System.out.println("옵티컬 마우스입니다.");
			else if(arr[i] instanceof Mouse) System.out.println("마우스입니다."); //이 타입으로 선언이 가능한가?
		}
		
		System.out.println("----------------------------");
	
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].getClass().equals(Mouse.class)) System.out.println("마우스입니다.");
			else if (arr[i].getClass().equals(WheelMouse.class)) System.out.println("휠마우스입니다.");
			else if (arr[i].getClass().equals(OpticalMouse.class)) System.out.println("옵티컬 마우스입니다."); //class의 정보
		}
	}

}
