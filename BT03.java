//Viết một chương trình Java để tính tổng của các phần tử trong một danh sách
// sử dụng phương thức forEach() của lớp List

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BT03 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 8, 23, 1);
        AtomicInteger sum = new AtomicInteger(); // Khởi tạo biến - lưu trữ tổng các phần tử

        // Tính tổng bằng forEach
        numbers.forEach(number -> sum.addAndGet(number));
        System.out.println("Tổng các phần tử trong danh sách: " + sum);
    }
}
