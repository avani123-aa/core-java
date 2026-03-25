class AppManager {
          //manage application
		  
       private String appNames[] = new String[4]; //appNames is a instance method 
	   int index;
	   
	   // initializing of variable (when udk the dataDatatype arrayName[] =  new Datatype[size];
              //  or 
	   //Datatype arrayNames[] = {ref , ref , ref.......... till 8};(when uk what data to add)
	 
//method 	 
	   public boolean addAppNames(String appName){
		   boolean isAppAdded =  false;
		   
		   if(appName != null && !appName.isEmpty()){
			   
			   appNames[index] = appName;
			   index++;
			        isAppAdded = true;
		   } 
		   else {
			System.out.println(appName + " is invalid");   
		   }
		   
		   return isAppAdded;
	   }
	   public void getAppNames(){
		   for(String appName : appNames){
			   System.out.println(appName);
		   }
	   }

}