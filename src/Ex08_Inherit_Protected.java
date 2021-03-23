import kr.or.bit.Pclass;

/*
 * private, default, public, [상속관계에서만 존재하는 protected]
 * 
 * protected : 양면성을 지니고 있다. (어쩔땐 default, 어쩔땐 public)
 *  ㄴ 상속이 없는 클래스 안에서 protected 접근자는 default와 같다.
 *  ㄴ 결국 상속관계에서만 의미를 가진다. 
 *  ㄴ 상속관계에서 재정의
 * 
 */
class Dclass{
    public int i;
    private int p;
    int s;  // default
    protected int k;  // 이렇게 쓰이면 default랑 같다.(일반클래스는 사용할 이유가 없다)
}

class Child2 extends Pclass{
    void method() {
        this.k = 100;  // 상속관계에서 protected는 public처럼 쓰인다.
        System.out.println(this.k);
    }
    
}

public class Ex08_Inherit_Protected {

    public static void main(String[] args) {
        Child2 ch = new Child2();
        ch.method();

    }

}
