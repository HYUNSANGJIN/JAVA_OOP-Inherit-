package kr.or.bit;
// Singleton -> 디자인 패턴(생성 패턴)  -> new에 관련된 내용(객체)
//  ㄴ Singleton : 객체 하나를 만들어서 공유하겠다.
//  ㄴ 의도 : 하나의 객체를 공유하겠다.

// 활용
// ㄴ 예) 공유 프린터, 공유 와이파이


//**중요**
public class Singleton {
    private static Singleton p;
    private Singleton() {  // private(다른 패키지에서 공유가 안됨) -> 캡슐화
        // 의도 : 직접 객체를 생성 불가...new를 하지 못한다..heap객체 생성 불가(생성자를 통해서)
        
    }
    public static Singleton getInstance() {  // static
        if(p == null) {
            p = new Singleton();  // 생성자 호출 -> 객체를 만듬 
        }
        return p;
    }

}
