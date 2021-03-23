class Pbase{
    int p = 100;
}

class Cbase extends Pbase{
    int c = 200;
}

class Dbase extends Pbase{
    
}
public class Ex11_Inherit_Poly {

    public static void main(String[] args) {
        Cbase cbase = new Cbase();
        System.out.println(cbase.toString());  // 주소값 호출
        
        // 다형성 
        // 상속관계에서 부모타입의 참조변수가 여러개의 자식타읩의 객체 변수를 가질수 있는것이다.
        // 부모타입은 상속하는 변수 또는 주소를 가질 수 있다.
        // p라는 부모타입은 자식타입의 주소를 가질 수 있다.
        Pbase p = cbase;
        System.out.println(p);
        Dbase dbase = new Dbase();
        
        p = dbase;
        System.out.println(p);
        
        Cbase c = (Cbase)p;  // 부모가 객체의 주소를 다시 자식에게 줄때는 자식타입으로 casting을 통해 전달을 한다.
        // 자식으로 내려주어야 상속관계에서 자식은 모든 자원에 대한 접근이 가능하다.
    }

}
