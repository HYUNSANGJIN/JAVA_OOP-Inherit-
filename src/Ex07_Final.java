/* 변수 <-> 상수
      상수 : 한번 값이 초기화(최초값의 할당)되면 변경 불가
      상수자원 : 고유값(주민등록번호), 수학 : PI=3.41592.. , 버전번호, 시스템 관리번호
      상수는 관용적으로 대문자로 쓴다
      
   java : final int NUM = 10;
   
   final 
       ㄴ final class Ca{}  -> 더 확장하지 말아라(상속하지 말아라...) -> 대표적인 final Math
       ㄴ 함수앞에 -> public final void print(){} -> 상속관계에서 재정의 하지마라(override금지)
       ㄴ public static void print() -> 객체간 공유자원(한번 정해지면 바꾸지 말아야할 공유자원)
*/ 

class Vcard{
    final String KIND = "heart";
    final int NUM = 10;
    void method() {
        System.out.println(Math.PI);
    }
}

class Vcard2{
    final String KIND;
    final int NUM;
    
    Vcard2(){
        this.KIND = "heart";
        this.NUM = 10;
    }
    
    Vcard2(String kind, int num){
        this.KIND = kind;
        this.NUM = num;
    }

    @Override
    public String toString() {
        return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
    }

   
    
}

public class Ex07_Final {

    public static void main(String[] args) {
        Vcard vcard = new Vcard();
        System.out.println(vcard.KIND);
        vcard.method();
        
        Vcard2 vcard2 = new Vcard2();
       System.out.println(vcard2);
       
       Vcard2 vcard3 = new Vcard2("spade",10);
       System.out.println(vcard3);
    }

}
