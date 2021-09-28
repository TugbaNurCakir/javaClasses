class Car {
    //qualifications
    String type= "sedan"; //bu kullanım yanlış. Varsayılan değerleri constructor içinde yazman daha doğru.
    String model;
    String color;
    int speed;
    int speedLimit=190;

    //Constructor method
    /*
    Kurucu metotlar sınıf tasarlanırken yazılırlar.
     Sınıfınızı yazarken kurucu metotlarınızı da tanımlayabilirsiniz.
      Eğer sınıf içinde hiç kurucu metot tanımlamazsınız parametresiz boş bir kurucu metot
      Java tarafından otomatik olarak tanımlanır.
      Kurucu metotlar ilgili sınıftan bir nesne üretmeye çalıştığınızda daha nesne üretme aşamasında
      çalıştırılan özel metotlardır (fonksiyonlardır). Kurucu metotların isimleri Sınıf ismiyle aynı olmak zorundadır.
      Dönüş tipi olarak veya void olarak herhangi bir tanımlama yapılmasına gerek yoktur.
    */

    Car (String model, int speed){ //bu parametrelerin sırası aynen nesne oluşturulurken de parametrelerde aynı sırada değer atanmalıdır.
        //Car audi     = new Car("audi800", 100); //bu yazım daha doğru
        this.model = model;
        this.speed = speed;
        System.out.println("nesne oluştu.");
    }


    //behaviours
    void increaseSpeed(int increment){
        if((speed+increment) < speedLimit){
            this.speed+=increment;
        }

    }
    void decrease(int decrease){
        if(speed > 0) {
            this.speed -= decrease;
        }
    }

    void printSpeed(){
        System.out.println("Your speed is: "+this.speed);
    }
}
