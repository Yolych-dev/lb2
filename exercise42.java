//(42)Продемонструйте у коді генерацію свого виключення AgeStudentException у конструкторі класу Student
// при спробі створити об'єкт зі значенням віку помилковим.



class exercise42 {

   public class Student {
        int age;

        Student(int age) throws AgeException {
            if (age < 0)
                throw new AgeException("Age can't be under zero");
            this.age = age;
        }

       void display() {
           System.out.println("Age=" + age);
       }
    }
    class AgeException extends Exception{

     public AgeException(String message){
         super(message);
     }
    }
    public static void main(String[] args) {
    exercise42 exercise = new exercise42();

        try {
            System.out.print("Exercise42:");
//            Student student = new Student(-4);
              Student student = exercise.new Student(-4);

            student.display();
        }
        catch(AgeException ex){
            System.out.println(ex.getMessage());
        }
    }


}
