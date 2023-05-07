package task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> sity = new ArrayList<>();
        List<String> thernames = new ArrayList<>();
        inListData(sity, thernames);
        System.out.println(find(sity, thernames));
    }

    public static void inListData(List<String> sity, List<String> thernames){
        System.out.println("Enter information: City, Thername \nEnter 'stop' when you want to stop");
        String s;
        boolean check = true;
        Scanner in = new Scanner(System.in);
        while (check){
            System.out.print("City: ");
            s = in.nextLine();
            if (!chek(s)) break;
            sity.add(s);
            System.out.print("Thername: ");
            s = in.nextLine();
            if (!chek(s)) break;
            thernames.add(s);
        }
    }
    public static boolean chek(String s){
        if (s.equalsIgnoreCase("stop")) return false;
        else return true;
    }

    public static List<String> find(List<String> sity, List<String> thernames){
        Iterator<String> iterator = sity.listIterator();
        Iterator<String> iterator1 = thernames.listIterator();
        String city;
        List<String> result = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("In which city do you want to find people?");
        city = in.nextLine();
        while (iterator.hasNext() && iterator1.hasNext()){
            if (city.equalsIgnoreCase(iterator.next()))
                 result.add(iterator1.next());
            else iterator1.next();
        }
        return result;
    }
}
