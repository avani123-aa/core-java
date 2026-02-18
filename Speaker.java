class Speaker{
	static boolean isConnected;
	static int currentVolume;
	static int maxVolume=10;
	static int minVolume;
	static boolean onOrOff(){
	if(isConnected == false){
	isConnected=true;
	System.out.println("The Speaker is turned on");
	}
	else if(isConnected == true){
	isConnected=false;
	System.out.println("The Speaker is turned off");
	}
	return isConnected;
	}
	
	public static void increaseVolume(){
		System.out.println("Increase Volume is called");
		if(isConnected == true){
			System.out.println("Start to increase the Volume");
             
			 if(currentVolume < maxVolume){
					currentVolume = currentVolume + 1;
					System.out.println("The current Volume is" + currentVolume);
		} else{
            System.out.println("Max  Volume Reached");
		}
		}  else{
            System.out.println("on the speaker first");
		}
	}		
	public static void decreaseVolume(){
		System.out.println("decrease Volume is called");
		if(isConnected == true){
			System.out.println("Start to decrease the Volume");
             
			 if(currentVolume > minVolume){
                     currentVolume = currentVolume - 1;
            System.out.println("The current Volume is" + currentVolume);
		} else{
            System.out.println("Min  Volume Reached");
		}
		}  else{
            System.out.println("on the speaker first");
		}
	}		
	}
	
	
	
	