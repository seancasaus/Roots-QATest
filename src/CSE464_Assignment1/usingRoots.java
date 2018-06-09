package CSE464_Assignment1;

/**
 * Created by shawn on 9/5/2017.
 */

public class usingRoots {
    public static void main(String[] args) {
        double a = 4;
        double b = 2;
        double c = 4;

        Roots.calculate_roots(a,b,c);
        System.out.println("Number of Roots: " + Roots.num_roots());
        System.out.println("Square Root of One: " + Roots.first_root());
        System.out.println("Square Root of Two: " + Roots.second_root());
    }
}
