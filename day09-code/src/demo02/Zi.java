package demo02;

public class Zi extends Fu {
    public void methodZi () {
        System.out.println("子类方法执行！！");
    }

    @Override
    public void method() {
        super.method();
    }
}
