class GateExecutor{
    public static void main(String[] args){
        boolean ref = Gate.lockOrUnlock();
        System.out.println("Gate lock status : " + ref);
    }
}