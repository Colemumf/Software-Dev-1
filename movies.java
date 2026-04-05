//Cole Mumford assignment 6 my own class for movies

public class movies {
    String title;
    String director;
    String length;

    public movies(String t, String d, String l){
        title=t;
        director=d;
        length=l;
    }

    void runtime(){
        if(this.length=="Short"){
            System.out.println(this.title+" is a short film!");
        }else if(this.length=="Long"){
            System.out.println(this.title+" is a long film!");
        }else{
            System.out.println(this.title+" has a normal-ish runtime!");
        }
    }

    void direct(){
        if(this.director=="Scorsese"){
            System.out.println(this.title+" is a Scorsese film!");
        }else if(this.director=="Nolan"){
            System.out.println(this.title+" is a Nolan film!");
        }else{
            System.out.println(this.title+" is a Tarantino film!");
        }

        }
    }



