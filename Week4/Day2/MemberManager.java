package m;

import db.UI;

public class MemberManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UI ui = new UI();
				
		try {
			ui.showMenu();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
