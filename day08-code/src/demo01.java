public class demo01 {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println(str1);

        char[] charArray = {'A','B'};
        String str2 = new String(charArray);
        System.out.println(str2);

        byte[] byteArray = { 97 ,98 ,99 };
        String str3 = new String(byteArray);
        System.out.println(str3);
    }
}
