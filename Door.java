class Door{
    static boolean isOpen;

    static boolean openOrClose(){
        if(isOpen == false){
            isOpen = true;
            System.out.println("The Door is opened");
        }
        else{
            isOpen = false;
            System.out.println("The Door is closed");
        }
        return isOpen;
    }
}