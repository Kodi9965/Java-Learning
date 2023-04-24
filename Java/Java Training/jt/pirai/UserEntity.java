package jt.pirai;

import java.util.*;
class User{
    private String name;
    private String mobileNumber;
    private String email;
    private String creditCardNumber;
    private String district;
    User(){}
    User( String name,String mobileNumber,String email,String district){
        this.name=name;
        this.mobileNumber=mobileNumber;
        this.email = email;
        this.district=district;
    }
   
  
    public String getDistrict() {
		return district;
	}
//	public void setDistrict(String district) {
//		this.district = district;
//	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName(){
        return name;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }
    public String getEmail(){
        return email;
    }
    public String getCreditCardNumber(){
        return creditCardNumber;
    }
//    public void searchByMobileNumber(){
//     
//    }
//    public void searchByMobileNumberAndSetNewId(){
//        
//    }
//    public String toString(){
//        return     
//    }
//	public boolean contains(String subname) {
//		// TODO Auto-generated method stub
//		return false;
//	}
   
}

class User1 extends User{
    public User searchByMobileNumber(ArrayList<User>arraylist,String number){
        for(User a:arraylist){
            if(a.getMobileNumber().equals(number)){
                System.out.println(a.getName()+" "+a.getEmail()+" "+a.getMobileNumber());            
               }

         
        }
		return null;
    
        
    }
    public User searchByMobileNumberAndSetNewId(ArrayList<User> arrarraylist,String number1){
    	Scanner s = new Scanner(System.in);
    	for (User a1 : arrarraylist) {
    		if(a1.getMobileNumber().equals(number1)) {
    			System.out.println("Enter the New mail id : ");
    			String str = s.next();
    			a1.setEmail(str);
    			System.out.println("MailID Changed");
                System.out.println(a1.getName()+" "+a1.getEmail()+" "+a1.getMobileNumber());            
    		} 
//    		else {
//    			System.out.println("Invalid MobileNumber");
//    		}
		}
    	return null;
        
    }
    public User findSubstring(ArrayList<User> arraylist,String subname){
    		ArrayList ar = new ArrayList();
           for (User a2:arraylist) {
        	   if(a2.getName().contains(subname)){
        		   ar.add(a2.getName());
               }
		}
           if(ar.isEmpty()) {
        	   System.out.println("not found");
           }
           else {
        	   System.out.println(ar);
           }
		return null;
    }    
            

    public User findDistrict(ArrayList<User> arraylist,String dis){
    	ArrayList arr1 = new ArrayList();
    	for (User u1 : arraylist) {
			if(u1.getDistrict().equals(dis)) {
				arr1.add(u1.getName());
			}
			
			
		}
    	  if(arr1.isEmpty()) {
       	   System.out.println("not found");
          }
          else {
       	   System.out.println(arr1);
          }
		return null;
    	
    }
    
    
}



class UserEntity{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of user details to be inserted :");
        int Consumer = s.nextInt();
       
        ArrayList<User> array1 = new ArrayList<User>();            

        for(int i =1;i<=Consumer;i++){
            System.out.println("Enter details of user "+i+":");
            System.out.println("Name :");
            String name = s.next();
            System.out.println("Enter mobile number :");
            String moblieNumber = s.next();
            System.out.println("Enter email address :");
            String emailId = s.next();
//            ArrayList arrayList = new ArrayList();
            System.out.println("Enter address details :");
            System.out.println("Enter door number :");
            String door = s.next();
            System.out.println("Enter street name :");
            String  stname = s.next();
            System.out.println("Enter city name :");
            String city = s.next();
            System.out.println("Enter district name :");
            String distrcit = s.next();
            System.out.println("Enter state name :");
            String state = s.next();
//            System.out.println(array1);
            User user = new User(name,moblieNumber,emailId,distrcit);  
            array1.add(user);
        }
        System.out.println("1) Search for user details using mobile number :");
            
            User1 u1 = new User1();
            do {
            int ch=s.nextInt();
            switch(ch) {
            	case 1:
            			System.out.println("Enter the mobile number :");
            			String number = s.next();
            			u1.searchByMobileNumber(array1,number);
            			break;
            	case 2:
        				System.out.println("Enter the mobile number to change mailID :");
        				String number1 = s.next();
        				u1.searchByMobileNumberAndSetNewId(array1,number1);
        				break;
            	case 3:	
            			System.out.println("Enter the SubString :");
            			String subName = s.next();
            			u1.findSubstring(array1,subName);
            			break;
            		
            	case 4:
            			System.out.println("Enter the District  :");
            			String dis = s.next();
            			u1.findDistrict(array1,dis);
            			break;            	
            	case 5:
            			System.out.println("Thank you");
            			System.exit(0);
            	}
            
            }while(true);

    }
}



