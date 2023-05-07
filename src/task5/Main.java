package task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        input(list);
        output(list);
    }

    public static void input(List<String> stringList){
        Scanner in = new Scanner(System.in);
        String s;
        while (true){
            s = in.nextLine();
            if (!s.equalsIgnoreCase("end"))
                stringList.add(s);
            else break;
        }
    }
    public static void output(List<String> stringList){
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
