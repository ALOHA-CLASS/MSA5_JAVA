package 문제.가장가까운문자;

import java.util.HashMap;

/**
 * 문자열 s가 주어졌을 때, s의 각 위치마다 자신보다 앞에 나왔으면서, 
 * 자신과 가장 가까운 곳에 있는 같은 글자가 어디 있는지 알고 싶습니다.
    예를 들어, s="banana"라고 할 때,  
    각 글자들을 왼쪽부터 오른쪽으로 읽어 나가면서 다음과 같이 진행할 수 있습니다.
 */
public class Test {

    public static void main(String[] args) {
        // 문자열 입력
        String s = "banana";
        HashMap<Character, Integer> map = new HashMap<>();
        
        // 결과
        int[] answer = new int[s.length()];

        // 중복을 제거하고 저장하는 자료구조 --> Set
        // Set.add()  -- 중복 : false, 중복X : true
        // HashMap 
        // put() : key 중복되지 않고 마지막 값으로 지정
        
        // 문자열을 한글자씩 접근
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);  // 한글자씩

            // 조건 : 중복 여부
            if( map.containsKey( ch ) ) {
                int last = map.get( ch );   // ? : 마지막 중복된 문자의 위치
                answer[i] = i - last;       // i - ?   : 가장 가까운 문자 위치
            } else {
                answer[i] = -1;
            }

            map.put(ch, i);     // 마지막 나온 문자의 위치 갱신
        }

        // 결과 출력
        for (int item : answer) {
            System.out.print(item + " ");
        }
    }
}

