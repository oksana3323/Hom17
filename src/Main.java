public class Main {
    public static void main(String[] args) {
        Java java1 = new Java("Aizat", 19, "J", "aizat@gmail.com");
        Java java2 = new Java("Madina", 18, "J", "madina@gmail.com");
        Java java3 = new Java("Gulmira", 25, "J", "gulmira@gmail.com");
        Java java4 = new Java("Ernazar", 20, "M", "ernazar@gmail.com");
        Java java5 = new Java("Kairat", 19, "M", "kairat@gmail.com");

        Android android1 = new Android("Davran", 18, "M", "davran@gmail.com");
        Android android2 = new Android("Keldibek", 18, "M", "keldibek@gmail.com");
        Android android3 = new Android("Kanikei", 18, "j", "kanikei@gmail.com");
        Go go = new Go("Sanjar", 19, "M", "sanjar@gmail.com");
        Java[] java = {java1, java2, java3, java4, java5};
        Android[] android = {android1, android2, android3};
        Go[] gos={go};
        Company company = new Company("Alamidin-1", java, android, gos,"Erjan");
        System.out.println(company);

        Java java7 = new Java("Abdumomun", 19, "J", "abdumomun@gmail.com");
        Java java8 = new Java("Erjigit", 19, "J", "erjigit@gmail.com");
        Java java9 = new Java("Gulmira", 25, "J", "gulmira@gmail.com");
        Android android5 = new Android("Davran", 18, "M", "davran@gmail.com");
     Go go1=new Go("Ulan",24,"M","ulan@gmail.com");
   Java[] javas={java7,java8,java9};
   Android[] androids={android5};
    Go[] gos1={go};
    Company company1=new Company("Tunguch",javas,androids,gos1,"Oksana");
        System.out.println(company1);
    }




}



 /*   Класс Java (name, a
            ge, gender, email) түзүңүз

    Класс Android (name, age, gender, email) түзүңүз

    Класс Go (name, age, gender, email) түзүңүз

Жогорудагы 3 класс бир класстан мурасталсын.

        Класс Company(address, java, android, go, ownerName)

        Мейн класстан эки компания түзүңүз

        Биринчи компанияда 5 жава, 3 андроид, 2 gо программист иштесин

        Экинчи компанияда 2 жава, 1 андроид, 1 go программист иштесин

        Компанияларды консольго чыгарыңыз*/

