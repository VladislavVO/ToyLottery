import java.util.ArrayList;
import java.util.List;

public class Programm {
    public static void main(String[] args) {

        List<Toy> listToys = new ArrayList<Toy>();

        ToyStore toys = new ToyStore(listToys);

        List<Toy> prizeToys = new ArrayList<Toy>();

        Menu m = new Menu();
        MenuAction ma = new MenuAction();

        toys.addToy("Toy1", 10, 10);
        toys.addToy("Toy2", 15, 15);
        toys.addToy("Toy3", 20, 20);

        
        while (true) {
            m.showMenu();
            if (m.getAction() == 0) {
                System.out.println("Лотерея окончена");
                break;
            } else {
                System.out.println("Меню: " + m.getAction());
                ma.selectAction(m.getAction(), toys, prizeToys);
            }
        }
    }
}