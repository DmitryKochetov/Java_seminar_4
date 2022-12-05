// * В калькулятор добавьте возможность отменить последнюю операцию.

// для реализации отмены пришлось взять код из лекции с калькулятором и добавить еще один резервный стек для хранения последних введенных значений

package DZ;

import java.util.*;

public class task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        Stack<Integer> stRes = new Stack<>();

        while (true) {
            System.out.println();
            System.out.println(
                    "Введите число строку вида \"a b\" c арифметическим действием после цифр или введите \"undo\" для отмены последней операции: ");
            String a = scanner.nextLine();

            var exp = a.split(" ");
            int res = 0;

            if (a.equals("")) {
                break;
            }
            if (a.equals("undo")) {
                System.out.println(stRes);
                System.out.println("Введите новую операцию: ");
                String newOp = scanner.nextLine();
                switch (newOp) {
                    case "+":
                        res = stRes.pop() + stRes.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -stRes.pop() + stRes.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = stRes.pop() * stRes.pop();
                        st.push(res);
                        break;
                    case "/":
                        res = stRes.pop() / stRes.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
                System.out.printf("%d\n", st.pop());
                break;
            }

            System.out.println(Arrays.toString(exp));

            for (int i = 0; i < exp.length; i++) {

                if (isDigit(exp[i])) {
                    st.push(Integer.parseInt(exp[i]));
                    stRes.push(Integer.parseInt(exp[i]));
                } else {
                    switch (exp[i]) {
                        case "+":
                            res = st.pop() + st.pop();
                            st.push(res);
                            break;
                        case "-":
                            res = -st.pop() + st.pop();
                            st.push(res);
                            break;
                        case "*":
                            res = st.pop() * st.pop();
                            st.push(res);
                            break;
                        case "/":
                            res = st.pop() / st.pop();
                            st.push(res);
                            break;
                        default:
                            break;
                    }
                }
            }
            System.out.printf("%d\n", st.pop());
        }
        scanner.close();

        // System.out.println(st);
        // System.out.println("stRes = " + stRes);

    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
