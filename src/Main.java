public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 5;

        if (age>=18)
            System.out.println("Совершеннолетний");
        else
            System.out.println("Несовершенство");

//        задача 2
        age = 22;
        if (age<7)
            System.out.println("Детский сад");
        else {
            if (age < 18)
                System.out.println("Школа");
            else {
                if (age < 24)
                    System.out.println("Универ");
                else
                    System.out.println("все кончено");
            }
        }

//        задача 3
        int sitCapacity = 60;
        int totalCapacity = 102;
        int standCapacity = totalCapacity - sitCapacity;

        int sitPlaces = 60;
        int standPlaces = 42;

        if (sitPlaces<sitCapacity)
            System.out.println("Свободных сидячих мест: "+(sitCapacity-sitPlaces));
        if (standPlaces<standCapacity)
            System.out.println("Свободных стоячих мест: "+(standCapacity-standPlaces));
        if ((sitPlaces == sitCapacity) && (standPlaces == standCapacity))
            System.out.println("Свободных мест нет");


//        task 4
        if (age<2)
            System.out.println("Не обязан");
        if ((age>=2)&&(age<=6))
            System.out.println("Нужно ходить в детский сад");
        if ((age>=7)&&(age<=18))
            System.out.println("Нужно ходить в школу");
        if  ((age>=18)&&(age>=24))
            System.out.println("Место в универе");
        if (age>24)
            System.out.println("Пора на работу");

        //Задача 2
        age = 9;
        System.out.println("Возраст " + age);
        if(age<5)
            System.out.println("Не может кататься на аттракционе");
        if ((age>=5)&&(age<14))
            System.out.println("Только в сопровождении взрослого");
        if (age>=14)
            System.out.println("Может кататься без сопровождения");

        //Задача 3
        int one = 1;
        int two = 2;
        int free = 3;

        if((one>=two)&&(one>=free))
            System.out.println("one "+ one);
        else {
            if((two>=one)&&(two>=free))
                System.out.println("two "+ two);
            else
            if((free>=two)&&(free>=one))
                System.out.println("free "+ free);


        }
    }
}