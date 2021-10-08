package inner.Static;

import inner.nonStatic.OuterClass;

public class OuterC {
    public int a = 5;

    public static class InnerClass{
        public static int a = 10;

        public static void run(){
            int a = 1;
            System.out.println(a); //1 gelir.
            System.out.println(InnerClass.a); //10 gelir.
            //System.out.println(OuterC.this.a);

        }
    }
    public void run(){
        //Statik sınıf old. için nesne üretmeye gerek kalmadan ulaşabiliyorum.
        InnerClass.run();
    }

}
