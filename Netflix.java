class Netflix {
    public static void main(String[] args) {

        String englishMovies[] = {"Inception","Interstellar","Extraction","The Gray Man","Red Notice",
        "Bird Box","6 Underground","The Irishman","Dont Look Up","Tenet","Avatar","Titanic",
	    "Gladiator","Joker","Batman Begins","The Dark Knight","Fight Club","Forrest Gump",
		"Matrix","John Wick"};

        String hindiMovies[] = {"Dangal","RRR","Jawan","Pathaan","KGF","Baahubali","Chak De India",
		"PK","3 Idiots","Lagaan","Sholay","Gadar","Sultan","Tiger Zinda Hai","War","Andhadhun",
		"Drishyam","Bajrangi Bhaijaan","Sanju","Kesari"};

        String teluguMovies[] = {"Baahubali","Baahubali 2","Pushpa","RRR","Salaar","Eega","Magadheera",
		"Athadu","Pokiri","Janatha Garage","Ala Vaikunta Puramulo","Rangasthalam","Jersey","Sye",
		"Leader","Chatrapathi","Bhadra","Simhadri","Khaleja","Tagore"};

        String tamilMovies[] = {"Vikram","Leo","Master","Kaithi","Jailer","Mersal","Bigil","Theri",
		"Sarkar","Asuran","Soorarai Pottru","Jai Bhim","Karnan","Visaranai","Vedalam","Arrambam",
		"Billa","Ghajini","Anniyan","Iruvar"};

        String koreanMovies[] = {"Parasite","Train to Busan","Alive","The Call","Oldboy",
		"Memories of Murder","The Host","Snowpiercer","Burning","Broker","Decision to Leave",
		"Forgotten","I Saw the Devil","The Man from Nowhere","A Bittersweet Life","The Wailing",
		"Midnight","Extreme Job","Beasts Clawing","Tazza"};
    
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
System.out.println("number of koreanMovies :" + koreanMovies.length);
	System.out.println("list of the korean movies are : ");
for(String koreanMovie : koreanMovies)
System.out.println(koreanMovie);	

	
	
	
	
	}

}
