package classesAndObjects1;

public class TestProgrammers {
    public static void main(String[] args) {

        Programmer programmer1 = new Programmer();
        programmer1.name = "Alessio";
        programmer1.age = 32;
        programmer1.wearsGlasses =true;

        Programmer programmer2 = new Programmer();
        programmer2.name = "Fabiano";
        programmer2.age = 28;
        programmer2.wearsGlasses = true;

        System.out.println(programmer1.drinkCoffee());
        System.out.println(programmer1.printDetails());
        System.out.println(programmer2.printDetails());
        System.out.println(programmer2.hasGlasses());

    }
}


