package patterns;

public class pattern7 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k > i; k--) {
                System.out.print("*");
            }
            for (int l = 4; l > i; l--) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j2 = 0; j2 < i; j2++) {
                System.out.print("*");                
            }
            for (int k = 1; k < i; k++) {
                System.out.print("*");                
                
            }
            System.out.println(); 
        }
    }
}
