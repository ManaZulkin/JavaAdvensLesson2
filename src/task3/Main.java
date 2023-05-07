package task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = input();
        List<Integer> integerList = new LinkedList<>();
        getIntegerList(integerList, n);
        System.out.println(integerList);
        System.out.println("Minimum: " + getMinimum(integerList));
    }

    public static void getIntegerList(List<Integer> intList, int N){
        Random random = new Random(N);
        for (int i = 0; i < N; i++){
            intList.add(random.nextInt(100));
        }
    }

    public static int getMinimum(List<Integer> integerList){
        int min = integerList.get(0), num;
        ListIterator<Integer> iterator = integerList.listIterator();
        while (iterator.hasNext()){
            num = iterator.next();
            if (min > num) min = num;
        }
        return min;
    }

    public static int input(){
        System.out.println("Enter number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        return n;
    }
}
