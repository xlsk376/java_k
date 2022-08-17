package K1_�ݷ��Ǻ���_������Ʈ2_�л�����;

import java.util.Scanner;
import java.util.Vector;



public class Controller {
	Scanner scan;
	StudentDAO studentDAO;
	SubjectDAO subjectDAO;

	void init() {
		scan = new Scanner(System.in);
		studentDAO = new StudentDAO();
		subjectDAO = new SubjectDAO();
		studentDAO.init();
		subjectDAO.init();
	}

	void play() {
		while (true) {
			System.out.println("1)�л��߰�");
			System.out.println("2)�л�����"); 
			System.out.println("3)�����߰�");
			System.out.println("4)�������");
			System.out.println("5)��ü���");
			System.out.println("8)����");
			System.out.println("9)�ε�");
			System.out.println("0)����");
			int sel = scan.nextInt();
			if (sel == 0) {
				System.out.println("[����]");
				break;
			} else if (sel == 1) {				
				studentDAO.join();						
			} else if (sel == 3) {
				subjectDAO.insertSubject(studentDAO);
			} else if (sel == 5) {
				studentDAO.printStudentList(subjectDAO);
			}
		}
	}
}
