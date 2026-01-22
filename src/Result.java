import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Stack;

/**
 *
 * @author STS
 * @since 1/22/2026
 *
 */

public class Result {

    /*
     * Complete the 'areBracketsProperlyMatched' function below.
     *
     * The function is expected to return a BOOLEAN.
     * The function accepts STRING code_snippet as parameter.
     */

    public static boolean areBracketsProperlyMatched(String code_snippet) {
        Stack<Character> stack = new Stack<>();

        //split all characters to char array

        for (char c : code_snippet.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.add(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                if ((c == ')' && stack.peek() != '(') ||
                        (c == '}' && stack.peek() != '{') ||
                        (c == ']' && stack.peek() != '[')
                ) {
                    return false;
                }

                stack.pop();

            }
        }
        return stack.isEmpty();
    }
}
