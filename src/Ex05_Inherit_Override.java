import kr.or.bit.Emp;

class Test2{
    int x = 100;
    void print() {
        System.out.println("부모함수 Test2");
    }
}

class Test3 extends Test2{
    int x = 300;
    
    @Override
    void print() {
        System.out.println("자식이 부모 함수를 재정의");
    }
    
    void print(String str) {  // overloading  -> parameter가 있다.
        System.out.println("오버로딩임" + str);
    }
}

public class Ex05_Inherit_Override {

    public static void main(String[] args) {
        Test3 t3 = new Test3();
        System.out.println(t3.x);
        
        t3.print();
        t3.print("hello");
        
        ///////////////////////////////////////////////////////////
        
        Emp emp = new Emp(1000, "현상진");
        System.out.println(emp);  // 조작된 주소 : kr.or.bit.Emp@2a139a55
        System.out.println(emp.toString()); // kr.or.bit.Emp@2a139a55
        // emp라고 출력하면 사실은 toString이 뒤에 숨어져있다.
        // toString() 은 Object가 가지는거다.
        
      
    }

}
