import math.BasicMath;
// import math.geometry.Rectangle;
class App {
    public static void main(String[] args) {
        // 使用 BasicMath 類中的靜態方法
        int sum = BasicMath.add(5, 10);
        int product = BasicMath.multiply(4, 6);

        // 輸出結果
        System.out.println("Sum: " + sum);          // 輸出: Sum: 15
        System.out.println("Product: " + product);  // 輸出: Product: 24
        // 使用 Rectangle 類中的靜態方法
        double width = 5.0;
        double height = 10.0;
        double area = math.geometry.Rectangle.area(width, height);
        double perimeter = math.geometry.Rectangle.perimeter(width, height);

        // 輸出結果
        // System.out.println("Rectangle Golden Ratio: " + Rectangle.GOLDEN_RATIO);
        // System.out.println("Area: " + area);          // 輸出: Area: 50.0
        // System.out.println("Perimeter: " + perimeter); // 輸出: Perimeter: 30.0

        System.out.println("Golden Ratio: " + BasicMath.get_golden_ratio()); // 輸出: Golden Ratio: 1.6180339887
    }
}