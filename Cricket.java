class Cricket{

String playerName;
String team;
int runs;
int wickets;
int matches;
double average;
String role;
int jerseyNumber;
String country;
int age;
double strikeRate;
int catches;
int stumpings;
String battingStyle;
String bowlingStyle;
String format;
int sixes;
int fours;
String captain;
int ranking;

Cricket(){
}

Cricket(String playerName,String team,int runs,int wickets,int matches,double average,String role,int jerseyNumber,String country,int age,double strikeRate,int catches,int stumpings,String battingStyle,String bowlingStyle,String format,int sixes,int fours,String captain,int ranking){
this.playerName=playerName;
this.team=team;
this.runs=runs;
this.wickets=wickets;
this.matches=matches;
this.average=average;
this.role=role;
this.jerseyNumber=jerseyNumber;
this.country=country;
this.age=age;
this.strikeRate=strikeRate;
this.catches=catches;
this.stumpings=stumpings;
this.battingStyle=battingStyle;
this.bowlingStyle=bowlingStyle;
this.format=format;
this.sixes=sixes;
this.fours=fours;
this.captain=captain;
this.ranking=ranking;
}

}