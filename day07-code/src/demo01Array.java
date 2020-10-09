import java.util.ArrayList;

public class demo01Array {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //add
        list.add("admin");
        list.add("fengshuo");
        System.out.println(list);
        list.add("zhagnwan");
        list.add("sunbaimiao");
        System.out.println(list);
        System.out.println(list.get(0));
//        System.out.println(list.get(5));
        list.remove("5");
        System.out.println(list);
        int i = list.size();
        System.out.println(i);
        for ( int j = 0; j<list.size(); j++){
            System.out.println(list.get(j));
        }
        for (int i1 = 0; i1 < list.size(); i1++) {
            System.out.println(list.get(i1));
            
        }
    }
}
