//(39)Продемонструйте у коді способи обробки виключних ситуацій у методі (з try-catch и  throws), а також
//особливості використання блока finally. У якості обробляємо виключення оберіть будь яке =checked= виключення.
public class exercise39 {
    public int getFactorial(int num) throws Exception{

        if(num<1) throw new Exception("The number is less than 1");
        int result=1;
        for(int i=1; i<=num;i++){

            result*=i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Exercise39:");
        exercise39 exercise = new exercise39();
        try{
//            int result = getFactorial(1);
            int result = exercise.getFactorial(1);

            System.out.println(result);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

    }
}
