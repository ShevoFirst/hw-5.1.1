public class Main {
    public static void main(String[] args) {
        //Задание 1.
        for (int i = 1; i<=10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        //Задание 2.
        for (int i = 10; i>=1; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        //Задание 3.
        for (int i = 0; i<=17; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        //Задание 4.
        for (int i = 10; i>=-10; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        //Задание 5.
        for (int i = 1904; i<=2096; i+=4){
            System.out.println(i+" год является високосным ");
        }
        System.out.println();
        //Задание 6.
        for (int i = 7; i<100; i+=7){
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println();
        //Задание 7.
        for (int i = 1; i<513; i*=2){
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println();
        //Задание 8,9.
        int salary = 29000;
        int total = 0;
        for (int i = 1; i<=12; i++){
            total*=1.01;
            total+=salary;
            System.out.println("месяц: " + i +" сумма накоплений равна:" + total);
        }
        System.out.println();



    }
}