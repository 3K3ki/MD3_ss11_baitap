import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {
        String s = "Able was I ere I saw Elba";

        // Khởi tạo Stack và Queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Đọc chuỗi vào Stack và Queue
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                stack.push(Character.toLowerCase(c));
                queue.add(Character.toLowerCase(c));
            }
        }

        // Kiểm tra Stack và Queue có giống nhau không
        while (!stack.empty()) {
            if (!stack.pop().equals(queue.remove())) {
                System.out.println("Chuỗi không phải là chuỗi Palindrome");
                return;
            }
        }

        System.out.println("Chuỗi là chuỗi Palindrome");
    }
}
