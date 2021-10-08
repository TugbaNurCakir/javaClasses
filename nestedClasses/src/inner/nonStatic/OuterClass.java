package inner.nonStatic;

public class OuterClass {
    public int a = 5;

    public class InnerClass{
        public int a = 10;

        public void run(){
            int a = 1;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(OuterClass.this.a);
            //Inner sınıfında outer sınıfındaki bir değişkene ulaşmak için bunu yazmak -> (OuterClass.this.a) yeterlidir.
        }
    }
    public void run(){
        InnerClass inner = new InnerClass(); //Bu nesneyi üretmezsem outer class ı inner class ındaki run metoduna erişim sağlayamaz.
        inner.run();
    }

}
