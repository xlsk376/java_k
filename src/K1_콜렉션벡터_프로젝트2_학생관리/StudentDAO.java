package K1_�ݷ��Ǻ���_������Ʈ2_�л�����;

import java.util.Scanner;
import java.util.Vector;


public class StudentDAO {
	Scanner scan;
	int num;
	Vector<Student> studentList;
	
	void init() {
		scan = new Scanner(System.in);
		num = 1000;
		studentList = new Vector<Student>();
	}

	Student checkId(String id) {
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).studentId.equals(id)) {
				return studentList.get(i);
			}
		}	
		return null;
	}
	int getNextNum() {
		num += 1;
		return num;
	}

	void addStudent(Student student) {
		
		studentList.add(student);
		System.out.println("�߰��Ϸ�.");
	}
	int getStudentListSize() {
		return studentList.size();
	}
	
	
	void printStudentList(SubjectDAO subjectDAO) {
		int studentCount = getStudentListSize();
		if (studentCount == 0) {
			System.out.println("��ϵ� �л��� �����ϴ�.");
			return;
		}		
		for (int i = 0; i < studentCount; i++) {					
			Student student = studentList.get(i);
			student.printStudent();
			Vector<Subject> subList = subjectDAO.getOneStudentSubjectList(student.studentNum);
			for(int j = 0; j < subList.size(); j++) {
				subList.get(j).printSubject();
			}
		}
	}
	
	void join() {
		System.out.println("[�л��߰�] ���̵� �Է� : ");
		String id = scan.next();
		Student student = checkId(id);
		if (student == null) {
			student = new Student();
			student.studentNum = getNextNum();
			student.studentId = id;
			addStudent(student);
			System.out.println("ȸ������ ����.");
		} else {
			System.out.println("�ߺ����̵��Դϴ�. ");
		}
	}
}
