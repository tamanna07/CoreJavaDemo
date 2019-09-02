package tutoring_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RunMovieCollection {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC";
        String username = "root";
        String password = "root";

        Connection connection = null;
        Statement statement = null;

        MovieCollection rampage = new MovieCollection(
                11,
                "Rampage",
                2018,
                "Sci-fi/Action",
                "PG-13");
        MovieCollection jurrasicWorld = new MovieCollection(
                12,
                "Jurassic World: Fallen Kingdom",
                2018,
                " Sci-fi/Action ",
                "PG-13");
        MovieCollection missionImpossible = new MovieCollection(13,
                "Mission: Impossible – Fallout",
                2018,
                "Thriller/Action ",
                "PG-13");

        List<MovieCollection> movies = new ArrayList<>();
        movies.add(rampage);
        movies.add(jurrasicWorld);
        movies.add(missionImpossible);

        try {

            connection = DriverManager.getConnection(url,username,password);
            statement = connection.createStatement();

            for (MovieCollection mv: movies)
            {
                String query = "INSERT INTO movie(id, title, releaseYear, genre, mpaaRating )" +
                        "VALUES("+mv.getId()+", '"+mv.getTitle()+"', "+mv.getReleaseYear()
                        +", '"+mv.getGenre()+"', '"+mv.getMpaaRating()+"');";
                statement.execute(query);
            }

        } catch (Exception e)
        {
            System.out.println("Sorry something went wrong please check again");
            e.printStackTrace();
        }finally {
            connection.close();
            statement.close();
        }
    }
}
