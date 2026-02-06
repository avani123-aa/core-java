class AmazonPrime {
    public static void main(String[] args) {

        String englishMovies[] = {"The Tomorrow War","Without Remorse","Jack Ryan","The Boys","Reacher",
        "Top Gun","Mission Impossible","A Quiet Place","Edge of Tomorrow","World War Z",
		"Interstellar","Inception","Tenet","Joker","Gladiator","The Dark Knight","John Wick",
		"Mad Max Fury Road","Dunkirk","The Matrix"};

        String hindiMovies[] = {"Shershaah","Drishyam","Article 15","Bholaa","Sardar Udham",
        "Tanhaji","Raazi","Kesari","Andhadhun","Bajrangi Bhaijaan",
        "Gully Boy","Pad Man","Toilet Ek Prem Katha","Super 30","War",
        "Batla House","Gold","Mission Mangal","Uri","Badhaai Ho"};

        String teluguMovies[] = {"Sita Ramam","Jersey","Rangasthalam","Dear Comrade",
		"Ala Vaikunta Puramulo","Magadheera","Athadu","Pokiri","Janatha Garage","Pushpa","Baahubali",
		"Baahubali 2","Leader","Khaleja","Tagore","Chatrapathi","Bhadra","Simhadri","Eega","Sye"};

        String tamilMovies[] = {"Soorarai Pottru","Jai Bhim","Asuran","Karnan","Vada Chennai",
        "Visaranai","Pariyerum Perumal","Kaala","Kabali","Master","Vikram","Leo","Kaithi",
		"Jailer","Mersal","Bigil","Theri","Ghajini","Anniyan","Iruvar"};

        String malayalamMovies[] = {"Drishyam","Drishyam 2","Joji","Kurup","Minnal Murali",
        "Kumbalangi Nights","Bangalore Days","Premam","Uyare","Take Off",
        "Virus","Maheshinte Prathikaaram","Android Kunjappan","Lucifer","Joseph",
        "Ayyappanum Koshiyum","Home","Charlie","Helen","Jallikattu"};
    
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
System.out.println("number of malayalamMovies :" + malayalamMovies.length);
	System.out.println("list of the malayalam Movies are : ");
for(String malayalamMovie : malayalamMovies)
System.out.println(malayalamMovie);	

	
	
	
	
	
	}
}
