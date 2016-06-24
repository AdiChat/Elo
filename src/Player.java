
class Player
{
    private String username;
    private LinkedList<Game> games;
    private int gamesPlayed;
    private double rating;
    private int playerStatus;
    
    public String getUsername()
    {
        return username;
    }
    
    public int getNumberOfGamesPlayed()
    {
        return gamesPlayed;
    }
    
    public double getRating()
    {
        return rating;
    }
    
    public int getPlayerStatus()
    {
        return playerStatus;
    }
}
