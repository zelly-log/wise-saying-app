package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // app은 변수명
        App app = new App();
        // 앱을 실행
        app.run();
    }
}

    class App {
        public void run() {
            // 입력 받기 위해 스캐너 생성
            Scanner scanner = new Scanner(System.in);
            System.out.println("=== 명언 앱 ===");
            while (true) {
                System.out.print("명령) ");
//                System.out.println("입력된 명령어: %s".formatted(cmd));
                String cmd = scanner.nextLine();
                if (cmd.equals("등록")){
                    System.out.print("명언 : ");
                    String wise_saying = scanner.nextLine();
                    System.out.print("작가 : ");
                    String author = scanner.nextLine();
                }

                // 문자열은 ==으로 비교할 수 없고, .equals로 비교
                if (cmd.equals("종료")){
                    break;
                }
            }
            scanner.close();
        }
    }




