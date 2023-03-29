import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Sneakers[] sneakers = new Sneakers[10];
        sneakers[0] = new Football("fs1", 100, "pr1", "Belarus");
        sneakers[1] = new Basketball("bs1", 100, "pr2", "USA");
        sneakers[2] = new Fitness("fis1", 80, "pr3", "China");
        sneakers[3] = new Football("fs1", 100, "pr1", "Belarus");
        sneakers[4] = new Basketball("bs1", 100, "pr2", "USA");
        sneakers[5] = new Fitness("fis1", 80, "pr3", "China");
        sneakers[6] = new Football("fs1", 100, "pr1", "Belarus");
        sneakers[7] = new Basketball("bs1", 100, "pr2", "USA");
        sneakers[8] = new Fitness("fis1", 80, "pr3", "China");
        sneakers[9] = new Fitness("fis1", 80, "pr3", "China");

        for(byte i = 0; i < 1; i--) {
            System.out.println("Выберите опцию меню:");
            System.out.println("1. Вывести количество производителей");
            System.out.println("2. Вывести среднюю стоимость обуви по производителю");
            System.out.println("3. Вывести среднюю стоимость обуви по типу");
            System.out.println("4. Завершить программу");
            byte action = scan.nextByte();
            if (action == 1) {
                System.out.println(ProducersCount(sneakers));
            } else if(action == 2) {
                System.out.print("Введите название производителя: ");
                scan.nextLine();
                String producer = scan.nextLine();
                System.out.println(ProducerCost(sneakers, producer));
            } else if(action == 3) {
                System.out.print("Введите название типа: ");
                scan.nextLine();
                String type = scan.nextLine();
                System.out.println(TypeCost(sneakers, type));
            } else if (action == 4){
                break;
            } else {
                System.out.println("Ошибка выбора.");
            }
        }
    }
    public static int ProducersCount(Sneakers sneakers[]) {
        int count = 0;
        String[] memory = new String[10];
        for(byte i = 0; i < sneakers.length; i++) {
            for(byte j = 0; j < memory.length; j ++) {
                if(sneakers[i].ProducerName().equals(memory[j]) == false & j == sneakers.length - 1) {
                    memory[i] = sneakers[i].ProducerName();
                    count++;
                    break;
                } else if(sneakers[i].ProducerName().equals(memory[j])) {
                    break;
                }
            }
        }
        return count;
    }
    public static double TypeCost(Sneakers sneakers[], String type) {
        double cost = 0;
        double count = 0;
        for(byte i = 0; i < sneakers.length; i++) {
            if(sneakers[i].Type().equals(type)) {
                cost += sneakers[i].Cost();
                count++;
            }
        }
        cost /= count;
        return cost;
    }
    public static double ProducerCost(Sneakers sneakers[], String producer) {
        double cost = 0;
        double count = 0;
        for(byte i = 0; i < sneakers.length; i++) {
            if(sneakers[i].ProducerName().equals(producer)) {
                cost += sneakers[i].Cost();
                count++;
            }
        }
        cost /= count;
        return cost;
    }
}