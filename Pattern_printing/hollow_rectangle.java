public class hollow_rectangle {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < 6; col++) {
                if (row == 0 || row == 3) {
                    System.out.print("* ");
                } else {
                    if (col == 0) {
                        System.out.print("* ");
                    } else if (col == 5) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

    }

}
