public class Q2Driver {
    public static void main(String[] args) {
        Team team = new Team();
        Player p1 = new OffensivePlayer("Allen");
        Player p2 = new OffensivePlayer("Diggs");
        Player p3 = new OffensivePlayer("Jefferson");

        Player p4 = new DefensivePlayer("Bosa");
        Player p5 = new DefensivePlayer("Watt");

        Player p6 = new Coach("Reid");
        Player p7 = new Coach("McDermott");

        assert team.add(p1) == true;
        assert team.add(p2) == true;
        assert team.add(p3) == false;

        assert team.add(p4) == true;
        assert team.add(p5) == true;

        assert team.add(p6) == true;
        assert team.add(p7) == false;

        assert team.trade("Diggs") == true;
        assert team.trade("Jefferson") == false;

        Player[] offense = team.getOffense();
        assert offense.length == 1;
        assert offense[0].getName().equals("Allen");
        assert team.getCoach().equals("McDermott");
    }
}
