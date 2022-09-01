public class Main {
    public static void main(String[] args) {
        //Задание 1
        var age=19;
        if (age>=18) {
        System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age<18) {
        System.out.println("Возраст совершннолетия не наступил");
        }

        //Задание 2
        var bage=23;
        if (bage>=7 && bage<18) {
            System.out.println("Иди в школу!");
        }
        if (bage>=18 && bage<24) {
            System.out.println("Иди в институт!");
        }
        if (bage>=24) {
            System.out.println("Ищи работу!");
        }

        //Задание 3
        var sold=53;
        var capacity=102;
        var seats=60;
        if (sold>capacity) {
            System.out.println("Мест нет!");
        }
        if (sold<=seats) {
            System.out.println("У вас сидячее место");
        }
        if (sold>seats && sold<=capacity) {
            System.out.println("У вас стоячее место");
        }

        //Задание Б-1
        var cage=17;
        if (cage>=18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершннолетия не наступил");
        }

        //Задание Б-2
        var abage=25;
        if (abage>=7 && abage<18) {
            System.out.println("Иди в школу!");
        }
        if (abage>=18 && abage<24) {
            System.out.println("Иди в институт!");
        } else {
            System.out.println("Ищи работу!");
        }

        //Задание Б-3
        var asold=100;
        var acapacity=102;
        var aseats=60;
        boolean ifsold=asold<acapacity;
        System.out.println(ifsold);
        if (asold>aseats && asold<=acapacity) {
            System.out.println("У вас стоячее место");
        } else {
            System.out.println("У вас сидячее место");
        }

        //Задание В-1
        var dage=24;
        boolean ifdage=dage>2;
        System.out.println(ifdage);
        if (dage>=2 && dage<=6) {
            System.out.println("Если возраст человека равен "+dage+", то ему нужно ходить в детский сад.");
        }
        if (dage>=7 && dage<=18) {
            System.out.println("Если возраст человека равен "+dage+", то ему нужно ходить в школу.");
        }
        if (dage>=18 && dage<24) {
            System.out.println("Если возраст человека равен "+dage+", то ему нужно ходить в институт.");
        } else {
            System.out.println("Если возраст человека равен "+dage+", то ему нужно ходить на работу.");
        }

        //Задание В-2
        var eage=14;
        if (eage<5) {
            System.out.println("Ты не можешь кататься на атракционе!");
        }
        if (eage>=5 && eage<14) {
            System.out.println("Ты можешь кататься на атракционе в сопровождении взрослого!");
        } else {
            System.out.println("Ты можешь кататься на атракционе!");
        }

        //Задание В-3
        int one=1;
        int two=4;
        int free=3;
        if (one>two && one>free) {
            System.out.println("One самое большое число "+one);
        } else {
            System.out.println("One не подходит " +one);
        }
            if (two>one && two>free) {
                System.out.println("Two самое большое число "+two);
            } else {
                System.out.println("Two не подходит "+two);
            }
            if (free>two && free>one) {
                System.out.println("Free самое большое число "+free);
        } else {
                System.out.println("Free не подходит"+free);
            }
    }
}