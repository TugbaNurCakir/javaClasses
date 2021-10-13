public class Main {
    public static void main(String[] args) {
        //boxing: primitive yani ilkel bir değişkeni wrapper hale getiriyor.
        //unboxing: wrapper sınıfında olan bir değişkeni ilkel hale dönderir.

                    //boxing
        int primitveA = 10;
        Integer wrapperA = Integer.valueOf(primitveA);

                    //autoboxing
        int primitveB = 10;
        Integer wrapperB = primitveB;

                    //unboxing
        int d = wrapperB.intValue();

                    //autoUnBoxing
        int e = wrapperA;

    }
}
