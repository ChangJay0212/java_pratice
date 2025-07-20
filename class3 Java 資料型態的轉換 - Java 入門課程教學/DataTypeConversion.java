public class DataTypeConversion{    
    public static void main(String[] args) {
        // 大範圍到小範圍:需要使用 (資料型態) 強制轉換
        int x = 3;
        //byte y = x; // 錯誤，因為 byte 的範圍是 -128 到 127，而 int 的範圍更大
        // 正確的做法是使用強制轉換
        byte y = (byte) x; // 強制轉換
        
        // 整數型態轉換為浮點數型態
        int intValue = 10;
        double doubleValue = intValue; // 自動轉換
        System.out.println("整數轉浮點數: " + doubleValue);

        // 浮點數型態轉換為整數型態
        double anotherDoubleValue = 9.99;
        int anotherIntValue = (int) anotherDoubleValue; // 強制轉換
        System.out.println("浮點數轉整數: " + anotherIntValue);

        // 字串轉整數
        String strNumber = "123";
        int strToInt = Integer.parseInt(strNumber);
        System.out.println("字串轉整數: " + strToInt);

        // 整數轉字串
        int number = 456;
        String intToStr = String.valueOf(number);
        System.out.println("整數轉字串: " + intToStr);

        // 字串轉浮點數
        String strFloat = "3.14";
        double strToDouble = Double.parseDouble(strFloat);
        System.out.println("字串轉浮點數: " + strToDouble);

        // 浮點數轉字串
        double floatNumber = 2.718;
        String doubleToStr = String.valueOf(floatNumber);
        System.out.println("浮點數轉字串: " + doubleToStr);
    }
}