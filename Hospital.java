class Hospital {


        public static String[] findDoctorsBySpecilization(String specialization) {
            System.out.println("invoked findDoctorsBySpecilization");


            if (specialization == "General Medicine") {
                String generalMedicineDoctors[] = {"Dr.Anita Jain", "Dr.Aarav Naidu", "Dr.Divya Kapoor", "Dr.Sanjay S Menon", "Dr.Nikhil Agarwal", "Dr.Shreya Agarwal", "Dr.Aditya K Desai", "Dr.Divya Malhotra", "Dr.Rohit V Gupta", "Dr.Rahul S Mehta", "Dr.Karan N Gowda", "Dr.Sunita Saxena", "Dr.Kavya V Gowda", "Dr.Priya K Shetty", "Dr.Suresh Rao"};

                System.out.println("doctors are found");

                return generalMedicineDoctors;
            } else if (specialization == "Ortho") {
                String orthoDoctors[] = {"Dr. Aarav Sharma","Dr. Vivaan Patel","Dr. Aditya Singh","Dr. Arjun Reddy","Dr. Sai Kumar","Dr. Rohan Gupta","Dr. Karan Mehta","Dr. Rahul Verma","Dr. Ankit Jain","Dr. Mohit Agarwal","Dr. Neha Sharma","Dr. Priya Patel","Dr. Ananya Singh","Dr. Kavya Reddy","Dr. Pooja Gupta"};

                System.out.println("doctors are found");

                return orthoDoctors;
            }
			else if(specialization == "Cardiac Sciences"){
				String cardiacSciencesList[] = {"Dr. Sneha Verma","Dr. Riya Mehta","Dr. Isha Jain","Dr. Nisha Agarwal","Dr. Swati Mishra","Dr. Abhishek Yadav","Dr. Suresh Naidu","Dr. Mahesh Babu","Dr. Naveen Kumar","Dr. Praveen Shetty","Dr. Sunil Kulkarni","Dr. Deepak Choudhary","Dr. Vikas Saxena","Dr. Manish Tiwari","Dr. Harish Nair"};
				
			    System.out.println("doctors are found");	
				return cardiacSciencesList;
			}
			else if(specialization == "Anaesthesia"){
				String anaesthsiaList[] = {"Dr. Lakshmi Iyer","Dr. Meera Nair","Dr. Shreya Banerjee","Dr. Ritu Saxena","Dr. Divya Menon","Dr. Aishwarya Pillai","Dr. Bhavana Rao","Dr. Preeti Kulkarni","Dr. Sangeeta Joshi","Dr. Monica Kapoor","Dr. Tarun Bansal","Dr. Gaurav Arora","Dr. Nitin Malhotra","Dr. Sameer Khanna","Dr. Pankaj Sinha"};
				
			    System.out.println("doctors are found");	
				return anaesthsiaList;	
			}
			else if(specialization == "Oncology"){
				String oncologyList[] = {"Dr. Rajesh Tripathi","Dr. Amit Deshmukh","Dr. Yogesh Patil","Dr. Sanjay Pawar","Dr. Vinod Thakur","Dr. Rekha Nair","Dr. Sunita Reddy","Dr. Madhu Sharma","Dr. Alka Gupta","Dr. Kiran Verma","Dr. Seema Jain","Dr. Lata Mishra","Dr. Usha Menon","Dr. Veena Iyer","Dr. Padma Rao"};
				
			    System.out.println("doctors are found");	
				return oncologyList;	
			}			
			else if(specialization == "Neurology"){
				String neurologyList[] = {"Dr. Harsha Vardhan","Dr. Tejas Kulkarni","Dr. Rohit Shetty","Dr. Nikhil Bhat","Dr. Varun Chopra","Dr. Akash Srivastava","Dr. Chirag Shah","Dr. Devendra Singh","Dr. Hemant Joshi","Dr. Lokesh Rathi","Dr. Aditi Sharma","Dr. Radhika Patel","Dr. Tanvi Gupta","Dr. Megha Jain","Dr. Poonam Verma"};
				
			    System.out.println("doctors are found");	
				return neurologyList;	
			}
			else if(specialization == "Nephrology"){
				String nephrologyList[] = {"Dr. Nikita Agarwal","Dr. Sonal Mehta","Dr. Komal Singh","Dr. Shalini Reddy","Dr. Yamini Nair","Dr. Bharat Kumar","Dr. Dinesh Yadav","Dr. Ramesh Gowda","Dr. Shankar Iyer","Dr. Venkatesh Rao","Dr. Prakash Naik","Dr. Sudhir Shetty","Dr. Girish Hegde","Dr. Mohan Pai","Dr. Raghavendra Bhat"};
				
			    System.out.println("doctors are found");	
				return nephrologyList;	
			}
			else if(specialization == "Gastroenterology"){
				String gastroenterologyList[] = {"Dr. Anusha Rao","Dr. Deepa Kulkarni","Dr. Hema Srinivas","Dr. Jyoti Desai","Dr. Kavita Naidu","Dr. Lalitha Krishnan","Dr. Malini Subramanian","Dr. Nandini Prasad","Dr. Ojaswini Patil","Dr. Padmini Iyer","Dr. Aarush Mehta","Dr. Rithvik Sharma","Dr. Dev Patel","Dr. Krish Reddy","Dr. Yash Gupta"};
				
			    System.out.println("doctors are found");	
				return gastroenterologyList;	
			}
			else if(specialization == "Urology"){
				String urologyList[] = {"Dr. Omkar Kulkarni","Dr. Atharv Joshi","Dr. Shaurya Singh","Dr. Reyansh Jain","Dr. Darsh Shah","Dr. Esha Kapoor","Dr. Myra Bansal","Dr. Kiara Sinha","Dr. Anvi Desai","Dr. Ira Bhatt","Dr. Navya Rao","Dr. Diya Menon","Dr. Sara Khan","Dr. Zara Ali","Dr. Noor Sheikh"};
				
			    System.out.println("doctors are found");	
				return urologyList;	
			}
			else if(specialization == "Pulmonology"){
				String pulmonologyList[] = {"Dr. Omkar Kulkarni","Dr. Atharv Joshi","Dr. Shaurya Singh","Dr. Reyansh Jain","Dr. Darsh Shah","Dr. Esha Kapoor","Dr. Myra Bansal","Dr. Kiara Sinha","Dr. Anvi Desai","Dr. Ira Bhatt","Dr. Navya Rao","Dr. Diya Menon","Dr. Sara Khan","Dr. Zara Ali","Dr. Noor Sheikh"};
				
			    System.out.println("doctors are found");	
				return pulmonologyList;	
			}
			else if(specialization == "Ophthalmology"){
				String ophthalmologyList[] = {"Dr. Ayaan Khan","Dr. Faizan Ali","Dr. Imran Sheikh","Dr. Salman Qureshi","Dr. Arman Khan","Dr. Rehan Ansari","Dr. Sameera Khan","Dr. Farah Ali","Dr. Hina Qureshi","Dr. Sana Sheikh","Dr. Nikhita Reddy","Dr. Pavan Kumar","Dr. Lokesh Gowda","Dr. Manjunath Rao","Dr. Rakesh Naik"};
				
			    System.out.println("doctors are found");	
				return ophthalmologyList;	
			}
			else if(specialization == "ENT"){
				String entList[] = {"Dr. Sandeep Shetty","Dr. Prithvi Raj","Dr. Harini Iyer","Dr. Kavitha Rao","Dr. Shobha Nair","Dr. Uday Kulkarni","Dr. Mahima Sharma","Dr. Priti Shah","Dr. Rupal Mehta","Dr. Devika Nair","Dr. Anupama Rao","Dr. Sharmila Iyer","Dr. Keshav Bhat","Dr. Madhav Joshi","Dr. Pranav Kulkarni"};
				
			    System.out.println("doctors are found");	
				return entList;	
			}
			else if(specialization == "Obstetrics and Gynaecology"){
				String obstetricsAndGynaecologyList[] = {"Dr. Siddharth Rao","Dr. Tanmay Deshpande","Dr. Umesh Patil","Dr. Vaibhav Sharma","Dr. Yatin Verma","Dr. Zubin Contractor","Dr. Aarohi Desai","Dr. Bhakti Kulkarni","Dr. Charvi Shah","Dr. Daksha Patel","Dr. Eshita Mehra","Dr. Falguni Shah","Dr. Gauri Joshi","Dr. Heena Mehta","Dr. Ipsita Banerjee"};
				
			    System.out.println("doctors are found");	
				return obstetricsAndGynaecologyList;	
			}
			else if(specialization == "Dermatology"){
				String dermatologyList[] = {"Dr. Juhi Kapoor","Dr. Khushi Jain","Dr. Lavanya Iyer","Dr. Mitali Deshpande","Dr. Niharika Rao","Dr. Oindrila Sen","Dr. Pranjal Sharma","Dr. Rishika Gupta","Dr. Shreya Iyer","Dr. Tanisha Mehta","Dr. Urvashi Patel","Dr. Vaishnavi Rao","Dr. Waseem Khan","Dr. Xenia Dsouza","Dr. Yusra Khan"};
				
			    System.out.println("doctors are found");	
				return dermatologyList;	
			}	
			else if(specialization == "Diabetology/Endocrinology"){
				String diabetologyEndocrinologyList[] = {"Dr. Aaryan Kulshreshtha","Dr. Bhavesh Parmar","Dr. Chetan Borkar","Dr. Dhruv Upadhyay","Dr. Eklavya Soren","Dr. Farhan Siddiqui","Dr. Gagan Bedi","Dr. Hitesh Vora","Dr. Ishaan Talwar","Dr. Jatin Wadhwa","Dr. Kunal Suryavanshi","Dr. Lalit Bafna","Dr. Manav Purohit","Dr. Nitesh Chaudhary","Dr. Om Prakash Yadav"};
				
			    System.out.println("doctors are found");	
				return diabetologyEndocrinologyList;	
			}	
			else if(specialization == "Endocrine Surgery"){
				String endocrineSurgeryList[] = {"Dr. Parth Chatterjee","Dr. Qasim Merchant","Dr. Ritesh Khandelwal","Dr. Saurabh Kulshreshtha","Dr. Tapan Bhattacharya","Dr. Ujjwal Mahajan","Dr. Varad Deshpande","Dr. Wasim Akhtar","Dr. Yashwant Solanki","Dr. Zaid Pathan","Dr. Apeksha Tamhane","Dr. Bhavna Choksi","Dr. Chaitali Ghosh","Dr. Disha Pingle","Dr. Ekta Lakhani"};
				
			    System.out.println("doctors are found");	
				return endocrineSurgeryList;	
			}	
			else if(specialization == "Paediatrics"){
				String paediatricsList[] = {"Dr. Faria Rahman","Dr. Garima Kukreja","Dr. Heeral Thakkar","Dr. Ipshita Mukherjee","Dr. Jhanvi Venkataraman","Dr. Karishma Wankhede","Dr. Leena Fernandes","Dr. Manya Bhutani","Dr. Neelam Poojary","Dr. Ojasvi Kulkarni","Dr. Piyali Chakraborty","Dr. Qurratulain Rizvi","Dr. Rachita Vohra","Dr. Sharmistha Dutta","Dr. Trisha Bhowmick"};
				
			    System.out.println("doctors are found");	
				return paediatricsList;	
			}	
			else if(specialization == "General Surgery"){
				String generalSurgeryList[] = {"Dr. Udita Bansode","Dr. Vaidehi Apte","Dr. Wincy Dsouza","Dr. Yashashree Jadhav","Dr. Zarna Mistry","Dr. Adarsh Nambiar","Dr. Brijesh Bhalerao","Dr. Chetanya Hiremath","Dr. Darpan Mankad","Dr. Eshwarappa Hadimani","Dr. Feroz Tamboli","Dr. Giridhar Kamat","Dr. Harendra Pal Singh","Dr. Indrajit Paul","Dr. Jagadeesh Hiremath"};
				
			    System.out.println("doctors are found");	
				return generalSurgeryList;	
			}
			else if(specialization == "General Physician"){
				String generalPhysicianList[] = {"Dr. Karthikeya Goud","Dr. Lokendra Rawat","Dr. Mahendra Barot","Dr.Nancy Dsouza","Dr. Yashashree Jadhav","Dr. Zarna Mistry","Dr. Adarsh Nambiar","Dr. Brijesh Bhalerao","Dr. Chetanya Hiremath","Dr. Darpan Mankad","Dr. Eshwarappa Hadimani","Dr. Feroz Tamboli","Dr. Giridhar Kamat","Dr. Harendra Pal Singh","Dr. Indrajit Paul","Dr. Jagadeesh Hiremath"};
				
			    System.out.println("doctors are found");	
				return generalPhysicianList;	
			}			
			else if(specialization == "Internal Medicine"){
				String internalMedicineList[] = {"Dr. Udita Bansode","Dr. Vaidehi Apte","Dr. Wincy Dsouza","Dr. Yashashree Jadhav","Dr. Zarna Mistry","Dr. Adarsh Nambiar","Dr. Brijesh Bhalerao","Dr. Chetanya Hiremath","Dr. Darpan Mankad","Dr. Eshwarappa Hadimani","Dr. Feroz Tamboli","Dr. Giridhar Kamat","Dr. Harendra Pal Singh","Dr. Indrajit Paul","Dr. Jagadeesh Hiremath"};
				
			    System.out.println("doctors are found");	
				return internalMedicineList;	
			}
			else if(specialization == "Critical Care"){
				String criticalCareList[] = {"Dr. Srikant Velankar","Dr. Tushar Karmakar","Dr. Udayan Chakravarty","Dr. Zarna Mistry","Dr. Adarsh Nambiar","Dr. Brijesh Bhalerao","Dr. Chetanya Hiremath","Dr. Darpan Mankad","Dr. Eshwarappa Hadimani","Dr. Feroz Tamboli","Dr. Giridhar Kamat","Dr. Harendra Pal Singh","Dr. Indrajit Paul","Dr. Jagadeesh Hiremath"};
				
			    System.out.println("doctors are found");	
				return criticalCareList;	
			}
			else if(specialization == "Emergency and Trauma"){
				String emergencyAndTraumaList[] = {"Dr. Mahendra Barot","Dr. Vaidehi Apte","Dr. Wincy Dsouza","Dr. Yashashree Jadhav","Dr. Zarna Mistry","Dr. Adarsh Nambiar","Dr. Brijesh Bhalerao","Dr. Chetanya Hiremath","Dr. Darpan Mankad","Dr. Eshwarappa Hadimani","Dr. Feroz Tamboli","Dr. Giridhar Kamat","Dr. Harendra Pal Singh","Dr. Indrajit Paul","Dr. Jagadeesh Hiremath"};
				
			    System.out.println("doctors are found");	
				return emergencyAndTraumaList;	
			}
			else if(specialization == "Radiology"){
				String radiologyList[] = {"Dr. Qadeer Hussain","Dr. Raghunandan Hegde","Dr. Srikant Velankar","Dr. Tushar Karmakar","Dr. Udayan Chakravarty","Dr. Vigneshwar R","Dr. Wasudev Borse","Dr. Yashashree Jadhav","Dr. Zarna Mistry","Dr. Adarsh Nambiar","Dr. Brijesh Bhalerao","Dr. Chetanya Hiremath","Dr. Darpan Mankad","Dr. Eshwarappa Hadimani","Dr. Feroz Tamboli","Dr. Giridhar Kamat","Dr. Harendra Pal Singh","Dr. Indrajit Paul","Dr. Jagadeesh Hiremath"};
				
			    System.out.println("doctors are found");	
				return radiologyList;	
			}
			else if(specialization == "Interventional Radiology"){
				String interventionalRadiologyList[] = {"Dr. Tushar Karmakar","Dr. Vaidehi Apte","Dr. Wincy Dsouza","Dr. Yashashree Jadhav","Dr. Zarna Mistry","Dr. Adarsh Nambiar","Dr. Brijesh Bhalerao","Dr. Chetanya Hiremath","Dr. Darpan Mankad","Dr. Eshwarappa Hadimani","Dr. Feroz Tamboli","Dr. Giridhar Kamat","Dr. Harendra Pal Singh","Dr. Indrajit Paul","Dr. Jagadeesh Hiremath"};
				
			    System.out.println("doctors are found");	
				return interventionalRadiologyList;	
			}
			else if(specialization == "Nuclear Medicine"){
				String nuclearMedicineList[] = {"Dr. Abhay Kulkarni","Dr. Bhargav Reddy","Dr. Chinmay Desai","Dr. Dheeraj Nair","Dr. Eshan Gupta","Dr. Faisal Khan","Dr. Gokul Krishna","Dr. Hemanth Kumar","Dr. Ilesh Shah","Dr. Jayanth Gowda","Dr. Yashashree Jadhav","Dr. Zarna Mistry","Dr. Adarsh Nambiar","Dr. Brijesh Bhalerao","Dr. Chetanya Hiremath","Dr. Darpan Mankad","Dr. Eshwarappa Hadimani","Dr. Feroz Tamboli","Dr. Giridhar Kamat","Dr. Harendra Pal Singh","Dr. Indrajit Paul","Dr. Jagadeesh Hiremath"};
				
			    System.out.println("doctors are found");	
				return nuclearMedicineList;	
			}
			else if(specialization == "Haematology"){
				String haematologyList[] = {"Dr. Gokul Krishna","Dr. Hemanth Kumar","Dr. Ilesh Shah","Dr. Jayanth Gowda","Dr. Karthik Iyer","Dr. Lokith Reddy","Dr. Mohan Krishna","Dr. Nilesh Patil","Dr. Omkar Deshmukh","Dr. Brijesh Bhalerao","Dr. Chetanya Hiremath","Dr. Darpan Mankad","Dr. Eshwarappa Hadimani","Dr. Feroz Tamboli","Dr. Giridhar Kamat","Dr. Harendra Pal Singh","Dr. Indrajit Paul","Dr. Jagadeesh Hiremath"};
				
			    System.out.println("doctors are found");	
				return haematologyList;	
			}
			else if(specialization == "Hemato-Oncology"){
				String hematoOncologyList[] = {"Dr. Lakshmi Iyer","Dr. Meera Nair","Dr. Shreya Banerjee","Dr. Ritu Saxena","Dr. Divya Menon","Dr. Aishwarya Pillai","Dr. Bhavana Rao","Dr. Preeti Kulkarni","Dr. Sangeeta Joshi","Dr. Monica Kapoor","Dr. Tarun Bansal","Dr. Gaurav Arora","Dr. Nitin Malhotra","Dr. Sameer Khanna","Dr. Pankaj Sinha"};
				
			    System.out.println("doctors are found");	
				return hematoOncologyList;	
			}
			else if(specialization == "Medical Oncology"){
				String medicalOncologyList[] = {"Dr. Nikita Agarwal","Dr. Sonal Mehta","Dr. Komal Singh","Dr. Shalini Reddy","Dr. Yamini Nair","Dr. Bharat Kumar","Dr. Dinesh Yadav","Dr. Ramesh Gowda","Dr. Shankar Iyer","Dr. Venkatesh Rao","Dr. Prakash Naik","Dr. Sudhir Shetty","Dr. Girish Hegde","Dr. Mohan Pai","Dr. Raghavendra Bhat"};
				
			    System.out.println("doctors are found");	
				return medicalOncologyList;	
			}			
			else if(specialization == "Surgical Oncology"){
				String surgicalOncologyList[] = {"Dr. Falguni Mehra","Dr. Garvita Arora","Dr. Rohit Shetty","Dr. Nikhil Bhat","Dr. Varun Chopra","Dr. Akash Srivastava","Dr. Chirag Shah","Dr. Devendra Singh","Dr. Hemant Joshi","Dr. Lokesh Rathi","Dr. Aditi Sharma","Dr. Radhika Patel","Dr. Tanvi Gupta","Dr. Megha Jain","Dr. Poonam Verma"};
				
			    System.out.println("doctors are found");	
				return surgicalOncologyList;	
			}
			else if(specialization == "Radiation Oncology"){
				String radiationOncologyList[] = {"Dr. Aakash Bhat","Dr. Bhupendra Solanki","Dr. Komal Singh","Dr. Shalini Reddy","Dr. Yamini Nair","Dr. Bharat Kumar","Dr. Dinesh Yadav","Dr. Ramesh Gowda","Dr. Shankar Iyer","Dr. Venkatesh Rao","Dr. Prakash Naik","Dr. Sudhir Shetty","Dr. Girish Hegde","Dr. Mohan Pai","Dr. Raghavendra Bhat"};
				
			    System.out.println("doctors are found");	
				return radiationOncologyList;	
			}
			else if(specialization == "Organ Transplant"){
				String organTransplantList[] = {"Dr. Falguni Mehra","Dr. Garvita Arora","Dr. Hiral Vyas","Dr. Ishita Taneja","Dr. Jigyasa Seth","Dr. Kanchan Luthra","Dr. Lopa Mudgal","Dr. Mansi Vaidya","Dr. Nupur Tandon","Dr. Oorja Sethi","Dr. Pankhuri Goel","Dr. Qurat Ul Ain","Dr. Rashi Luthra","Dr. Shikha Puri","Dr. Tanaya Khurana"};
				
			    System.out.println("doctors are found");	
				return organTransplantList;	
			}
			else if(specialization == "Kidney Transplant"){
				String kidneyTransplantList[] = {"Dr. Omkar Kulkarni","Dr. Atharv Joshi","Dr. Shaurya Singh","Dr. Reyansh Jain","Dr. Darsh Shah","Dr. Esha Kapoor","Dr. Myra Bansal","Dr. Kiara Sinha","Dr. Anvi Desai","Dr. Ira Bhatt","Dr. Navya Rao","Dr. Diya Menon","Dr. Sara Khan","Dr. Zara Ali","Dr. Noor Sheikh"};
				
			    System.out.println("doctors are found");	
				return kidneyTransplantList;	
			}			
			
			else {
				System.out.println(specialization + " not found here");
			}

            return null;
        }

           
	public static void getDoctors(String[] doctors, String specialization){
		System.out.println("Doctors found based on "+specialization+" speciality");
		for(String doctor:doctors) System.out.println(doctor);
        }


    }
	
	
