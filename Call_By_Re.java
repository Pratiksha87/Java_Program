package pratiksha.garkar.pratiksha;
class TestCall{
    void math(int x,int y){
        x*=2;
        y/=2;
        System.out.println("Value after calling :"+x+" "+y);
    }
}

public class Call_By_Re {
    public static void main(String[] args) {
        TestCall t=new TestCall();
        int p=4,q=4;
        t.math(p,q);
    }
}
