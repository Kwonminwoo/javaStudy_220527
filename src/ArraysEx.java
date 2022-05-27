import java.util.Arrays;

public class ArraysEx {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Arrays.fill(arr, 0); // 배열에 모든 요소를 0으로 초기화
        System.out.println("arr = " + Arrays.toString(arr)); // arr.toString으로 배열의 모든 요소를 출력
        
        int [] arr2 = Arrays.copyOf(arr, 5); // 배열을 크기 만큼 복사
        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("Arrays.equals(arr, arr2) = " + Arrays.equals(arr, arr2)); // 배열간 모든 요소를 검사하여 같으면 true

        int [] arr3 = Arrays.copyOf(arr, arr.length); // 배열을 크기 만큼 복사
        System.out.println("Arrays.equals(arr, arr3) = " + Arrays.equals(arr, arr3));
        
        int [] arr4 = {1, 5, 3, 7, 5, 10};
        Arrays.sort(arr4); // 배열을 오름차순으로 정렬
        System.out.println("Arrays.toString(arr4) = " + Arrays.toString(arr4));
        int i = Arrays.binarySearch(arr4, 3); // binary검색 반드시 sort이후에 해야 됨 올바른 값이 나옴
        System.out.println("i = " + i); // 인덱스 1번에 3이 저장됨을 확인 가능
    }
}
