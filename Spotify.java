class Spotify{
	public static void main (String []args){
		String songs[] = {"tum hi ho","dil duffer","raat bhar","kalyani","every breath you take","everybody","ehasas","move","gaga","mimosa","nishani"};
		
		String tumHiHo = songs [0];
		String dilDuffer = songs [1];
		String raatBhar = songs [2];
		String kalyani = songs [3];
		String everyBreathYouTake = songs [4];
		String everybody = songs [5];
		String ehasas = songs [6];
		String move= songs [7];
		String gaga= songs [8];
		String mimosa= songs [9];
		String nishani= songs [10];
		
		int size = songs.length;
		System.out.println("the number of songs are :" + size);
		System.out.println(tumHiHo+" "+dilDuffer+" "+raatBhar+" "+kalyani+" "+
		everyBreathYouTake+" "+everybody+" "+ehasas+" "+move+" "+gaga+" "+
		mimosa+" "+nishani);
	}
}