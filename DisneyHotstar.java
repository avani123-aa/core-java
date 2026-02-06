class DisneyHotstar {
    public static void main(String[] args) {

        String englishMovies[] = {"Avengers Endgame","Avengers Infinity War","Iron Man","Iron Man 2","Iron Man 3",
        "Captain America First Avenger","Captain America Winter Soldier","Civil War","Thor",
		"Thor Ragnarok","Guardians of the Galaxy","Guardians of the Galaxy 2","Doctor Strange",
        "Black Panther","Ant Man","Spider Man Homecoming","Spider Man Far From Home",
		"The Incredible Hulk","Eternals","Shang Chi"};

        String hindiMovies[] = {"MS Dhoni The Untold Story","Bajrangi Bhaijaan","Super 30","Tanhaji",
        "Chhichhore","Baghi","Baghi 2","Baghi 3","Ek Tha Tiger","Tiger Zinda Hai",
        "Sultan","Dabangg","Dabangg 2","Dabangg 3","Total Dhamaal",
        "Housefull","Housefull 2","Housefull 3","Housefull 4","Judwaa 2"};

        String teluguMovies[] = {"Magadheera","Athadu","Pokiri","Ala Vaikunta Puramulo","Janatha Garage",
        "Baahubali","Baahubali 2","RRR","Eega","Rangasthalam","Sye","Leader","Khaleja",
		"Tagore","Chatrapathi","Bhadra","Simhadri","Pushpa","Salaar","Jersey"};

        String tamilMovies[] = {"Bigil","Mersal","Theri","Sarkar","Master","Vikram","Leo","Kaithi",
		"Jailer","Asuran","Soorarai Pottru","Jai Bhim","Karnan","Visaranai","Vedalam","Arrambam",
		"Billa","Ghajini","Anniyan","Iruvar"};

        String kannadaMovies[] = {"KGF Chapter 1","KGF Chapter 2","Ugramm","Roberrt","Yuvarathnaa",
        "Tagaru","Avane Srimannarayana","Kirik Party","Lucia","RangiTaranga",
        "Dia","Mungaru Male","Raajakumara","Mr And Mrs Ramachari","Googly",
        "Bell Bottom","777 Charlie","James","Vikrant Rona","Gaalipata"};
   
        				//for each 
		System.out.println("number of hindiMovies :" + hindiMovies.length);
		System.out.println("list of the hindi movies are : ");
		for(String hindiMovie : hindiMovies)
			System.out.println(hindiMovie);
		
		System.out.println("\n");
		System.out.println("number of englishMovies :" + englishMovies.length);
		System.out.println("list of the english movies are : ");
		for(String englishMovie : englishMovies)
			System.out.println(englishMovie);
		
		System.out.println("\n");
		System.out.println("number of teluguMovies :" + teluguMovies.length);
		System.out.println("list of the telugu movies are : ");
		for(String teluguMovie : teluguMovies)
			System.out.println(teluguMovie);
		
		System.out.println("\n");
		System.out.println("number of tamilMovies :" + tamilMovies.length);
		System.out.println("list of the tamil movies are : ");
for(String tamilMovie : tamilMovies)
System.out.println(tamilMovie);

System.out.println("\n");
System.out.println("number of kannadaMovies :" + kannadaMovies.length);
	System.out.println("list of the kannada movies are : ");
for(String kannadaMovie : kannadaMovies)
System.out.println(kannadaMovie);	




   }
}
