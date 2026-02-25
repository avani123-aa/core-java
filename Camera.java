class Camera{
       static String aperture;
       static String shutterSpeed;
	   static String exposureCompensation;
	   static String imageFormat;
       static String whiteBalance;
       static String focalLength;
       static String metMode;
       static String driveMode;
	   static String meteringMode;

            public static boolean createCamera(String Aper,String shutterSp,String expCompensation,String imgFor,String wBal,String focalLeng,String driveMod,String metMod,String meteringMod){
            boolean iscameraCreated=false;

            boolean isAperValid=false;
            boolean isshutterSpValid=false;
			boolean isexpCompensationValid=false;
            boolean isimgForValid=false;
            boolean iswBalValid=false;
            boolean isfocalLengValid=false;
            boolean ismetModValid=false;
			boolean isdriveModValid=false;
			boolean ismeteringModValid=false;

                if(Aper != null && !Aper.isEmpty()){
                   System.out.println("Aper is validated");
                   aperture=Aper;
                   isAperValid=true;
                      }
                else{
                  System.out.println("Aper is not valid");
                    }

                if(shutterSp != null && !shutterSp.isEmpty()){
                   System.out.println("shutterSp is validated");
                   shutterSpeed=shutterSp;
                   isshutterSpValid=true;
                   }
                else{
                  System.out.println("shutterSp is not valid");
                   }
				   
                if(expCompensation != null && !expCompensation.isEmpty()){
                   System.out.println("expCompensation is validated");
                   exposureCompensation=expCompensation;
                   isexpCompensationValid=true;
                      }
                else{
                  System.out.println("expCompensation is not valid");
                    }

               if(imgFor != null && !imgFor.isEmpty()){
                  System.out.println("imgFor is validated");
                  exposureCompensation=imgFor;
                  isimgForValid=true;
                  }
                else{
                  System.out.println("imgFor is not valid");
                  }

                if(wBal != null && !wBal.isEmpty()){
                     System.out.println("wBal is validated");
                     whiteBalance=wBal;
                     iswBalValid=true;
                    }
                   else{
                       System.out.println("wBal is not valid");
                    }

                if(focalLeng != null && !focalLeng.isEmpty()){
                       System.out.println("focalLeng is validated");
                       focalLength=focalLeng;
                       isfocalLengValid=true;
                     }
                   else{
                        System.out.println("focalLeng is not valid");
                        }

                if(metMod != null && !metMod.isEmpty()){
                      System.out.println("metMod is validated");
                      metMode=metMod;
                      ismetModValid=true;
                     }
                   else{
                     System.out.println("metMod is not valid");
                    }
                if(driveMode != null && !driveMod.isEmpty()){
                      System.out.println("driveMod is validated");
                      driveMode=driveMod;
                      isdriveModValid=true;
                     }
                   else{
                     System.out.println("driveMod is not valid");
                    }
                if(meteringMod != null && !meteringMod.isEmpty()){
                      System.out.println("meteringMod is validated");
                      meteringMode=meteringMod;
                      ismeteringModValid=true;
                     }
                   else{
                     System.out.println("meteringMod is not valid");
                    }
                if(isAperValid == true && isshutterSpValid==true && isexpCompensationValid==true && isimgForValid==true && iswBalValid==true && isfocalLengValid==true && ismetModValid==true && isdriveModValid==true && ismeteringModValid==true){
                   iscameraCreated=true;
                     }
                    return iscameraCreated;
                      }

        public static void getCamera(){
        System.out.println("The camera Details are:");
        System.out.println("The aperture is:"+aperture);
        System.out.println("The shutterSpeed is:"+shutterSpeed);
        System.out.println("The exposureCompensation is:"+exposureCompensation);
		System.out.println("The imageFormat is:"+imageFormat);
		System.out.println("The whiteBalance is:"+whiteBalance);
        System.out.println("The focalLength is:"+focalLength);
        System.out.println("The metMode is:"+metMode);
        System.out.println("The driveMode is:"+driveMode);
		System.out.println("The meteringMode is:"+meteringMode);
     }
}
