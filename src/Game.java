class Game
{
    Private enum Mode { CHESS, LODO }
    Private ArrayList<Player> players;
    Private int countPlayers;
    Private Mode gameMode;
    
    public Game()
    {
        countPlayers = 2; // Supporting 2 players currently
    }
}
