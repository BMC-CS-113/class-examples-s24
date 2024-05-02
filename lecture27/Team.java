public class Team {
    Player[] players;
    int numPlayers;

    public Team() {
        /* 1. initialize players array to something VERY large and if its full
         *    when calling add() just print a message  
         * 2. Start with a small number and expand the array if necessary
         */

        //1. 
        players = new Player[100000]; //start as null
        //2.
        players = new Player[5];
    }

    public boolean add(Player p) {
        if (numPlayers >= players.length) {
            //array is full
            //1. System.out.println("Too many players on team");
            //return false;

            //2. 
            Players[] newPlayers = new Players[numPlayers*2];
            for (int i=0; i<players.length) {
                newPlayers[i] = players[i];
            }
            players = newPlayers;
        }

        //conditional adding

        numPlayers++;
        return true;
    }

    public Player[] getOffense() {
        //OffensivePlayer, DefensivePlayer, Coach
        int numOffense = 0;
        for (int i=0; i<players; i++) { 
            //remember to put null checks if you could hit a NPE
            //players[i].getName();
            if (players[i] instanceof OffensivePlayer) {
                numOffense += 1;
            }
        }

        Player[] out = new Player[numOffense];
        for (int i=0; i<players; i++) {
            if (players[i] instanceof OffensivePlayer) {
                out[i] = players[i]; 
            }
        }

       return out; 
    }


}
