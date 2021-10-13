public class wrapper {
    //Java da 8 tane primitive type vardır. Bunlara karşılık gelen sınıflara wrapper adı verilir.
    /*
    Wrapper’larda çok kullandığımız bazı fonksiyonlar vardır.
    valueOf() methodu bir String’i Wrapper’a çevirir.
    xxxValue() methodları için;
    shortValue() methodu bir Wrapper’ı primitive çevirir.
    byteValue() methodu bir Wrapper byte çevirir.
    parseXXX için;
    parseInt() methodu Wrapper primitive çevirir.
     */
    public static void main(String[] args) {
        int num = Integer.parseInt("5");
        System.out.println(num);
    }
}
