//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        int age = 20;
        if (age >= 18){
            System.out.println("Вы старше 18-ти лет!");
        }
        else {
            System.out.println("Вам меньше 18-ти лет, пока не получится:)");
        }
        System.out.println(" ");

        System.out.println("Задача № 2");
        int eirTemperature = 3;
        if (eirTemperature < 5){
            System.out.println("На улице " + eirTemperature + " градусов, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + eirTemperature + " градусов, шапку можно не надевать");
        }
        System.out.println(" ");

        System.out.println("Задача № 3");
        int carSpeed = 75;
        if (carSpeed > 60){
            System.out.println("Ваша скорость " + carSpeed + " км/ч, придётся заплатить штраф...");
        }
        else {
            System.out.println("Ваша скорость " + carSpeed + " км/ч, можно спокойно ехать...");
        }
        System.out.println(" ");

        System.out.println("Задача № 4");
        int agePeople = 25;
        if (agePeople >= 2 && agePeople <= 6){
            System.out.println("Если возраст человека равен " + agePeople + " то ему нужно ходить в сетский сад...");
        } else if (agePeople >= 7 && agePeople <= 17){
            System.out.println("Если возраст человека равен " + agePeople + " то ему нужно ходить в школу...");
        } else if (agePeople >= 18 && agePeople <= 24){
            System.out.println("Если возраст человека равен " + agePeople + " то ему нужно ходить в университет...");
        }else{
            System.out.println("Вам " + agePeople + " порабы уже и поработать:)");
        }
        System.out.println(" ");

        System.out.println("Задача № 5");
        int ageChild = 10;
        boolean anAdultRelative = true;
        if (ageChild < 5){
            System.out.println("Если возраст ребенка равен " + ageChild + " , то ему нельзя кататься на аттракционе");
        } else if (ageChild >= 5 && ageChild <= 14 && anAdultRelative){
            System.out.println("Если возраст ребенка равен " + ageChild + " , то ему можно кататься на аттракционе " +
                    "в сопровождении взрослого");
        } else if (ageChild > 14){
            System.out.println("Если возраст ребенка равен " + ageChild + " , то ему можно кататься на аттракционе " +
                    "без сопровождении взрослого");
        }
        System.out.println(" ");

        System.out.println("Задача № 6");
        int totalPassengers = 102;
        int seatedPassengers = 60;
        int standingPassengers = totalPassengers - seatedPassengers;
        int actuallyTotalPassengers = 52;
        int overcrowdingOfPassengers = actuallyTotalPassengers - totalPassengers;
        int weNeedMorePassengers = totalPassengers - actuallyTotalPassengers;
        int weNeedMoreSeatedPassengers = seatedPassengers - actuallyTotalPassengers;
        if (totalPassengers < actuallyTotalPassengers){
            System.out.println("Вагон переполнен на " + overcrowdingOfPassengers + " пассажиров, " +
                    "перейдите в другой вагон или дождитесь следующего поезда!");
        } else if (totalPassengers == actuallyTotalPassengers){
            System.out.println("Вагон заполнен, можно отправляться!");
        } else if (totalPassengers > actuallyTotalPassengers){
            System.out.println("В вагоне есть " + weNeedMorePassengers + " свободных мест");
            if (actuallyTotalPassengers < seatedPassengers){
                System.out.println("В вагоне есть  " + weNeedMoreSeatedPassengers + " свободных мест для сидения и " +
                        "есть " + standingPassengers + " стоячих месть!");
            } else if (actuallyTotalPassengers == seatedPassengers){
                System.out.println("В вагоне больше нет свободных месть для сидения" + standingPassengers +
                        " стоячих месть!");
            }if (actuallyTotalPassengers > seatedPassengers){
                    System.out.println("В вагоне осталось " + weNeedMorePassengers + " стоячих месть!");
            }
        }
        System.out.println(" ");

        System.out.println("Задача № 7");
        int one = 567;
        int two = 29;
        int three = 72;
        int largestNumber =0;
        if (one > two && one > three){
            largestNumber = one;
        } else if (two > one && two > three){
            largestNumber = two;
        } else if (three > one && three > two){
            largestNumber = three;
        }
        System.out.println("У нас есть три числа: one = " + one + ", two = " + two + " и three = " + three + " ,- " +
                "большее из них равно " + largestNumber);
    }
}