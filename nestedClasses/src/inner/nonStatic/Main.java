package inner.nonStatic;

public class Main {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        out.run();
        //Main alanında içteki class a erişim sağlamk için ;
        //eğer sınıflar statik ise böyle  OuterClass.InnerClass in = new OuterClass.InnerClass;
        //Değilse
        OuterClass.InnerClass in= out.new InnerClass(); //dış sınıftan üretilen nesnenin üzerine üretilir.
        in.run();
    }
}
