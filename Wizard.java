public class Wizard extends Enemy{
    String type;
    public Wizard(int h, int d, String t) {
        super(h, d);//Gets health and damage from parent class enemy
        type = t;//type is unique to wizard, ice or fire
    }
    @Override//Made an override so wizard attack is unique from generic enemy
    void attack(){
        System.out.println("The wizard strikes!");
    }
    void damageType(){
        if(type=="fire"){//Fire wizard shhots fireball, ice wiz shoots iceball and any other type won't work
            System.out.println("This wizard shoots a fireball!");
        }else if(type=="ice"){
            System.out.println("This wizard shoots an iceball!");
        }else{
            System.out.println("Enter a proper wizard type, fire or ice.");
        }
        
    }
}