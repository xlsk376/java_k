package K1_�ݷ��Ǻ���_�⺻�̷�;

public class �ݷ��Ǻ���_�⺻�̷�1_����Ŭ���� {

	public static void main(String[] args) {
		/*
		* # ���� Ŭ����(wrapper class)
		* - ���� Ŭ������, �⺻ �ڷ����� Ŭ������ ����� ���� ���� �ǹ��Ѵ�.
		* [�⺻��]          [���� Ŭ����]
		* byte             Byte
		* short            Short
		* int              Integer
		* long             Long
		* float            Float
		* double           Double
		* char             Character
		* boolean          Boolean
		*/
		
		int i1 = 10;
		Integer i2 = Integer.valueOf(10);
		System.out.println(i1);
		System.out.println(i2);
		
		float f1 = 10.1f;
		Float f2 = Float.valueOf(10.1f);
		System.out.println(f1);
		System.out.println(f2);
		
		double d1 = 10.11;
		Double d2 = Double.valueOf(10.1);
		System.out.println(d1);
		System.out.println(d2);
		
		char ch1 = 'a';
		Character ch2 = Character.valueOf('a');
		
		long l1 = 10000000000000l;
		Long l2 = Long.valueOf(1000000000000000l);
		
		boolean b1 = false;
		Boolean b2 = Boolean.valueOf(true);
	}

}
