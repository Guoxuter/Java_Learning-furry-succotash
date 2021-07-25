public class Movie {
    String title;
    String genre;
    int rating;

    void playIt(){
        System.out.println("Playing the movie" + ' ' +  title);
    }

    public static class MovieTestDrive{
        public static  void main(String[] args){
            Movie one = new Movie();
            one.title="Gone with the Stock";
            one.genre ="Tragic";
            one.rating=-2;
            one.playIt();

            Movie two =new Movie();
            two.title="Lost in the Cubicle Space";
            two.genre="Comedy";
            two.playIt();
        }
    }
}
