//Cole Mumford 4/8/26 assignment 7
public class mainassign7 {
    
public static void main(String[] args) {

    Enemy e1=new Enemy(100,5);// Created generic enemy
    e1.attack();// generic enemy attacks

    Wizard icewiz= new Wizard(200, 50, "ice");//Created wizards
    Wizard firewiz= new Wizard(150, 75, "fire");
    icewiz.attack();//Ran functions I also did a override for the wizard attack too so it didn't just saw the enemy attacks
    icewiz.damageType();
    firewiz.attack();
    firewiz.damageType();

    

    Goblin gob=new Goblin(150, 25);//Made a goblin and called its function

    gob.attack();
        

    }



     }

