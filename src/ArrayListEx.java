import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10); // 10개 공간의 리스트(어레이리스트) 배열을 생성
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1, 4)); // 리스트의 인덱스 1 ~ 4까지의 서브 리스트를 만듬
        print(list1, list2);
        Collections.sort(list1); // 내림차순 정렬
        Collections.sort(list2);
        print(list1, list2);

        System.out.println("list1.containsAll(list2) = " + list1.containsAll(list2)); // list1이 list2의 모든 요소를 포함하고 있으면 true

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        System.out.println("list1.retainAll(list2) = " + list1.retainAll(list2)); // list1의 list2요소와 겹치는 것을 남기고 나머지는 삭제
        print(list1, list2);

        /**
         *  list2에서 list1과 겹치는 요소가 있으면 그것을 삭제
         *  끝에서 부터 하는 이유는 리스트클래스는 앞에 요소가 비면 자동으로 뒤에것을 앞으로 밀어주기 때문에 정확히 나오지않는다.
         */
        for(int i = list2.size() - 1;i >= 0;i--){
            if(list1.contains(list2.get(i))){
                list2.remove(i);
            }
        }
        print(list1, list2);
    }

    private static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println();
    }
}
