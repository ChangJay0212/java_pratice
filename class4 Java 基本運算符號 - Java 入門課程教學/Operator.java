public class Operator {
    public static void main(String[] args) {
        // 加法
        int a = 5;
        int b = 3;
        int sum = a + b;
        System.out.println("加法結果: " + sum);

        // 減法
        int difference = a - b;
        System.out.println("減法結果: " + difference);

        // 乘法
        int product = a * b;
        System.out.println("乘法結果: " + product);

        // 除法
        double quotient = (double) a / b; // 強制轉換為浮點數以避免整數除法
        System.out.println("除法結果: " + quotient);

        // 模運算
        int remainder = a % b;
        System.out.println("模運算結果: " + remainder);
         // 比較運算
        boolean isEqual = (a == b);
        System.out.println("a 等於 b: " + isEqual);

        boolean isNotEqual = (a != b);
        System.out.println("a 不等於 b: " + isNotEqual);

        boolean isGreater = (a > b);
        System.out.println("a 大於 b: " + isGreater);

        boolean isLess = (a < b);
        System.out.println("a 小於 b: " + isLess);

        boolean isGreaterOrEqual = (a >= b);
        System.out.println("a 大於或等於 b: " + isGreaterOrEqual);

        boolean isLessOrEqual = (a <= b);
        System.out.println("a 小於或等於 b: " + isLessOrEqual);
    }
}

       
    
