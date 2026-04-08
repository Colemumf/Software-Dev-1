public class Goblin extends Enemy{

    public Goblin(int h , int d){// Made constructor. Goblin gets health and damage from parent class which is enemy
        super(h,d);
    }
    @Override// Overrides the attack function from enemy making it specific to goblins
    void attack(){
        System.out.println("The goblin gobbles!");
    }

}
