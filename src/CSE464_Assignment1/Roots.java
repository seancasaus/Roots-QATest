package CSE464_Assignment1;

class Roots {
    static double num_roots; //number of square roots in quadratic equation
    static double root_one; //value of first root
    static double root_two; //value of second root

    public static void calculate_roots(double a, double b, double c) {

        double q;
        double r;
        q= b*b - 4*a*c;

        if(q > 0 && a != 0) {
            // if b^2 > 4ac, there are two roots
            num_roots = 2;
            r=(double) Math.sqrt(q);
            root_one = ((0-b)+r)/(2*a);
            root_two = ((0-b)-r)/(2*a);
        }else if(q == 0) {
            // the equation has exactly one root
            num_roots = 1;
            root_one = (0-b)/(2*a);
            root_two = root_one;
        } else {
            // the equation has no roots if b^2 < 4ac
            num_roots = 0;
            root_one = -1;
            root_two = -1;
        }
    }

    public static double num_roots() {

        return num_roots;
    }

    public static double first_root() {

        return root_one;
    }

    public static double second_root() {

        return root_two;
    }
}

