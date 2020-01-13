package Lab2.animalRescuer;

public class appMain {
    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.age = 2;
        rex.name = "Rex";
        rex.healty = 10;
        Food fish = new Food();
        fish.name = "fish finghers";
        fish.price = 15;
        fish.stock = "inStock";
        System.out.println("My dog is " + rex.age + " years old");
        System.out.println("His name is " + rex.name + " and his favorite meal is " + fish.name);
        System.out.println("I paid " + fish.price + " $ for a bag full of "  + fish.name);
        Boy adoption = new Boy();
        adoption.buget = 1000;
        adoption.name = "Jon";
        System.out.println(adoption.name + " came home whit a dog");
        Recreation walk = new Recreation();
        walk.recr = "walking in park with other dogs";
        System.out.println(rex.name + " love to " + walk.recr);
        Vet dr = new Vet();
        dr.name = "Dr Smith";
        dr.specialization = "vet";
        System.out.println(dr.name + "is the " + dr.specialization  +  " of " + rex.name);
    }


}

