package Inheritance;

class programmer extends Employee{
    float bonus =10000;

    public static void main(String[] args) {
        programmer p= new programmer();
        System.out.println("programmer salarry is:"+p.salary);
        System.out.println("programmer bonus is :"+ p.bonus);

        float total_bonus= p.dashain_bonus+ p.salary+p.bonus;
        System.out.println("total salary is:"+total_bonus);
    }
}
