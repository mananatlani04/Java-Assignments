class P {
    public static void main(String[] args) {
        double SA= 149; 
        double h= 6;       
        double pi = 3.14;
        double a = 1;
        double b = h;
        double c = - (SA/ (2 *pi));
        double discriminant = b * b - 4 * a * c;
   if (discriminant < 0) {
            System.out.println("No real solution (discriminant is negative).");
   } else {
            double sqrtDiscriminant = Math.sqrt(discriminant);
            double radius = (-b + sqrtDiscriminant) / (2 * a);
            double diameter = 2 * radius;
            System.out.printf("Radius = %.2f cm\n", radius);
            System.out.printf("Diameter = %.2f cm\n", diameter);
        }
    }
}