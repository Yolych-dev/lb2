//Продемонстрируйте при перехопленні виключення ArithmeticException,
// можливості усунути помилку у даних та виконати завдання у повному обсязі.
public class exercise38 {
    //    public static int ArithmeticException(int number1, int number2) throws Exception {
//
//        if (number2 == 0) throw new Exception("Arithmetic Exception: cannot divide by 0");
//        int function = number1 / number2;
//        return function;
//
//    }
//    public static void main(String[] args) throws Exception {
//        System.out.print("Exercise38:");
//        try {
//            int function = ArithmeticException(100,1);
//            System.out.println(function);
//        }
//        catch(ArithmeticException ex){
//            System.out.println(ex.getMessage());
//        }
//
//    }


    public int Arithmetic(int number1, int number2) throws ArithmeticException {

        if (number2 == 0) throw new ArithmeticException("Arithmetic Exception: cannot divide by 0");
        int function = number1 / number2;
        return function;

    }

    class ArithmeticException extends Exception {

        public ArithmeticException(String message) {
            super(message);
        }
    }

        public static void main(String[] args) throws ArithmeticException {
            System.out.print("Exercise38:");

            try {
//                int function = Arithmetic(100, 0);
                exercise38 exercise = new exercise38();
                int function = exercise.Arithmetic(100,0);
                System.out.println(function);
            } catch (ArithmeticException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }

