import kr.or.bit.Bird;

// Bird 상속받아서 구현

class Bi extends Bird{
    @Override
    protected void moveFast() {
        super.moveFast();
    }
}

class Ostrich extends Bird{
    // 구체화, 특수화된 내용
    void run() {
        System.out.println("호다닥");
    }
    @Override
    protected void moveFast() {
        run();
    }
}

public class Ex09_Inherit_Protected {

    public static void main(String[] args) {
        Bi bi = new Bi();
        bi.fly();
        // Point
        // 객체 입장에서는 private
        // 상속관계에서는 protected
        // bi.moveFast(); -> 상속관계에서만.. default사용(같은 폴더내에서만 접근 가능)
        bi.moveFast();
        
        Ostrich o = new Ostrich();
        o.run();
        o.moveFast();

    }

}
