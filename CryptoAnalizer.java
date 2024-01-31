import java.util.Scanner;

public class CryptoAnalizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 1;
        switch (value){

            //шифровка
            case 1:{
                //проверить есть ли файл с исходным текстом
                System.out.println("Введите имя файла с исходным текстом.");
                String originFile = scanner.nextLine();

                //проверить есть ли файл с куда записать. Если нет- создать
                System.out.println("Введите имя файла для записи результата.");
                String resultFile = scanner.nextLine();

                //проверить ключ на валидацию
                System.out.println("Введите ключ.");
                int key = scanner.nextInt();




            }
        }
    }
}
