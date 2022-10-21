public class Main {
    public static void main(String[] args) {
        Mashyna mashyna = new Mashyna(2011, 190, 1264,"black");
        Mashyna mashyna1 = new Mashyna(2020, 240, 1444, "Blue");


        mashyna.setColor("White");
        mashyna.setAge(2022);


        System.out.println("Mashyna: "+ "Age: "+mashyna.getAge()+" Speed: "+ mashyna.getSpeed()+" Weight: "+mashyna.getWeight()+" Color: "+mashyna.getColor());
        System.out.println("Mashyna1: "+ "Age: "+mashyna1.getAge()+" Speed: "+ mashyna1.getSpeed()+" Weight: "+mashyna1.getWeight()+" Color: "+mashyna1.getColor());

        BigCar bigCar = new BigCar("Kia", 2011, 1462, "Black");
        BigCar bigCar1 = new BigCar("Opel", 2019, 1681, "Black");

        System.out.println("Big car: "+ "Name: "+bigCar.name +" Age: "+ bigCar.age+" Weight: "+bigCar.weight+" Color: "+bigCar.color);
        System.out.println("Big car: "+ "Name: "+bigCar1.name +" Age: "+ bigCar1.age+" Weight: "+bigCar1.weight+" Color: "+bigCar1.color);

        ConstOnetoFour constOnetoFour = new ConstOnetoFour(28, "Svitlana", 1000, "Slavutych");
        System.out.println("My name is "+ constOnetoFour.name + " and my age is " +constOnetoFour.age + ". I live in " + constOnetoFour.city + " and the salary I'm aiming for the first is " +constOnetoFour.salary +".");





    }
}