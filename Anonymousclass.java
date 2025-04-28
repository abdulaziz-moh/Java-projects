public class Anonymousclass {

    public static void main(String[] args) {
        System.out.println("Here we are going check an inner Anonymous class called 'abebe' inside 'Anonymousclass' ");
        abebe.canCook("doro");
        // Lambda with an expression body - returns the result of the expression
        Adder adder = (a, b) -> a + b;
        int sum = adder.add(5, 3); // sum will be 8
    }

    public static cooknow abebe = new cooknow() {
        String[] cooked = { "doro", "cake", "bread" };

        public void canCook(String name) {
            boolean status = true;
            for (String str : cooked) {
                if (str == name) {
                    System.out.println("YES HE CAN COOK!!!");
                    status = false;
                }
            }
            if (status) {
                System.out.println("NO HE CAN'T COOK THAT!!!");
            }

        }

    };

    void print() {
        abebe.canCook("doro");
    }

}

interface cooknow {
    void canCook(String name);
}

// Functional interface with an int return type
interface Adder {
    int add(int a, int b);
}
