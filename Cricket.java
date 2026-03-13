class Cricket
{
    String playerName;
    int age;
    String country;
    String team;
    int matches;
    int runs;
    int wickets;
    int catches;
    int hundreds;
    int fifties;
    double strikeRate;
    double average;
    String role;
    String battingStyle;
    String bowlingStyle;
    int jerseyNumber;
    String format;
    String stadium;
    String coach;
    int ranking;   

    Cricket()
    {
    }

    Cricket(String playerName,int age,String country,String team,int matches,int runs,int wickets,int catches,int hundreds,int fifties,double strikeRate,double average,String role,String battingStyle,String bowlingStyle,int jerseyNumber,String format,String stadium,String coach,int ranking)
    {
        this.playerName = playerName;
        this.age = age;
        this.country = country;
        this.team = team;
        this.matches = matches;
        this.runs = runs;
        this.wickets = wickets;
        this.catches = catches;
        this.hundreds = hundreds;
        this.fifties = fifties;
        this.strikeRate = strikeRate;
        this.average = average;
        this.role = role;
        this.battingStyle = battingStyle;
        this.bowlingStyle = bowlingStyle;
        this.jerseyNumber = jerseyNumber;
        this.format = format;
        this.stadium = stadium;
        this.coach = coach;
        this.ranking = ranking;
    }
}