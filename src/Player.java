import java.util.*;
class Player
{
    private String username;
    private ArrayList<int> gamesPlayed;
    private double currentRating;
    private ArrayList<double> newRating;
    private ArrayList<int> gameStatus;
    
    Player()
    {
        gamesPlayed = new ArrayList<Game>();
        newRating = new ArrayList<double>();
        gameStatus = new ArrayList<int>();
        currentRating = 0.0;
        username = "";
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public ArrayList<int> getGamesPlayed()
    {
        return gamesPlayed;
    }
    
    public double getCurrentRating()
    {
        return currentRating;
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
        this.currentRating = sc.nextDouble();
    }
    
}
