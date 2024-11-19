package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        App.run();
    }
}

class App {
    public static void run() {
        System.out.println("== 명언 앱 ==");
        // 스캐너(키보드(System.in)을 스캔하는) 객체를 생성
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("명령) ");
            // sacnner.nextline
            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) {
                break;
            }
        }

        scanner.close();
    }
}