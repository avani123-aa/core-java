class Facebook{
       static String firstName;
       static String surName;
       static String dateOfBirth;
       static String gender;
       static String emailId;
       static String password;

            public static boolean createAccount(String fName,String sName,String dob,String gen,String email,String pwd){
            boolean isAccountCreated=false;

            boolean isFNameValid=false;
            boolean isSNameValid=false;
            boolean isDobValid=false;
            boolean isGenderValid=false;
            boolean isEmailValid=false;
            boolean isPwdValid=false;

                if(fName != null && !fName.isEmpty()){
                   System.out.println("fName is validated");
                   firstName=fName;
                   isFNameValid=true;
                      }
                else{
                  System.out.println("fName is not valid");
                    }

                if(sName != null && !sName.isEmpty()){
                   System.out.println("sName is validated");
                   surName=sName;
                   isSNameValid=true;
                   }
                else{
                  System.out.println("sName is not valid");
                   }

               if(dob != null && !dob.isEmpty()){
                  System.out.println("dob is validated");
                  dateOfBirth=dob;
                  isDobValid=true;
                  }
                else{
                  System.out.println("dob is not valid");
                  }

                if(gen != null && !gen.isEmpty()){
                     System.out.println("gender is validated");
                     gender=gen;
                     isGenderValid=true;
                    }
                   else{
                       System.out.println("gender is not valid");
                    }

                if(email != null && !email.isEmpty()){
                       System.out.println("email is validated");
                       emailId=email;
                       isEmailValid=true;
                     }
                   else{
                        System.out.println("email is not valid");
                        }

                if(pwd != null && !pwd.isEmpty()){
                      System.out.println("password is validated");
                      password=pwd;
                      isPwdValid=true;
                     }
                   else{
                     System.out.println("password is not valid");
                    }
                if(isFNameValid == true && isSNameValid==true && isDobValid==true && isGenderValid==true && isEmailValid==true && isPwdValid==true){
                   isAccountCreated=true;
                     }
                    return isAccountCreated;
                      }

        public static void getAccountDetails(){
        System.out.println("The Account Details are:");
        System.out.println("The firstName is:"+firstName);
        System.out.println("The surName is:"+surName);
        System.out.println("The dateOfBirth is:"+dateOfBirth);
        System.out.println("The gender is:"+gender);
        System.out.println("The emailId is:"+emailId);
        System.out.println("The password is:"+password);
     }
}