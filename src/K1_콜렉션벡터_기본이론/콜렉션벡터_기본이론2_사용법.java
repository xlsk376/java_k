package K1_�ݷ��Ǻ���_�⺻�̷�;

import java.util.Scanner;
import java.util.Vector;
/*
 * # �迭�� �Ѱ�
 * - �迭�� �ѹ� �����ϸ� ���α׷����� �� ũ�⸦ �ٲ� �� ����.
 * - �����迭�� ���� ���� ����߾�����,
 * - �ڹٿ����� Vector Ŭ������ ���� �����迭�� �����Ѵ�. 
 * 
 *
 * # Ư¡ 
 *	- Ư���ϰ� <> ���踦 ����ϴµ� ���׸�(generic)�̶�� �θ���. 
 *  - �����Ҽ� �ִµ����ʹ� Ŭ������ ���尡���ϴ�. 
 *  - int double �̷� �⺻�ڷ����� �����Ҽ����⶧���� 
 *     Integer , Double ���� ����Ŭ������ �̿��ؾ��Ѵ�. 
 *  
 *  �����ϴ¹� 
 *  Vector<Integer> vector = new Vector<Integer>();
    
    // ============ �ֿ� ��� ===============
	// 1) add    ==> �߰�
	// 2) remove ==> ����
	// 3) clear  ==> ���λ���
	// 4) size   ==> ����
	// 5) get    ==> ���б� ==> �迭�� []�� �ش� 
	// 6) set    ==> ������
 
 */
public class �ݷ��Ǻ���_�⺻�̷�2_���� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
				
		Vector<Integer> vector = new Vector<Integer>();		
		// �ֿ��� 
		
		//1) add(��) ==> �ǵڿ� ���߰� 		
		vector.add(10); 
		vector.add(20); 
		vector.add(30); 
		System.out.println(vector.get(0)); // vector[0]
		System.out.println(vector.get(1));
		System.out.println(vector.get(2));
		System.out.println("vector ���� : " + vector.size());
		
		//2) remove(�ε���) ==> �ε����� ������ 		
		vector.remove(0);		
		//3) size()  ==> ����
		System.out.println("vector ���� : " + vector.size());
		 
		//4) get(�ε���) ==> ���������� �迭�� [�ε���] �Ͱ���. 
		int value = vector.get(0);
		System.out.println("vector[0] : "  + value);
		
		//5) set(�ε��� , ������) ==> ���� ���ʹ� Ư���ϰ� �б� , ���Ⱑ ���еǾ��ִ�. 
		// �迭�� �Ʒ��� ���� ������ �����ϳ�, ���ʹ� get , set ���еǾ� �ִ�.
		// ��)
		int arr[] = {10,20,30};
		arr[0] = 100;
		arr[0] = 200;
		// ���� ��)
		//vector.get(0) = 100; // �̿Ͱ��� ������ �Ұ����ϴ�.
		vector.set(0,  100); // �̿Ͱ��� �����ؾ��Ѵ�. 
		
		//6) ��ü ��� 
		for(int i = 0; i < vector.size(); i++) {
			System.out.print(vector.get(i) + " ");
		}
		System.out.println();
		
		//7)clear ==> ���� ���� 
		vector.clear(); 
		System.out.println("vector ���� : " + vector.size());
		
	}
}