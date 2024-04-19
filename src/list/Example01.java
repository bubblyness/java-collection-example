package list;

import java.util.ArrayList;

public class Example01 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>() {
            {
                add(1);
                add(2);
                add(3);
                add(6);
                add(-9);
                add(1289);
                add(0);
                add(-7);
            }
        };

        // 조회 -> 반횐 타입은 타입 매개변수와 동일
//        int currentNumber = list.get(5);

        // 추가
        list.add(1);

        // 삭제 -> 지우는 값을 리턴
        list.remove(2);

        // 크기
//        list.size();

        // 여기 아래 질문 return 뒤에 뭐 넣었지?
//        for (int i = 0; i < list.size(); i++) {
//            return i;
//        }

        list.add(0, 999890);
        System.out.println(list.size());
        list.remove(0);
//
//        Collections.sort(list);
//        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);
    }
}