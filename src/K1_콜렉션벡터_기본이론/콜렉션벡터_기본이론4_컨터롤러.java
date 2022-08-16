package K1_콜렉션벡터_기본이론;

import java.util.Scanner;
import java.util.Vector;

public class 콜렉션벡터_기본이론4_컨터롤러 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Vector<Integer> vector = new Vector<Integer>();
		while(true) {
			for(int i = 0; i < vector.size(); i++){
				System.out.println(vector.get(i));
			}
			System.out.println("--벡터사용--");
			System.out.println("1) 추가");
			System.out.println("2) 삭제");
			System.out.println("3) 수정");
			System.out.println("4) 정렬");
			System.out.println("0) 종료");
			int sel = scan.nextInt();
			if(sel == 1) { // 추가
				System.out.println("추가 숫자 입력");
				int num = scan.nextInt();
				vector.add(num);
			}else if(sel == 2) { // 삭제
				System.out.println("삭제 값 입력");
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
					System.out.println("찾는 값이 없습니다");
				}
			}else if(sel == 3) { // 수정
				System.out.println("수정 값 입력");
				int value = scan.nextInt();
				int index = -1;
				for(int i = 0; i < vector.size(); i++) {
					if(value == vector.get(i)) {
						index = i;
						break;
					}
				}
				if(index == -1) {
					System.out.println("찾는 값이 없습니다.");
				}else {
					System.out.println("교체 값 입력");
					int change = scan.nextInt();
					vector.set(index, change);
				}
			}else if(sel == 4) { // 정렬
				
			}else if(sel == 0) { // 종료
				System.out.println("--벡터종료--");
				break;
			}
		}
	}

}
