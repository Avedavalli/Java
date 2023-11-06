public class Pattern {
    public static void main(String[] args) {
        String s = "*";
        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(s);
            }
            System.out.println("");
        }
        System.out.println('B'+'A');
    }

}
