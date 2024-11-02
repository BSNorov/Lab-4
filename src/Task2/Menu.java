package Task2;

import java.util.Scanner;

public class Menu {
    private Scanner sc;
    private Validator validator;

    public Menu(Scanner scanner) {
        this.sc = scanner;
        this.validator = new Validator(scanner);
    }

    public void showMainMenu() {
        boolean exit = false;

        while (!exit) {
            printMainMenu();
            int choice = validator.getValidChoice(1, 4);

            switch (choice) {
                case 1:
                    performCalculation();
                    break;
                case 2:
                    printProgramInfo();
                    break;
                case 3:
                    printDeveloperInfo();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Выход из программы...");
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите один из пунктов меню.");
            }
        }
    }

    private void printMainMenu() {
        System.out.println("\nГлавное меню:");
        System.out.println("1. Выполнить расчет");
        System.out.println("2. Информация о программе");
        System.out.println("3. Информация о разработчике");
        System.out.println("4. Выход");
        System.out.print("Выберите пункт меню: ");
    }

    private void performCalculation() {
        double length = validator.getPositiveDouble("Введите длину прямоугольника (положительное число): ");
        double width = validator.getPositiveDouble("Введите ширину прямоугольника (положительное число): ");
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
    }

    private void printProgramInfo() {
        System.out.println("Эта программа предназначена для расчета площади прямоугольника.");
    }

    private void printDeveloperInfo() {
        System.out.println("Разработчик: Бехруз, студент магистратуры по направлению 'Разработка и управление в программных проектах!'");
    }
}
