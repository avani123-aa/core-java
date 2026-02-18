class Gate{
    static boolean isLocked;

    static void lockOrUnlock(){
        if(isLocked == false){
            isLocked = true;
            System.out.println("The Gate is unlocked");
        }
        else{
            isLocked = false;
            System.out.println("The Gate is locked");
        }
       
    }
}