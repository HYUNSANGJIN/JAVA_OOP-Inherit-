// 설계도
class Tv{
    boolean power;
    int ch;
    
    void power() {
        this.power = !this.power;
    }
    
    void chUp() {
        this.ch++;
    }
    void chDown() {
        this.ch--;
    }
}

class Vcr{  // 비디오 플레이어
    boolean power;
    
    void power() {
        this.power = !this.power;
    }
    void play() {
        System.out.println("재생하기");
    }
    void stop() {
        System.out.println("정지하기");
    }
    void rew() { // 되감기
        
    }
    void ff() { // 빨리감기
        
    }
}
/*
 * Tv 설계도
 * Vcr 설계도
 * 
 * TvVcr 이라는 제품을 만들어주세요!
 * 
 * ㄴ1. class TvVcr extends Tv, Vcr -> 다중상속 금지
 * ㄴ2. class TvVcr extends  Vcr을 상속 받고 TvVcr extends Tv -> 자원이름이 똑같은게 있으서 충돌남
 *   ㄴ 해결방안 : class TvVcr extends Tv{Vcr vcr} (o)
 *   >> class TvVcr{Tv t; Vcr v;} 
 *   >> class TvVcr extends Tv{Vcr vcr}
 *   >> class TvVcr extends Vcr{Tv tv}
 *   
 * Q : Tv 상속과  Vcr중 어떤것을  상속하는게 좋을까??
 * A : 주기능, 메인기능이 무엇인지 파악 -> 비중이 높은것을 판단 -> 비중이 높은 클래스는 [상속] -> 나머지는 [포함]
 * 
 */

class TvVcr extends Tv{
    Vcr vcr;
    TvVcr(){
        vcr = new Vcr();
    }
}
public class Ex03_Inherit {

    public static void main(String[] args) {
        TvVcr t = new TvVcr();
        t.power();
        System.out.println("전원 : " + t.power);
        t.chUp();
        System.out.println("채널 : " + t.ch);
        
        // 비디오
        t.vcr.power();
        System.out.println("전원 : " + t.vcr.power);
        t.vcr.play();
        t.vcr.stop();
        
        t.vcr.power();
        t.power();
        System.out.println("전원 : " + t.power);
        System.out.println("비디오 전원 : " + t.vcr.power);
        

    }

}
