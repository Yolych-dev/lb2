//(51)На тестовому прикладі продемонструйте відмінності використання змінних,методів звичайних та static методів
// та змінних. Використовуйте модель, яка потребує підраховувати  кількість створених об'єктів певного типу,
// використайте для цього static- змінні.
class Exercise51 {

    static int Counter = 0;

    {
        Counter += 1;
    }
    public Exercise51() {}

    public Exercise51(int n) {}

    public Exercise51(String s) {}


    public static void main(String[] args) {
        System.out.print("Exercise51:");
        Exercise51 t1 = new Exercise51();
        Exercise51 t2 = new Exercise51();
        Exercise51 t3 = new Exercise51(5);
        Exercise51 t4= new Exercise51(10);
        Exercise51 t5 = new Exercise51("abc");
        Exercise51 t6 = new Exercise51("cbd");


        System.out.println(Exercise51.Counter);

    }
}