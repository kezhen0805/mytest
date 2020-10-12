package demo03;

public class override {
    public static void main(String[] args) {
        System.out.println("asdfasdfasd");
        System.out.println("admin");
        System.out.println("冯硕");
        System.out.println("tijiao");
        System.out.println("自由人");
        String[] tstr = new String[3];
        tstr[0] = "admin";
        tstr[1] = "封妖";
        tstr[2] = "addddd";
        System.out.println(tstr);
        for (int i = 0; i < tstr.length; i++) {
            System.out.println(tstr[i]);
        }
        String str = "admin";
        int i = 1;
        System.out.println(str + (i + 1));
    }
}
