class AppManagerExecutor{
   public static void main(String[] args){
          AppManager am = new AppManager();
           am.addAppNames("instagram");
           am.addAppNames("swiggy");
           am.addAppNames("spotify");
           am.addAppNames("netflix");
		  
		  am.getAppNames();
    }
}