class Test1{
    static int a = 10; // 靜態變數
    static String name = "Test1"; // 靜態變數
}
class Test2{
    static double a = 3.14; // 靜態變數
    static String name = "Test2"; // 靜態變數
    public static void main(String[] args) {
        // 訪問 Test1 的靜態變數
        System.out.println("Test1 a: " + Test1.a);
        System.out.println("Test1 name: " + Test1.name);
        
        // 訪問 Test2 的靜態變數
        System.out.println("Test2 a: " + Test2.a);
        System.out.println("Test2 name: " + Test2.name);
    }
}