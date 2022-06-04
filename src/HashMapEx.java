import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    static HashMap phoneBook = new HashMap();
    public static void main(String[] args) {
        addPhoneNo("친구", "이자바", "010-1234-5678");
        addPhoneNo("친구", "이커리", "010-3333-3333");
        addPhoneNo("친구", "김해이", "010-1366-8888");
        addPhoneNo("직장", "박과장", "010-7887-8228");
        addPhoneNo("직장", "김대리", "010-3337-1128");
        addPhoneNo( "세탁", "010-5555-4422");

        printList();
    }
    // 그룹 추가
    static void addGroup(String groupName){
        if(!phoneBook.containsKey(groupName))
            phoneBook.put(groupName, new HashMap()); // Key Value는 모두 Object로 받기 때문에 뭘 넣어도 문제 x
    }

    // 그룹에 전화번호를 추가
    static void addPhoneNo(String groupName, String name, String tell){
        addGroup(groupName);
        HashMap group = (HashMap) phoneBook.get(groupName);
        group.put(tell, name); // phoneBook의 value로 저장된 HashMap에 put하는 코드
    }

    static void addPhoneNo(String name, String tell){
        addPhoneNo("기타", name, tell);
    }

    // 전화번호 전체 출력
    static void printList(){
        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()){
            Map.Entry e = (Map.Entry) it.next(); // entrySet으로 반환한 값은 Map.Entry로 받을 수 있다.

            Set subSet = ((HashMap) e.getValue()).entrySet(); // value로 저장된 sub Map을 한번 더 entrySet으로 꺼내줌
            Iterator subIt = subSet.iterator();

            System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");

            while (subIt.hasNext()){
                Map.Entry subE = (Map.Entry) subIt.next();
                String telNo = (String) subE.getKey();
                String name = (String) subE.getValue();
                System.out.println(name + " " + telNo);
            }
            System.out.println();
        }
    }
}
