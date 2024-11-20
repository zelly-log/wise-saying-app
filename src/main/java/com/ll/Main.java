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
            int wise_num = 1;
            while (true) {
                System.out.print("명령) ");
//                System.out.println("입력된 명령어: %s".formatted(cmd));
                String cmd = scanner.nextLine();
                if (cmd.equals("종료")) {
                    break;
                } else if (cmd.equals("등록")) {
                    System.out.print("명언 : ");
                    String wise_saying = scanner.nextLine();
                    System.out.print("작가 : ");
                    String author = scanner.nextLine();
                    System.out.println(wise_num + "번 명언이 등록되었습니다.");
                    ++wise_num;
                }
                // 5단계 저장된 명언들 보여 주기
                else if (cmd.equals("목록")) {
                    System.out.println("번호 / 작가 / 명언");
                    System.out.println("---------------");
//                    while (true) {
//                        System.out.println(wise_num);
//                    }
                }
            } scanner.close();
        }
    }