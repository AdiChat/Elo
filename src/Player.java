import java.util.*;
/*
 * Current status:
 * Player can play multiple games
 * Player will have any initial rating before playing the current set of games
 * Player will have a current rating
 * For every game, outcome of the game for player will either be win, loss or draw.
 * 
 */
class Player
{
    private String username;
    private ArrayList<Game> gamesPlayed;
    private double initialRating;
    private double currentRating;
    private ArrayList<Double> newRating;
    private ArrayList<Integer> gameStatus;
    
    Player()
    {
        gamesPlayed = new ArrayList<Game>();
        newRating = new ArrayList<Double>();
        gameStatus = new ArrayList<Integer>();
        currentRating = 1500.0;
        initialRating = 1500.0;
        username = "";
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public ArrayList<Game> getGamesPlayed()
    {
        return gamesPlayed;
    }
    
    public double getCurrentRating()
    {
        return currentRating;
    }
    
    public double getInitialRating()
    {
        return initialRating;
    }
    
    public double getNewRating(int i)
    {
        return newRating.get(i);
    }
    
    public int getGameStatus(int i)
    {
        return gameStatus.get(i);
    }
    
    public void getUserData(int userId)
    {
        System.out.println("Enter user data for user "+userId);
        Scanner sc = new Scanner(System.in);
        this.username = "AdiChat";
        //this.currentRating = sc.nextDouble();
    }
    
    public void setUsername( String username)
    {
        this.username = username;
    }
    
    private void addGame(Game game)
    {
        gamesPlayed.add(game);
    }
    
    private void addRating(double rating)
    {
        currentRating = rating;
    }
    
    public void addGameRating(Game game, double rating)
    {
        addGame(game);
        addRating(rating);
    }
    
    public void setCurrentRating()
    {
        // Result of other values - no user input
    }
        
}
