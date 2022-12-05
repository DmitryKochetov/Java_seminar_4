// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

//решил вывод метода реализовать через второй связанный список, формируемый от первого

package DZ;

import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkList = new LinkedList<Integer>();
        LinkedList<Integer> linkListReversed = new LinkedList<Integer>();
        for (int j = 0; j < 10; j++) {
            linkList.add(j);
        }
        for (Integer i : linkList) {
            linkListReversed.addFirst(i);
        }
        
        System.out.println(linkList);
        System.out.println(linkListReversed);
    }
}
