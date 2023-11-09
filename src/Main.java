import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(200,300);


        Bear bear = new Bear();
        System.out.println("Пишите вид медведя");
        String str = scanner.nextLine();
        System.out.println("Задай вопрос касаемое еды");
        System.out.println("Задай вапрос касаемое спячки");
        String method = "Что кушаеть медведь";
        String method1 = "Сколько они спять";
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println("Вид медведя "+str);
        System.out.println("Масса медведя "+a+"kg");

        if (Objects.equals(str1, method)) {
            bear.eating();

        }else
            System.out.println("Тура жазчы");

        if (Objects.equals(str2, method1)) {
            bear.sleeping();
        }else
            System.out.println("Тура жазчы");

        }






    }
