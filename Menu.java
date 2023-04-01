import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private int action;

    public Menu() {
        this.action = 0;
    }

    public int getAction() {
        return action;
    }

    private String[] arr_action = new String[]{
            "Выход",
            "Лотерея",
            "Вывод списка игрушек",
            "Вывод списка призовых игрушек",
            "Вывод списка выданных игрушек",
            "Выдать призовую игрушку",
            "Добавить игрушку",
            "Изменить шанс выпадения",
    };

    private void showText(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " - " + arr[i]);
        }
    }

    public double getNumber() {
        double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("Попробуй ещё раз");
            scanner.next(); 
            num = getNumber();
        }
        return num;
    }


    private void setAction() {
        while (true) {
            System.out.println("Меню");
            showText(arr_action);
            action = (int) getNumber();
            
            if (action < arr_action.length && action >= 0) {
                break;
            }
        }
    }

    public void showMenu() {
        setAction();
    }
}