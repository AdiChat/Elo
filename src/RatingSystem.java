class RatingSystem
{
    // For 2 player game
    public static void setRate(int won, Player p1, Player p2) // Following Elo rating system
    {
        double r1 = p1.getCurrentRating();
        double r2 = p2.getCurrentRating();
        double R1 = Math.pow(10, r1/400.0);
        double R2 = Math.pow(10, r2/400.0);
        double E1 = R1 / (R1 + R2);
        double E2 = R2 / (R1 + R2);
        int S1 = won, S2 = won == 1?0:1;int k =40;
        
        double new_r1 = r1 + k * (S1 - E1);
        double new_r2 = r2 + k * (S2 - E2);
        
        p1.setCurrentRating(new_r1);
        p2.setCurrentRating(new_r2);
        
    }
    
    public static void main(String args[])
    {
        Game game = new Game();
        Player p1 = new Player();
        p1.setUsername("a");
        p1.addGameRating(game, 3199.0);
        Player p2 = new Player();
        p2.setUsername("a");
        p2.addGameRating(game, 3200.0);
        game.addPlayer(p1);
        game.addPlayer(p2);
        setRate(0,p1,p2);
        System.out.println(p1.getCurrentRating());
        System.out.println(p2.getCurrentRating());
    }
}
