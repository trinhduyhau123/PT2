public class Quataric {
    public static void main(String[] args) {
        Coursing c = new Coursing();
        System.out.println(c);
    }

}

class Coursing {
    private double a, b, c;

    @Override
    public String toString() {
        if (getDiscriminant() > 0) {
            return "r1 = " + getRoot1() + "r2" + getRoot2();
        } else if (getDiscriminant() == 0) {
            return "r1 = " + getRoot1();
        } else {
            return "NOT FOUND";
        }
    }

    public Coursing() {
        a = 1;
        b = 3;
        c = 9;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getRoot1() {
        return (-b + (Math.pow(Math.pow(b, 2.0) - 4 * a * c, 0.5))) / (2 * a);
    }

    public double getRoot2() {
        return (-b - (Math.pow(Math.pow(b, 2.0) - 4 * a * c, 0.5))) / (2 * a);
    }

    public double getDiscriminant() {
        return (b * b - 4 * a * c);
    }
}