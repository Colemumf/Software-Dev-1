//Cole Mumford assignment 6 Student class 4/1/26

public class student {
    String name;
    String year;
    double gpa;
    int id;

    public student(String n, String y, double g, int i){
        name=n;
        year=y;
        gpa=g;
        id=i;
    }
    void grades(){
        if(this.gpa>=3.6){
            System.out.println(this.name+" is an honor roll student!");

        }else{
            System.out.println(this.name+" is not on the honor roll yet, keep working!");
        }
    }
    void printid(){
        System.out.println(this.name+" has the id of "+ this.id);
    }

    void lunch(int l){
        if(this.id==l){
            System.out.println(this.name+" gets free lunch today because the random id was "+l+"!");
        }else{
            System.out.println(this.name+ " does not get free lunch today!");
        }
    }
}
