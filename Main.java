public class Main {

    static int countOf(int[] a, int x) {
        int c = 0;
        for (int v : a) {
            if (v == x) {
                c++;
            }
        }
        return c;
    }

    static int majority(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Пустой массив");
        }

        int cand = 0;
        int balance = 0;
        int i = 0;
        while (i < a.length) {
            if (balance == 0) {
                cand = a[i];
            }
            if (a[i] == cand) {
                balance++;
            } else {
                balance--;
            }
            i++;
        }

        if (countOf(a, cand) > a.length / 2) {
            return cand;
        }
        throw new IllegalArgumentException("Мажоритарного элемента нет");
    }

    public static void main(String[] args) {
        int[] data = {2, 1, 2, 3, 4, 2, 1, 2, 2};
        System.out.println(majority(data));
    }
}
