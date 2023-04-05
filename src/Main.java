
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog+=4;
        cat+=4;
        paper+=4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog+=4;
        cat+=4;
        paper+=4;
        dog-=3.5;
        cat-=1.6;
        paper-=7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend+=2;
        System.out.println(friend);
        friend/=7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog*=10;
        System.out.println(frog);
        frog/=3.5;
        System.out.println(frog);
        frog+=4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println(totalWeight);
        var differenceWeight = boxer2 - boxer1;
        System.out.println(differenceWeight);
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var differenceWeight1 = boxer2 - boxer1;
        System.out.println(differenceWeight1);
        var differenceWeight2 = boxer2 % boxer1;
        System.out.println(differenceWeight2);

    }
    public static void task8 () {
        System.out.println("Задача 8");
        var hours = 640;
        var employeeWorks = 8;
        var employee=hours / employeeWorks;
        System.out.println("Всего работников в компании- " + employee +" человек.");
        var employee2 = 94;
        var hours2=employee2*employeeWorks;
        var hoursTogether=hours2+hours;
        var employeeTogether=employee+employee2;
        System.out.println("Если в компании работает " + employeeTogether +" человек, то всего "
                + hoursTogether + " часов работы может быть поделено между сотрудниками.");


    }
}