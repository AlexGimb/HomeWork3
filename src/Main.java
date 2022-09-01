public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }
    public static void task1(){
        int age = 125;
        if (age >= 22) {
        System.out.println("Поздравляем с совершеннолетием");
        } else {
        System.out.println("Совершеннолетие ещё не наступило,нужно немного подождать");
        }
    }
    public static void task2(){
        System.out.println();
        int age = 15;
        boolean school = (age >= 7 && age <= 18);
        boolean student = (age > 18 && age < 24);
        boolean kindergarten = (age >=2 && age <=6);
        if (kindergarten) {
            System.out.printf("Если возраст человека равен %d , то ему нужно ходить в детский сад", age);
        }else if (school) {
            System.out.printf("Если возраст человека равен %d , то ему нужно ходить в школу", age);
        }else if (student) {
            System.out.printf("Если возраст человека равен %d , то ему нужно ходить в университет", age);
        } else
            System.out.printf("Если возраст человека равен %d , то ему пора ходить на работу", age);

    }
    public static void task3(){
        System.out.println();
        System.out.println();
        int passengers = 45;
        int freePlaces = 102-passengers;
        int seatPlace = freePlaces - 42;
        boolean seatPlace1 = passengers < 60;
        boolean place = passengers < 102;
        boolean standingPlaces1 = passengers >= 60;
        if (place) {
        if (seatPlace1)
            System.out.printf("В вагоне осталось %d мест, из них сидячих мест %d, стоячих мест 42", freePlaces, seatPlace);
        }
        if (place){
        if (standingPlaces1)
            System.out.printf("В вагоне осталось %d мест, сидячих мест нет, стоячих мест %d", freePlaces,freePlaces);
        }
        else {
            System.out.println("Вагон полный, мест нет");
        }
    }
    public static void task4(){
        System.out.println();
        System.out.println();
        int age = 15;
        boolean no = age<5;
        boolean yesNo = age>=5 && age<=14;
        boolean yes = age>14;
        if (no){
            System.out.println("Ребенку нельзя кататься на аттракционе");
        }
        else if (yesNo) {
            System.out.println("Ребенок может кататься на аттракционе, но в сопровождение взрослого");
        }
        else{
            System.out.println("Ребенок может кататься на аттракционе ");
        }
    }
    public static void task5(){
        System.out.println( );
        int one;
        int two;
        int free;
        one = 10;
        two = 220;
        free = 30;
        if (one > two && one > free){
            System.out.printf("Больше число %d", one);
        }else if (two > one && two > free){
            System.out.printf("Больше число %d", two);
        }else
            System.out.printf("Больше число %d", free);;
    }
}






