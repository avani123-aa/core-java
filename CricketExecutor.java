class CricketExecutor{
public static void main(String[] args){

Cricket c1=new Cricket();
c1.playerName="Virat Kohli";
c1.team="RCB";
c1.runs=12000;
c1.wickets=4;
c1.matches=270;
c1.average=58.5;
c1.role="Batsman";
c1.jerseyNumber=18;
c1.country="India";
c1.age=35;
c1.strikeRate=137.5;
c1.catches=120;
c1.stumpings=0;
c1.battingStyle="Right Hand";
c1.bowlingStyle="Right Arm Medium";
c1.format="ODI";
c1.sixes=140;
c1.fours=1100;
c1.captain="Rohit Sharma";
c1.ranking=2;

System.out.println(c1.playerName);
System.out.println(c1.team);
System.out.println(c1.runs);
System.out.println(c1.wickets);
System.out.println(c1.matches);
System.out.println(c1.average);
System.out.println(c1.role);
System.out.println(c1.jerseyNumber);
System.out.println(c1.country);
System.out.println(c1.age);
System.out.println(c1.strikeRate);
System.out.println(c1.catches);
System.out.println(c1.stumpings);
System.out.println(c1.battingStyle);
System.out.println(c1.bowlingStyle);
System.out.println(c1.format);
System.out.println(c1.sixes);
System.out.println(c1.fours);
System.out.println(c1.captain);
System.out.println(c1.ranking);

Cricket p1=new Cricket("Rohit Sharma","MI",10800,8,250,49.5,"Batsman",45,"India",36,139.2,95,0,"Right Hand","Right Arm Off Spin","ODI",260,980,"Rohit Sharma",3);

System.out.println(p1.playerName);
System.out.println(p1.team);
System.out.println(p1.runs);
System.out.println(p1.wickets);
System.out.println(p1.matches);
System.out.println(p1.average);
System.out.println(p1.role);
System.out.println(p1.jerseyNumber);
System.out.println(p1.country);
System.out.println(p1.age);
System.out.println(p1.strikeRate);
System.out.println(p1.catches);
System.out.println(p1.stumpings);
System.out.println(p1.battingStyle);
System.out.println(p1.bowlingStyle);
System.out.println(p1.format);
System.out.println(p1.sixes);
System.out.println(p1.fours);
System.out.println(p1.captain);
System.out.println(p1.ranking);

}
}