package task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        input(list);
        doubleValue(list);
        System.out.print("Doubled list: ");
        try {
            for (int i = 0; i <= list.size(); i++)
                System.out.print(list.get(i) + " ");
        }catch (Exception e){}
    }

    public static void input(List<String> list){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter data");
        for (int i = 0; i < 5 ; i++){
            list.add(in.nextLine());
        }
    }

    public static void doubleValue(List<String> list) {
        String s;
        List<String> listCopy = new ArrayList<>();
        Iterator<String> iter = list.stream().iterator();
        Iterator<String> iter2 = listCopy.stream().iterator();
        while (iter.hasNext()){
            listCopy.add(iter.next());
        }
        list.clear();
        while (iter2.hasNext()){
            s = iter2.next();
            list.add(s);
            list.add(s);
        }
    }
}
