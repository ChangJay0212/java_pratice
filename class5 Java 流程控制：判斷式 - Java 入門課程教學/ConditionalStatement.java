import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("請輸入一個整數: ");
        int number = scanner.nextInt();
        
        // 判斷奇偶性
        if (number % 2 == 0) {
            System.out.println(number + " 是偶數");
        } else {
            System.out.println(number + " 是奇數");
        }
        
        // 判斷正負
        if (number > 0) {
            System.out.println(number + " 是正數");
        } else if (number < 0) {
            System.out.println(number + " 是負數");
        } else {
            System.out.println("輸入的數字是零");
        }
        
       

        // switch 語句範例
        System.out.print("請輸入一個星期幾 (1-7): ");   
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("輸入錯誤，請輸入1到7之間的數字");
        }
        scanner.close();
    }
}