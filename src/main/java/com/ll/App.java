package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private final Scanner scanner;
    private int wise_num;
    private final List<WiseSaying> wiseSayings;

    public App(){
        scanner = new Scanner(System.in);
        wise_num = 0;
        wiseSayings = new ArrayList<>();
    }

    public void run() {
        System.out.println("=== 명언 앱 ===");

        // 샘플 데이터 생성
        makeSampleData();

        while (true) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine();
            if (cmd.equals("종료")) {
                break;
            } else if (cmd.equals("등록")) {
                actionAdd();
            } else if (cmd.equals("목록")) {
                actionlist();
            } else if (cmd.startsWith("삭제")) {
                // 이 코드로는 . 이나 한글처럼 숫자가 아닌 변환 불가한 내용이 들어갔을 때 터짐
                System.out.println("삭제할 번호를 입력해 주세요.");
                String deleteNum = scanner.nextLine();
                int deleteId = 0;
                try {
                    deleteId = Integer.parseInt(deleteNum);
                }
                catch ( NumberFormatException e ) {
                    System.out.println("숫자를 입력해주세요.");
                    continue;
                }
                actionDelete(deleteId);
            }
        }
        scanner.close();
    }

    private void makeSampleData() {
        addWiseSaying("sample 1","sampel_1");
        addWiseSaying("sample 2","sampel_2");
    }

    private WiseSaying addWiseSaying(String content, String author) {
        int id = ++wise_num;

        WiseSaying wiseSaying = new WiseSaying(id, content, author);

        wiseSayings.add(wiseSaying);

        return wiseSaying;
    }

    private void actionAdd() {
        System.out.print("명언 : ");
        String content = scanner.nextLine();
        System.out.print("작가 : ");
        String author = scanner.nextLine();

        WiseSaying wiseSaying = addWiseSaying(content, author);

        System.out.println("%d번 명언이 등록되었습니다.".formatted(wiseSaying.getId()));

    }

    private void actionlist() {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("---------------");

        for(WiseSaying wiseSaying : wiseSayings.reversed()) {
            System.out.println("%d / %s / %s".formatted(wiseSaying.getId(), wiseSaying.getAuthor(), wiseSaying.getContent()));
        }
    }

    private void actionDelete(int deleteId) {
        boolean removed = wiseSayings.removeIf(wiseSaying -> wiseSaying.getId() == deleteId);
        if (removed) System.out.println("%d번 명언을 삭제했습니다.".formatted(deleteId));
        else System.out.println("%d번 명언은 존재하지 않습니다.".formatted(deleteId));
    }
}
