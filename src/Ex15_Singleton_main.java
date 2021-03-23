import kr.or.bit.Singleton;

public class Ex15_Singleton_main {

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();  
        System.out.println(s);   //kr.or.bit.Singleton@2a139a55
        
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);  // kr.or.bit.Singleton@2a139a55

    }

}
