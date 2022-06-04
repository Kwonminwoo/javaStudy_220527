import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        final int boardSize = 5; // 보드판 사이즈
        Set set = new HashSet(); // Set인터페이스를 상속 받은 HashSet을 선언
        int [][] board = new int[boardSize][boardSize]; // 보드 판

        for(int i = 0;set.size() < (boardSize * boardSize); i++){
            set.add((int) (Math.random() * (boardSize * boardSize * 2)) + 1 + ""); // set은 중복이면 자동으로 저장하지 않는다
        }
        Iterator iterator = set.iterator();
        for(int i = 0; i < board.length;i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt((String) iterator.next()); // iterator의 반환값이 Object여서 String으로 바꿔줌
                System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]); // 한 자리 수라면 두칸 띄워 칸 두 자리 수와 크기를 맞춰줌
            }
            System.out.println();
        }
    }
}