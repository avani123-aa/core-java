class WoodStreet{
    
	public static void main (String[] args){
	
	String cafeName = "bobs bar";
	String owner = "avani";
	String address = "ashok nagar";
	String branches[] = {"church street","jp nagar","rajajinagar"};
	String  menus[] = {"whiskey","scotch","kabab","pepper chicken","biryani"};
	String managers[] = {"sanjana","sanika","spoorthi","sidarth","rinith"};
	
	// 
	System.out.println("the cafe information : ");
	System.out.println("\n");
	System.out.println("the name of the cafe is : " + cafeName);
	System.out.println("the owner of the cafe is : " + owner);
	System.out.println("the address : " + address);
	
	System.out.println("the no of branches are : "+ branches.length);
	System.out.println("the list of the branches are :");
	for(String branch : branches) {
	System.out.println(branch);
	}
	System.out.println("\n");
	
    System.out.println("the number of iteams are : "+ menus.length);
	System.out.println("the list of the food iteams are :");
	for(String menu : menus) {
	System.out.println(menu);
	}
	System.out.println("\n");
	
	System.out.println("the number of managers : "+ managers.length);
	System.out.println("the list of the managers names:");
	for(String manager : managers) {
	System.out.println(manager);
	}
	
	
	
	
}
}