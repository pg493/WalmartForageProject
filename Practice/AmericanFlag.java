package Practice;

public class AmericanFlag {
    public static void main(String[] args) {
        for(int i=1;i<16;i++) {
            if(i<=9) {
                if(i%2!=0) {
                    for(int j=1;j<=6;j++) {
                        System.out.print("* ");
                    }
                }
                else {
                    for(int j=1;j<=5;j++) {
                        System.out.print(" *");
                    }
                    System.out.print("  ");
                }
                for(int j=1;j<=34;j++) {
                    System.out.print("=");
                }
            }
            else {
                for(int j=1;j<=46;j++) {
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }
}
