package K1_�ݷ��Ǻ���_�˰���;

import java.util.Random;
import java.util.Vector;

class RanNum{
	int num;
	boolean check;
	void printRanNum() {
		System.out.println(num);
	}
}
public class �ݷ��Ǻ���_�˰���_�ߺ����ڱ��� {

	public static void main(String[] args) {
		Random ran = new Random();
		// RanNum �� �ߺ����� 0~4 �� ������ �����ϱ�
		
		Vector<RanNum> ranList = new Vector<RanNum>();
		// Vector<RanNum> ranList = new Vector<>(); <> ���賻��ȿ� Ŭ������ ��������
		
		for(int i = 0; i < 5; i++) {
			RanNum ranNum = new RanNum();
			ranList.add(ranNum);
		}
		for(int i = 0; i < 5;) {
			int r = ran.nextInt(5);
			if(ranList.get(r).check == false) {
				ranList.get(i).num = r;
				ranList.get(r).check = true;
				i += 1;
			}
		}
		
		for(int i = 0; i < ranList.size(); i++) {
			ranList.get(i).printRanNum();
		}
	}

}
