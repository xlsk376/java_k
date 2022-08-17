package K1_콜렉션벡터_알고리즘;

import java.util.Vector;

import java.util.Scanner;

class Seat{
	int num;
	boolean check;
}

public class 콜렉션벡터_알고리즘_자리예매 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Vector<Seat> seatList = new Vector<Seat>();
		
		for(int i = 0; i < 10; i++) {
			Seat seat = new Seat();
			seat.check = false;
			seat.num = i;
			seatList.add(seat);
		}
		
		while(true) {
			for(int i = 0; i < seatList.size(); i++) {
				if(seatList.get(i).check == false) {
					System.out.print("[ ]");
				}else {
					System.out.print("[X]");
				}
			}
			System.out.println();
			System.out.println("1) 예매 0) 종료");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("번호를 선택하세요");
				int num = scan.nextInt();
				if(num < 0 || num >= seatList.size()) {
					System.out.println("선택할 수 없는 자리입니다.");
					continue;
				}
				if(seatList.get(num).check == false) {
					seatList.get(num).check = true;
					System.out.println(num + " 번자리 예매 완료");
				}else {
					System.out.println("이미 예매된 자리입니다.");
				}
			}else if(sel == 0) {
				break;
			}
		}
	}

}
