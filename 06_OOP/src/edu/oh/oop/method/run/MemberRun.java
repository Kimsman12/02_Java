package edu.oh.oop.method.run;

import edu.kh.oop.method.service.MemberService;

public class MemberRun {

	public static void main(String[] args) {
		
		MemberService service = new MemberService();
		
		service.displayMenu();
	}

}
