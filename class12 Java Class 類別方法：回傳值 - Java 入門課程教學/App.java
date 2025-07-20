class Test{
    public static void main(String[] args) {
        talk(); // 呼叫靜態方法
        Test.talk("t111"); // 呼叫 Test1 類別的靜態方法
        System.out.println("加法結果: " + BasicMath.add(5, 3)); // 呼叫靜態方法進行加法
        System.out.println("乘法結果: " + BasicMath.multiply(5, 3)); // 呼叫靜態方法進行乘法
    }
    static void talk() {
        System.out.println("Hello, World!");
    }
    static void talk(String message) {
        System.out.println(message);
    }
}

class BasicMath{
    static int add(int a, int b) {
        return a + b;
    }
    static int multiply(int a, int b) {
        return a * b;
    }
}