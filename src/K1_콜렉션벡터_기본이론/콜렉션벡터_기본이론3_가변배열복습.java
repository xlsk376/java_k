package K1_�ݷ��Ǻ���_�⺻�̷�;

import java.util.Arrays;
import java.util.Scanner;

public class �ݷ��Ǻ���_�⺻�̷�3_�����迭���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//�����迭 ���������
		int[] arr = null;
		int count = 0;
		while(true) {
			System.out.println(Arrays.toString(arr));
			System.out.println("--�����迭�����--");
			System.out.println("1) �߰�");
			System.out.println("0) ����");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("�߰� ���� �Է�");
				int num = scan.nextInt();
				if(count == 0) {
					arr = new int[1];
					arr[0] = num;
				}else if(count > 0) {
					int[] temp = arr;
					arr = new int[count+1];
					for(int i = 0; i < count; i++) {
						arr[i] = temp[i];
					}
					temp = null;
					arr[count] = num;
				}
				count += 1;
			}else if(sel == 0) {
				System.out.println("--�����迭����--");
				break;
			}
		}
		System.out.println("----------------------------------");
	}

}
