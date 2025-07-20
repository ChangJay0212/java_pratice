import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        // 定義要寫入和讀取的檔案名稱
        String fileName = "output.txt";

        // 1. 寫入檔案
        // 使用 try-with-resources 語法，會自動關閉 FileWriter 和 BufferedWriter
        try (
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            System.out.println("開始寫入檔案: " + fileName);
            bufferedWriter.write("這是第一行文字。");
            bufferedWriter.newLine(); // 寫入一個換行符號
            bufferedWriter.write("Hello, Java I/O!");
            bufferedWriter.newLine();
            bufferedWriter.write("寫入結束。");
            System.out.println("檔案寫入成功！");
        } catch (IOException e) {
            System.err.println("寫入檔案時發生錯誤: " + e.getMessage());
        }

        System.out.println("\n--------------------\n");

        // 2. 讀取檔案
        // 同樣使用 try-with-resources
        try (
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            System.out.println("開始讀取檔案: " + fileName);
            String line;
            // 每次讀取一行，直到檔案末尾 (readLine() 返回 null)
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("檔案讀取完畢！");
        } catch (IOException e) {
            System.err.println("讀取檔案時發生錯誤: " + e.getMessage());
        }
    }
}
