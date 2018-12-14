package lam;

public class Main {

    public static void main(String[] args) {

        MyInterface myAnonimusInterface = new MyInterface() {
            @Override
            public String go(String s, int a) {
                return s + a + "Implementacja w 'anonmimowej' klasie";
            }
        };

        MyInterface myLambda = (s, a) -> s + a + "Implementacja w 'zwykłej' klasie";

        System.out.println(myLambda.go("a", 2));
        System.out.println("1");
        useLambdaOrAnonymousInterface(new MyFriststImplementation(), "a", 1);
        System.out.println("2");
        useLambdaOrAnonymousInterface(myAnonimusInterface, "a", 1);
        System.out.println("3");
        useLambdaOrAnonymousInterface(myLambda, "a", 1);
        System.out.println("4");
        useLambdaOrAnonymousInterface((s, i) -> s + i, "a", 1);
        System.out.println("---");
    }

    public static void useLambdaOrAnonymousInterface(MyInterface myInterface, String s, int a) {
        System.out.println(myInterface.go(s, a));
    }
}

@FunctionalInterface
interface MyInterface {
    String go(String s, int a);
}

class MyFriststImplementation implements MyInterface {

    @Override
    public String go(String s, int a) {
        return s + a + "Implementacja w 'zwykłej' klasie";
    }

}
