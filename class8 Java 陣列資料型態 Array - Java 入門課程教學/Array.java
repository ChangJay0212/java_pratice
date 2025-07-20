import java.util.HashMap;
import java.util.ArrayList;
public class Array {
    public static void main(String[] args) {
        // 定義一個整數陣列
        int[] numbers = {1, 2, 3, 4, 5};

        // 訪問陣列元素
        System.out.println("第一個元素: " + numbers[0]);
        System.out.println("第二個元素: " + numbers[1]);

        // 修改陣列元素
        numbers[0] = 10;
        System.out.println("修改後的第一個元素: " + numbers[0]);

        // 使用 for 迴圈遍歷陣列
        System.out.print("陣列元素: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        } 
        // HashMap 範例 dictionary
        HashMap<String, Integer> map = new HashMap<>();
        map.put("第一個元素", numbers[0]);
        map.put("第二個元素", numbers[1]);
        System.out.println("HashMap 元素: " + map);
        // ArrayList 範例
        ArrayList<Integer> list = new ArrayList<>();
        list.add(numbers[0]);
        list.add(numbers[1]);
        list.add(3);
        System.out.println("ArrayList 元素: " + list);
        // StringBuilder 範例 他就是用來拼接字串的
        // StringBuilder 是一個可變的字串類型，可以用來高效地拼接字串
        StringBuilder sb = new StringBuilder();
        sb.append("第一個元素: ").append(numbers[0]).append("\n");
        sb.append("第二個元素: ").append(numbers[1]).append("\n");
        sb.append("第三個元素: ").append("test");
        System.out.println("StringBuilder 元素: " + sb.toString());
        // 高維陣列範例
        int[][] multiArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        ArrayList<ArrayList<Integer>> multiList = new ArrayList<>();
        for (int i = 0; i < multiArray.length; i++) {
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < multiArray[i].length; j++) {
                innerList.add(multiArray[i][j]);
            }
            multiList.add(innerList);
        }
        System.out.println("多維陣列元素: " + multiList);
    }

}