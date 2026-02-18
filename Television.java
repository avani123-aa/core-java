class Television{
    static boolean isPowered;

    static boolean onOrOff(){
        if(isPowered == false){
            isPowered = true;
            System.out.println("The TV is turned on");
        }
        else if(isPowered == true){
            isPowered = false;
            System.out.println("The TV is turned off");
        }
        return isPowered;
    }
}

