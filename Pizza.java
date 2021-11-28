public class Pizza {
    public Pizza(char siz, char cru, int m1, int m2, int m3, int t1, int t2, int t3, int t4, int t5, int t6, int n) {
        char size = siz;
        char crust = cru;
        int ham = m1;
        int pepperoni = m2;
        int sausage = m3;
        int cheese = t1;
        int pepper = t2;
        int onion = t3;
        int tomato = t4;
        int mushroom = t5;
        int pineapple = t6;
        int quantity = n;

        System.out.println("size: " + size + ", " + "crust: " + crust);
        System.out.println("meat: " + ham + ", " + pepperoni + ", " + sausage);
        System.out.println("toppings: " + cheese + ", " + pepper + ", " + onion + ", " + tomato + ", ");
        System.out.print(mushroom + ", " + pineapple + ", ");
        System.out.println("quantity: " + quantity);
    }
}
