public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        while (amount > 0) {
            System.out.print('*');
            System.out.println();
            amount--;
        }
    }

    public static void printSquare(int sideSize) {
        int ruut = sideSize;
        while (ruut > 0) {
            printStars(sideSize);
            System.out.println();
            ruut--;
        }
    }

    public static void printRectangle(int width, int height) {
        while (height > 0) {
            printStars(width);
            System.out.println();
            height--;
        }
    }

    public static void printTriangle(int size) {
        int nurk = size;
        int rida = 1;
        while (nurk > 0) {
            printStars(rida);
            rida++;
            System.out.println();
            nurk--;
        }

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
