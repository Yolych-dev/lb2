//(33)Створіть enum Посади, яке відповідає можливій структурі посад підприємства. Продемонструйте  можливість
// задавати властивості, конструктори та методи в enum. Забезпечте при цьому можливості змінювати посадові
// оклади та кількість днів відпустки.
public class exercise33 {
    enum Post {
        Manager,
        Engineer,
        Main_Engineer,
    }
    public class Company {
        Post post;
        int salary;
        int holiday;

        Company(Post post,int salary,int holiday) {
            this.post = post;
            this.salary=salary;
            this.holiday=holiday;
        }
        public void CurrentPost(){
            switch(post){
                case Engineer:
                    System.out.println("Engineer");
                    System.out.println("salary="+salary);
                    System.out.println("holidays="+holiday);
                    break;
                case Manager:
                    System.out.println("Manager");
                    System.out.println("salary="+salary);
                    System.out.println("holidays="+holiday);
                    break;
                case Main_Engineer:
                    System.out.println("Main Engineer");
                    System.out.println("salary="+salary);
                    System.out.println("holidays="+holiday);
                    break;
                default:
                    System.out.println("Not found");
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Exercise33:");
//        Company company = new Company(Post.Main_Engineer,200,10);
//        company.CurrentPost();
        exercise33 exercise = new exercise33();
        Company company = exercise.new Company(Post.Main_Engineer,200,10);
        company.CurrentPost();
    }
}
