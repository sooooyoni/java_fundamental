package java_20210511;

public class SubDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		System.out.println(sub.money);
		sub.makeMoney();
		System.out.println(sub.chicken);
		sub.gotoSchool();
		
		sub.play("~~~");
		
		//슈퍼의 메소드 호출
		Super sup =new Super();
		System.out.println(sup.money);
		sup.makeMoney();
		sup.play("~~");
		//슈퍼의 메소드+서브에서 오버라이딩한 메소드
		Super sup1 = new Sub();
		System.out.println(sup1.money);
		sup1.makeMoney();
		sup1.play("~~");
		
		System.out.println(sub.toString());
		System.out.println(sub);
		
		Object obj = new Sub();
		System.out.println(obj.toString());
		
	}

}
