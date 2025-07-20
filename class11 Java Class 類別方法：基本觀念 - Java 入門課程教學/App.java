class Test{
    public static void main(String[] args) {
        talk(); // 呼叫靜態方法
        Test.talk("t111"); // 呼叫 Test1 類別的靜態方法
    }
    static void talk() {
        System.out.println("Hello, World!");
    }
    static void talk(String message) {
        System.out.println(message);
    }
}