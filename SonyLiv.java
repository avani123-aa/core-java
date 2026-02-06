class SonyLiv {
    public static void main(String[] args) {

        String englishMovies[] = {"Spider Man","Spider Man 2","Spider Man 3","Venom Let There Be Carnage",
        "Jumanji","Jumanji Welcome to the Jungle","Jumanji The Next Level","Men in Black","Men in Black 2",
        "Men in Black 3","Bad Boys","Bad Boys 2","Bad Boys For Life","Ghostbusters","Venom",
        "Ghostbusters 2","Ghostbusters Afterlife","Equalizer","Equalizer 2","Equalizer 3"};

        String teluguMovies[] = {"Janatha Garage","Arjun Reddy","Bichagadu","Evaru","Agent Sai Srinivasa Athreya",
        "Magadheera","Athadu","Pokiri","Rangasthalam","Jersey","Sye","Leader","Khaleja",
		"Tagore","Chatrapathi","Bhadra","Simhadri","Pushpa","Salaar","RRR"};
		
		String hindiMovies[] = {"Uri","Tanhaji","Raees","Bhuj","Laxmii","Singham","Singham Returns","Simmba",
		"Sooryavanshi","Golmaal","Golmaal Returns","Golmaal 3","Golmaal Again","Dabangg","Dabangg 2",
        "Dabangg 3","Housefull","Housefull 2","Housefull 3","Housefull 4"};

        String tamilMovies[] = {"Viswasam","Vedalam","Arrambam","Billa","Mankatha","Master","Vikram",
		"Leo","Kaithi","Jailer","Asuran","Soorarai Pottru","Jai Bhim","Karnan","Visaranai",
        "Ghajini","Anniyan","Iruvar","Ayan","Thuppakki"};

        String marathiMovies[] = {"Sairat","Natsamrat","Fandry","Katyar Kaljat Ghusali","Mulshi Pattern",
        "Court","Harishchandrachi Factory","Ventilator","Jogwa","Timepass",
        "Timepass 2","Timepass 3","Deool","Balak Palak","Elizabeth Ekadashi",
        "Lai Bhaari","Dagdi Chawl","Dagdi Chawl 2","Jhund","Bucket List"};
		
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
System.out.println("number of marathiMovies :" + marathiMovies.length);
	System.out.println("list of the marathi movies are : ");
for(String marathiMovie : marathiMovies)
System.out.println(marathiMovie);	
		
    }
}
