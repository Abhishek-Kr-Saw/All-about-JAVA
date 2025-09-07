package Methods;

public class OverloadedMethods {
    public static void main(String[] args){

        // overloaded methods = methods that share the same name,
        //                      but different parameters
        //                      signature = name + parameters

        String pizza1 = bakePizza("flat-bread", "mozzarella", "pepperoni");
        String pizza2 = bakePizza("flat-bread", "mozzarella");
        String pizza3 = bakePizza("flat-bread");

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);

    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
    }
}
