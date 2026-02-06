class ChatShop{

    public static void main (String []args){
        String chats[] = {"Peanut Masala","Nippat Masala","Pani Puri","Masala Puri","Bel Puri",
		"Sev Puri","Nipat Masala","Churmuri","Masala Mandaki","Tea","Coffee","Horlicks","Badam milk",
		"Soft drinks"};
		
		String peanutMasala = chats[0];
		String nippatMasala = chats[1];
		String paniPuri = chats[2];
		
		int size = chats.length;
		System.out.println (peanutMasala+"  "+ nippatMasala+"   "+paniPuri);
        System.out.println("the number of chats available : " + size);
		
	//
	System.out.println("the list of chats names using for each");
	   for(String chat : chats){
		   System.out.println(chat);
	   }
	}		
}