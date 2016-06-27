class Game
{
    private String gameName;
    private ArrayList<Player> players;
    private int countPlayers;
    private int playerWon;
    
    Game()
    {
        countPlayers = 2;
        gameName = "";
        players = new ArrayList<Player>(countPlayers);
    }
    
    public void setGameName(String Name)
    {
        gameName = Name;
    }
    
    public void setPlayers(int players)
    {
        countPlayers = players;
    }
    
    public void addPlayer(Player player)
    {
        players.add(player);
    }
    
    public void setWinner(int winner)
    {
        playerWon = winner;
    }
    
    
}
