package ab;
public class BlockMainClass {
    public static void main(String[] args) {
        Block b = new Block();
        if (b.getGpa() > 3.5) {
            System.out.println("gpa=3.5");
        } else {
            System.out.println("gpa<3.5");
        }
    }
}
