package kr.or.bit;

public class Emp {   //extends Object 생략
    private int empno;
    private String ename;
    
    public Emp(int empno, String ename) {
        
        this.empno = empno;
        this.ename = ename;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    // Object가 가지는 재정의
    @Override
    public String toString() {
        return "Emp [empno=" + empno + ", ename=" + ename + "]";
    }
    
    //Object toString() 가지고 있는데 원하면 재정의 해서 써라
    // 개발자 -> member field가 정상적인지 보려고...
    

}
