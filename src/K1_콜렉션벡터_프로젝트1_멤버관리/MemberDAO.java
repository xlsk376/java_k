package K1_�ݷ��Ǻ���_������Ʈ1_�������;

import java.util.Scanner;
import java.util.Vector;


public class MemberDAO {
	Scanner scan;
	int num;
	Vector<Member> memberList;
	void init() {
		scan = new Scanner(System.in);
		num = 1000;
		memberList = new Vector<>();	
	}
	
	int checkId(String id) {
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).id.equals(id)) {
				return i;
			}
		}
		return -1;
	}
	int getNextNum() {
		num += 1;
		return num;
	}
	
	void addMember(Member member) {	
		
		memberList.add(member);
		System.out.println("�߰��Ϸ�.");
	}	
	void removeMember(int removeIndex) {
		memberList.remove(removeIndex);
		System.out.println("�����Ϸ�.");
	}
	void printMember() {
		for(int i = 0; i < memberList.size(); i++) {
			memberList.get(i).printMember();
		}
	}
	int getSize() {
		return memberList.size();
	}
	void join() {
		System.out.println("���̵� �Է� : ");
		String id = scan.next();
		
		if(checkId(id) == -1) {
			Member member = new Member();
			member.id = id;
			member.num = getNextNum();
			addMember(member);
		}else {
			System.out.println("�ߺ����̵�.");
		}
	}
	void remove() {
		if(getSize() == 0) {
			System.out.println("������ �����Ͱ� �����ϴ�.");
			return;
		}
		System.out.println("���̵� �Է� : ");
		String id = scan.next();
		int index = checkId(id);
		if(index == -1) {
			System.out.println("������ ���̵� �����ϴ�.");
		}else {
			removeMember(index);
		}
	}
}
