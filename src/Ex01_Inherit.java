/*
 * OOP
 * ㄴ 상속
 * ㄴ 캡슐화
 * ㄴ 다형성
 * 
 * 1. 상속
 *  ㄴ java -> child extends Base
 *  ㄴ c# -> child:Base
 *  
 * 2. 상속 특징
 *  ㄴ 다중 상속은 불가능 하다.
 *  ㄴ 단일 상속만 가능하다.(계층적 상속 : 여러개의 클래스를 상속받을 수 있다.)
 *  ㄴ 다중 상속을 지원(단, interface!!)
 *   
 * 3. 상속 의미
 *  ㄴ 재사용성
 *  ㄴ 단점 : 초기 설계 비용이 많이 든다.
 *  ㄴ 재사용성 -> 설계의 초점을 둔다 -> 비용이 든다  (공통분모(추상화)) 
 *  
 * 4. 상속 관계
 *  ㄴ GrandFather  >>  Father  >>  Child (상속관계)
 *  ㄴ 부모부터 heap 메모리에 올라간다. 
 *  ㄴ Child child = new Child() -> GrandFather 부터 내려온다.
 *  
 * 
 */


// 상속관계에서 기본이 되는 클래스가 Object 상속
class GrandFather extends Object{  // 컴파일러가 알아서 해줘서 굳이 extends Object를 안써도 됨(생략 가능)
    public GrandFather() {
        System.out.println("GrrandFather");
    }
    public int gmoney = 5000;
    private int pmoney = 1111;   // 접근자가 private(객체, 상속관계 접근불가)
    
//    public void call() {
//        System.out.println(pmoney);
//    }
}

class Father extends GrandFather{
    public int fmoney = 3000;

public Father() {
    System.out.println("Father");
}
}
class Child extends Father{
    public int cmoney = 1000;
    
    public Child() {
        System.out.println("Child");
    }
}

class Car{ 
 // extends Object 생략
 // default로 사용자가 만드는 모든 클래스는 눈에 보이지 않지만 -> class Car extends Object(생략)
 // 사용자가 만드는 모든 클래스는 default로 Object(최상위 클래스)를 상속한다.
 // Object 가장 추상화, 가장 일반화된다
 // ㄴ 모든 클래스가 공통으로 사용하는 것들.    
}

public class Ex01_Inherit {
    public static void main(String[] args) {
        
        Child child = new Child();
        System.out.println(child.gmoney);
        System.out.println(child.fmoney);
        System.out.println(child.cmoney);
        
        //child.pmoney  -> private써서 접근 불가
        
        //child.call();
        
        Car car = new Car();
        
        

    }

}
