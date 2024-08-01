//Viết chương trình Java tạo ngẫu nhiên một List số nguyên có tối đa 10 phần tử
// rồi in List số nguyên đó,
// sau đó sử dụng phương thức Collections.max() của lớp Collections
// để tìm và in ra phần tử lớn nhất

import java.util.*;

public class BT01 {
    public static void main(String[] args) {
        Random randdom = new Random(); // tạo đối tượng
        List<Integer> numbers = new ArrayList<>(); // tạo danh sách
        int maxElements = 10; // Xác nhận số phần tử tối đa

        // Tạo danh sách số nguyên ngẫu nhiên
        int size = randdom.nextInt(maxElements + 1); // Kích thước ngẫu nhiên từ 0 - 10
        for (int i = 0; i < size; i++) {
            numbers.add(randdom.nextInt(101));  // số ngẫu nhiên từ 0 - 100
        }

        // In danh sách
        System.out.println("Danh sách số ngẫu nhiên: " + numbers) ;

        // Tìm phần tử lớn nhất
        if (!numbers.isEmpty()) { // Kiểm tra danh sách không rỗng
            int maxElement = Collections.max(numbers);
            System.out.println("Phần tử lớn nhất trong danh sách: " + maxElement);
    } else {
            System.out.println("Danh sách rỗng");
        }
    }
}
