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
            System.out.print("�޴��� �����ϼ���: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // ���� ���� ó��

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
                    System.out.println("���α׷��� �����մϴ�.");
                    break;
                default:
                    System.out.println("�߸��� �޴� �����Դϴ�. �ٽ� �������ּ���.");
            }

            System.out.println();
        }
    }

    private void printMenu() {
        System.out.println("===== �޴� =====");
        System.out.println("1. �л� ���� �Է�");
        System.out.println("2. �л� ���� ���");
        System.out.println("3. ��ü �л� ���� ���");
        System.out.println("4. �л� ���� ����");
        System.out.println("5. �����ϱ�");
    }

    private void addStudentInfo() {
        System.out.print("�л��� �̸��� �Է��ϼ���: ");
        String name = scanner.nextLine();

        System.out.print("Java ������ �Է��ϼ���: ");
        int javaScore = scanner.nextInt();
        scanner.nextLine(); // ���� ���� ó��

        System.out.print("Web ������ �Է��ϼ���: ");
        int webScore = scanner.nextInt();
        scanner.nextLine(); // ���� ���� ó��

        Integer[] scores = { javaScore, webScore };
        StudentInfoData.addStudentInfo(name, scores);
        System.out.println("�л� ������ ����Ǿ����ϴ�.");
    }

    private void printStudentInfo() {
        System.out.print("����� �л��� �̸��� �Է��ϼ���: ");
        String searchKey = scanner.nextLine();

        StudentInfoData.printStudentInfo(searchKey);
    }

    private void printAllStudentInfo() {
        System.out.println("��ü �л� ����:");
        StudentInfoData.printAllStudentInfo();
    }

    private void deleteStudentInfo() {
        System.out.print("������ �л��� �̸��� �Է��ϼ���: ");
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
            System.out.println("�̸�: " + searchKey + ", Java ����: " + studentScores[0] + ", Web ����: " + studentScores[1]);
        } else {
            System.out.println("�ش� �л��� ������ ã�� �� �����ϴ�.");
        }
    }

    public static void printAllStudentInfo() {
        for (String key : hashtable.keySet()) {
            Integer[] studentScores = hashtable.get(key);
            System.out.println("�̸�: " + key + ", Java ����: " + studentScores[0] + ", Web ����: " + studentScores[1]);
        }
    }

    public static void deleteStudentInfo(String deleteKey) {
        if (hashtable.containsKey(deleteKey)) {
            hashtable.remove(deleteKey);
            System.out.println("�л� ������ �����Ǿ����ϴ�.");
        } else {
            System.out.println("�ش� �л��� ������ ã�� �� �����ϴ�.");
        }
    }
}
