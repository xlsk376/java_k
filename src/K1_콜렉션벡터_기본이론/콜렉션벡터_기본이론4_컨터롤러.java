package K1_�ݷ��Ǻ���_�⺻�̷�;

import java.util.Scanner;
import java.util.Vector;

public class �ݷ��Ǻ���_�⺻�̷�4_���ͷѷ� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Vector<Integer> vector = new Vector<Integer>();
		while(true) {
			for(int i = 0; i < vector.size(); i++){
				System.out.println(vector.get(i));
			}
			System.out.println("--���ͻ��--");
			System.out.println("1) �߰�");
			System.out.println("2) ����");
			System.out.println("3) ����");
			System.out.println("4) ����");
			System.out.println("0) ����");
			int sel = scan.nextInt();
			if(sel == 1) { // �߰�
				System.out.println("�߰� ���� �Է�");
				int num = scan.nextInt();
				vector.add(num);
			}else if(sel == 2) { // ����
				System.out.println("���� �� �Է�");
				int value = scan.nextInt();
				boolean check = false;
				for(int i = 0; i < vector.size(); i++) {
					if(value == vector.get(i)) {
						vector.remove(i);
						check = true;
						break;
					}
				}
				if(check == false) {
					System.out.println("ã�� ���� �����ϴ�");
				}
			}else if(sel == 3) { // ����
				System.out.println("���� �� �Է�");
				int value = scan.nextInt();
				int index = -1;
				for(int i = 0; i < vector.size(); i++) {
					if(value == vector.get(i)) {
						index = i;
						break;
					}
				}
				if(index == -1) {
					System.out.println("ã�� ���� �����ϴ�.");
				}else {
					System.out.println("��ü �� �Է�");
					int change = scan.nextInt();
					vector.set(index, change);
				}
			}else if(sel == 4) { // ����
				
			}else if(sel == 0) { // ����
				System.out.println("--��������--");
				break;
			}
		}
	}

}
