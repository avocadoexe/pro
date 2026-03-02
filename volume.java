import java.util.*;

class Calculation
{
    double v;

   
    void volume(double a)
{
        v = a * a * a;
        System.out.println("Volume of cube = " + v);
    }

   
    void volume(double l, double b, double h)
{
        v = l * b * h;
        System.out.println("Volume of rectangular box = " + v);
    }

   
    void volume(double r, double h)
{
        v = 3.14 * r * r * h;
        System.out.println("Volume of cylinder = " + v);
    }
}

class Maincalc
{
    public static void main(String args[])
{
        double a, l, b, h, r;
        Scanner sc = new Scanner(System.in);
        Calculation c = new Calculation();

        System.out.println("Enter the side of cube:");
        a = sc.nextDouble();
        c.volume(a);

        System.out.println("Enter the length, width and height of the rectangular box:");
        l = sc.nextDouble();
        b = sc.nextDouble();
        h = sc.nextDouble();
        c.volume(l, b, h);

        System.out.println("Enter the radius and height of the cylinder:");
        r = sc.nextDouble();
        h = sc.nextDouble();
        c.volume(r, h);
    }
}
