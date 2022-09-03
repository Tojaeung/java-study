package jcf.map;

import java.util.HashMap;
import java.util.Scanner;

public class ch1_HashMap {
    public static void main(String[] args) {
        /*
         * 순서 없음, 키 중복 허용안함, 값 중복허용
         * 해싱기법으로 데이터 저장해서 검색이 빠르다
         * */
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("password", "1111");

        System.out.println(map);

        // 키의 값 덮어쓰기
        map.put("password", "9999");

        System.out.println(map);

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("아이디 패스워드 입력해주세요");
            System.out.println("id: ");
            String id = s.nextLine().trim();

            System.out.println("password: ");
            String password = s.nextLine().trim();

            if (!map.containsKey(id)) {
                System.out.println("존재하지 않는 아이디 입니다.");
                continue;
            }

            if (!(map.get(id).equals(password))) {
                System.out.println("비밀번호가 일치하지 않습니다.");
            } else {
                System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
                break;
            }


        }


    }
}
