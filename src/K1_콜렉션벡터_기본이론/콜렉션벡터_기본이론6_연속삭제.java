package K1_�ݷ��Ǻ���_�⺻�̷�;

import java.util.Random;
import java.util.Vector;

public class �ݷ��Ǻ���_�⺻�̷�6_���ӻ��� {
	public static void main(String[] args) {
		int arr[] = {1,1,3,2,2,3,3,4,4,5,5,4};		
		Random ran= new Random();	
		int r = ran.nextInt(5) + 1;
		Vector<Integer> vec = new Vector<>();
		for(int i = 0; i < arr.length; i++) {			
				vec.add(arr[i]);			
		}		
		//1) arr�� ���� Vector �� ��� �����Ѵ�. 
		//2) Vector�� ���� 1~5�����̴�.
		//3) ���� r �� ���� ���� 1~5�� �����Ѵ�, 
		//����) vector ���� ������ ���� r�� �� ��� ���� 
			
		/*
			//���� �߻� ) �����ϰ� ���������ʴ´�. 
			// ������ vec ũ�Ⱑ ���ؼ� �ε����� ���ع�����.
		System.out.println("ran : " + r);
		for(int i = 0; i < vec.size(); i++) {
			if(vec.get(i) == r) {
				vec.remove(i);
			}
		}	
		System.out.println(vec.toString());		

		*/					
		
		//�ذ���) ������ size �� �ٱ⶧���� i �� 1 ���� ��Ų��.		
		System.out.println("ran : " + r);
		for(int i = 0; i < vec.size(); i++) {
			if(vec.get(i) == r) {
				vec.remove(i);
				i -= 1;
			}
		}	
		System.out.println(vec.toString());				
	}
}