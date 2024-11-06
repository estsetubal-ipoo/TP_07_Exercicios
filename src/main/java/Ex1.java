public class Ex1 {
    public static int max(int a, int b, int c) {
        int max = a;
        max = (b > max) ? b : max;
        return (c > max) ? c : max;
    }
    public static void main(String[] args) {
        int result = max(5, 7, 1);
        System.out.println(result);

        result = max(7, 5, 1);
        System.out.println(result);

        result = max(1, 7, 5);
        System.out.println(result);
    }
}
