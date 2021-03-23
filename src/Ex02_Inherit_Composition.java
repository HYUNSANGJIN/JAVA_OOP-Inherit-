/*
 * 예)
 * 현업(실무 개발 환경)
 * 설계도가 굉장히 많다..(업무가 복잡하다) -> 하나의 설계도로 불가 -> 여러개의 설계도로 나누어서 작업
 * ex) 쇼핑몰 -> 회원관리, 배송관리, 주문관리, 상품관리, .... -> 각각의 설계도가 서로 관계를 가지고 있다.
 * ㄴ 여러개의 설계도를 어떤 기준에서 나누고 합칠까??
 *    ㄴ 1. is ~ a 은~이다 (부모를 뒤에 둬야한다) -> 상속
 *    ㄴ 2. has ~ a 은~을 가지고있다  -> 포함이라는 관계로 설계도를 만들어야한다.
 *    
 * ex) 원과 도형 클래스가 각각 있다.
 * 원은 도형이다 (is a) o  --> 원 extends 도형
 * 원은 도형을 가지고있다.(has a) x   
 *     
 * ex) 원과 점의 클래스가 각각 있다.
 * 원은 점이다.(is a) x
 * 원은 점을 가지고 있다.(has a) o  --> class 원 {점}
 * 
 * ex) 경찰과 권총의 클래스가 각각 있다. 
 * 경찰은 권총이다(is a) x
 * 경찰은 권총을 가지고 있다(has a) o  --> class 권총{}
 *                                class 경찰{
 *                                  void 출동(권총){
 *                                  
 *                                  }
 *                                  } 
 *                                  
 * ex) 원, 삼각형, 사각형 만드는 설계도를 작성하세요
 *    ㄴ 원은 도형이다
 *    ㄴ 삼각형은 도형이다
 *    ㄴ 사각형은 도형이다.
 *    
 * ㄴ  도형 : 추상화, 일반화된 자원이다. -> 공통자원이 들어가야한다. -> 그리다, 색상
 *  ㄴ 원 : 구체화, 특수화 된것   -> 본인이 가지고 있는 특징 -> 반지름, 한 점을 가지고 있다.
 *  
 *  점 : 좌표값 -> x,y
 *  원은 점을 가지고있다.
 *  삼각형은 점을 가지고 있다.
 *  사각형은 점을 가지고 있다.
 *  
 *  class Shape{그리다, 색상}  -> 상속관계 (부모)
 *  class Point{x, y} -> 포함
 *  
 *  
 * 
 */

class Shape{
    String color = "gold";
    void draw() {
        System.out.println("그리다");
    }
}
class Point{
    int x;
    int y;
    Point(){
        //this.x = 1;
        //this.y = 1;
        this(1,1);
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
// 원을 만드세요(원의 정의는 한점과 반지름을 가지고 있다)
// 1. 원은 도형이다 -> 상속
// 2. 원은 점을 가지고 있다. -> 포함 (원의 member field로서 점이 들어온다)
// 3. 원은 반지름을 가지고 있다. -> 포함 

// 원의 반지름은 초기값 10을 가진다
// 점의 좌표는 초기값(10,15) 가진다
// 기본(초기값)을 설정하지 않으면 반지름과 점의 값을 입력받을 수 있다.

class Circle extends Shape{
    Point point; // 포함
    int r; // 원이 가지고 있는 특수성, 구체화
    
    Circle(){  // default constructor
//        this.r = 10;
//        this.point = new Point(10,15);
        this(10,new Point(10,15));
    }
    
    Circle(int r, Point point){  // overloade constructor
        this.r = r;
        this.point = point;
    }
    

}
//위에서 원만든 것을 참조 해서
// 문제!!
// 삼각형 클래스를 만들기
// ㄴ 삼각형은 3개의 점과 그리고 그리다 라는 기능을 가지고 있다.
// ㄴ 위에서 만든 Shape라는 클래스와 Point라는 클래스를 제공 받아서 사용해라.
// ㄴ defaultf로 삼각형을 만들수도 있고 3개의 점을 받아서 그림을 그릴 수 있다.


// 반복되는 코드를 제거해야 좋은 코드
// Point 부분이  -> Point[] pointarray로 바꿔야함.
class Triangle extends Shape{
    Point x;
    Point y;
    Point z;
    
    Triangle(){
//        x = new Point(10,20);
//        y = new Point(30,40);
//        z = new Point(50,60);
        this(new Point(10,20), new Point(30,40), new Point(50,60));
    }
    Triangle(Point x, Point y, Point z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
  //구체화 , 특수화 

  //추가적인 기능 언제나 가능

  void trianglePoint() {

  System.out.printf("x : (%d,%d)\t",x.x,x.y);

  System.out.printf("y : (%d,%d)\t",y.x,y.y);

  System.out.printf("z : (%d,%d)\t",z.x,z.y);

  System.out.println();

  }
}

// triangle2로해서 완벽한 코딩 구현하기

class Triangle2 extends Shape{
    Point[] pointarray;
    
    Triangle2() {
//        this.pointarray =  new Point[3];
//        pointarray[0] = new Point(10,20);
//        pointarray[1] = new Point(30,40);
//        pointarray[2] = new Point(50,60);
//        this(new Point[] {});
        
        // int[] arr = new int[]{1,2,3}
        // = 
          this(new Point[] {new Point(10,20),new Point(30,40),new Point(50,60)});
    }
    
    Triangle2(Point[] pointarray){
        this.pointarray = pointarray;
    }
    // 기능
    void trianglePoint() {
        for(Point point : this.pointarray) {
            System.out.printf("point : (%d , %d)\t\n ",point.x ,point.y);
        }
    }
}


public class Ex02_Inherit_Composition {

    public static void main(String[] args) {
        
        Circle circle = new Circle();
        System.out.println("반지름 : " +  circle.r);
        System.out.println("부모자원 : " +  circle.color);
        System.out.println("좌표값 x : " +  circle.point.x);
        System.out.println("좌표값 y : " +  circle.point.y);
        circle.draw();
        System.out.println("-------------------------");
        
        Circle circle2 = new Circle(20, new Point(10,20));   // 내가 원하는 형태로 바꿔 출력하기
        System.out.println("반지름 : " +  circle2.r);
        System.out.println("부모자원 : " +  circle2.color);
        System.out.println("좌표값 x : " +  circle2.point.x);
        System.out.println("좌표값 y : " +  circle2.point.y);
        circle2.draw();
        System.out.println("-------------------------");
        
        Triangle triangle = new Triangle();
        triangle.trianglePoint();
        triangle.draw();
        
        System.out.println("-------------------------");
        Triangle triangle2 = new Triangle(new Point(1,2), new Point(3,4), new Point(5,6));
        triangle.trianglePoint();
        triangle.draw();
        
        System.out.println("--------------------------");
        Point[] pointarr = {new Point(11,21), new Point(31,41), new Point(51,61)};
        Triangle2 tri3 = new Triangle2(pointarr);
        tri3.trianglePoint();
        System.out.println(tri3.color);
        tri3.draw();
        

    }

}
