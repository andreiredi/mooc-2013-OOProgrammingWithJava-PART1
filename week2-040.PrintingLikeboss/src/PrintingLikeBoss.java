public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while (amount > 0) {
            System.out.print('*');
            amount--;
    }


    public static void printWhitespaces(int amount) {
        while (amount < 0) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // 40.2
    }

    public static void xmasTree(int height) {
        // 40.3
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
