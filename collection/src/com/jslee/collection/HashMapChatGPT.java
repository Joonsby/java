package com.jslee.collection;

import java.util.Hashtable;
import java.util.Scanner;

public class HashMapChatGPT {
    private static Hashtable<String, Integer[]> hashtable = new Hashtable<>();

    public static void main(String[] args) {
        StudentInfoManager manager = new StudentInfoManager();
        manager.runProgram();
    }
}

class StudentInfoManager {
    private Scanner scanner;

    public void runProgram() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            printMenu();
            System.out.print("메뉴를 선택하세요: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 처리

            switch (choice) {
                case 1:
                    addStudentInfo();
                    break;
                case 2:
                    printStudentInfo();
                    break;
                case 3:
                    printAllStudentInfo();
                    break;
                case 4:
                    deleteStudentInfo();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택입니다. 다시 선택해주세요.");
            }

            System.out.println();
        }
    }

    private void printMenu() {
        System.out.println("===== 메뉴 =====");
        System.out.println("1. 학생 정보 입력");
        System.out.println("2. 학생 정보 출력");
        System.out.println("3. 전체 학생 정보 출력");
        System.out.println("4. 학생 정보 삭제");
        System.out.println("5. 종료하기");
    }

    private void addStudentInfo() {
        System.out.print("학생의 이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("Java 성적을 입력하세요: ");
        int javaScore = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        System.out.print("Web 성적을 입력하세요: ");
        int webScore = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        Integer[] scores = { javaScore, webScore };
        StudentInfoData.addStudentInfo(name, scores);
        System.out.println("학생 정보가 저장되었습니다.");
    }

    private void printStudentInfo() {
        System.out.print("출력할 학생의 이름을 입력하세요: ");
        String searchKey = scanner.nextLine();

        StudentInfoData.printStudentInfo(searchKey);
    }

    private void printAllStudentInfo() {
        System.out.println("전체 학생 정보:");
        StudentInfoData.printAllStudentInfo();
    }

    private void deleteStudentInfo() {
        System.out.print("삭제할 학생의 이름을 입력하세요: ");
        String deleteKey = scanner.nextLine();

        StudentInfoData.deleteStudentInfo(deleteKey);
    }
}

class StudentInfoData {
    private static Hashtable<String, Integer[]> hashtable = new Hashtable<>();

    public static void addStudentInfo(String name, Integer[] scores) {
        hashtable.put(name, scores);
    }

    public static void printStudentInfo(String searchKey) {
        if (hashtable.containsKey(searchKey)) {
            Integer[] studentScores = hashtable.get(searchKey);
            System.out.println("이름: " + searchKey + ", Java 성적: " + studentScores[0] + ", Web 성적: " + studentScores[1]);
        } else {
            System.out.println("해당 학생의 정보를 찾을 수 없습니다.");
        }
    }

    public static void printAllStudentInfo() {
        for (String key : hashtable.keySet()) {
            Integer[] studentScores = hashtable.get(key);
            System.out.println("이름: " + key + ", Java 성적: " + studentScores[0] + ", Web 성적: " + studentScores[1]);
        }
    }

    public static void deleteStudentInfo(String deleteKey) {
        if (hashtable.containsKey(deleteKey)) {
            hashtable.remove(deleteKey);
            System.out.println("학생 정보가 삭제되었습니다.");
        } else {
            System.out.println("해당 학생의 정보를 찾을 수 없습니다.");
        }
    }
}
