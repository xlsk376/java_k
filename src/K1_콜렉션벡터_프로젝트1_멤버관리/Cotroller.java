package K1_�ݷ��Ǻ���_������Ʈ1_�������;

import java.util.Scanner;


public class Cotroller {
	Scanner scan;
	MemberDAO memberDAO;
	void init() {
		 scan = new Scanner(System.in);	
		 memberDAO = new MemberDAO();
		 memberDAO.init();
		 mainMenu();
	}
	void mainMenu() {
		while(true) {
			System.out.println("1.�߰�");
			System.out.println("2.����");
			System.out.println("3.��ü���");
			System.out.println("8.����");
			System.out.println("9.�ε�");
			System.out.println("0.����");
			int sel = scan.nextInt();
			if(sel == 0) {
				break;
			}else if(sel == 1) {
				memberDAO.join();
			}else if(sel == 2) {
				memberDAO.remove();
			}else if(sel == 3) {
				memberDAO.printMember();
			}
		}
	}
}
