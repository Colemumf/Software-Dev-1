//Cole Mumford assignment 6 my own class

public class Assignment6p2 {
    public static void main(String[] args) throws Exception{
        movies m1= new movies("Reservoir Dogs", "Tarantino","Short");
        movies m2= new movies("Inception", "Nolan","Long");
        movies m3= new movies("Goodfellas","Scorsese","Long");

        m1.runtime();
        m2.runtime();
        m3.runtime();

        m1.direct();
        m2.direct();
        m3.direct();






    }
}
