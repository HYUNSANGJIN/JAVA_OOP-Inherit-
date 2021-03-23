package kr.or.bit;

//새의 공통사항(일반화, 추상화) -> 새는 날수있다, 새는 빠르다
public class Bird {
    public void fly() {
        System.out.println("flying");
    }
    
    // 설계자
    // 나를 상속하는 당신은 moveFast를 필요에 따라 재정의 했으면 좋겠다..는 의지가 담김 -> 상속관계
   protected void moveFast() {
        fly();
    }

}
