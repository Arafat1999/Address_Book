import java.util.*;
import java.util.Scanner;

public class AddressBook 
{
	public static List<String> l=new ArrayList<String>();
	public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
     boolean y=true;  
     do{   
		 System.out.println("******WELCOME TO ADDRESS BOOK******");
         System.out.println("1. Add Name in Address Book.");  
         System.out.println("2. Search Name In Address Book.");
         System.out.println("3. Delete Name In Address Book."); 
         System.out.println("4. Print Number of Names In Address Book.");
         System.out.println("5. Print list of Names Along with Index Value In Address Book.");
         System.out.println("6. Exit");
         System.out.println(" ");
         System.out.println("Enter Your Choice:");
         int choice=in.nextInt();
         switch(choice)
         {
            case 1:
                insert();
                break;
            case 2:
                search();
                break;
            case 3:
                delete();
                break;
            case 4:
                total();
                break;
            case 5:
                print();
                break;
            case 6:
                toexit();
                break;
            default:
                System.out.println("Invalid Input !!!");
                break;
        }
        System.out.println("Want to Process More ?  y/n");
        String x=in.next();
        char ch=x.charAt(0); 
        
        if( ch=='n')
            y=false;
    }
    while(y!=false);
   
    }
    
    
    //INSERT
    static public void insert(){
       
       
       Scanner in=new Scanner(System.in);
        
        boolean y=true;
       do{
            System.out.println("Enter Name to Add In Address Book.");
            String chara=in.next();
            l.add(chara);
            System.out.println("Want to Add More Names In Address Book ? y/n");
            String x=in.next();
            char ch=x.charAt(0);
            if( ch=='n')
                y=false;
         }
       while(y!=false); 
   }
   
   
   
  //PRINT
  static public void print(){
       
       
       if(l.isEmpty())
           System.out.println("List is Empty ");
       else
            System.out.println("List of  Names Along with Index Value In Address Book Is:");
            for(int i=0 ; i<l.size();i++)
                System.out.println("index "+i+" : "+ l.get(i)+" ");
      
   }
   
   //SEARCH
   static public void search(){
       
       //List<Integer> I=new ArrayList<Integer>();
       System.out.println("Enter Name to search");
       Scanner in=new Scanner(System.in);
       
       String chara=in.next();
       for(int i=0;i<l.size();i++){
           if(l.get(i).equals(chara))
                System.out.println(chara+" is  PRESENT at Index "+i);
       }
         
       if(l.lastIndexOf(chara)==-1)
               System.out.println(chara+" is NOT PRESENT");
   }

   
    //DELETE
    static public void delete(){
        
        
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Index value you want to Delete");
        int num=in.nextInt();
        l.remove(num);
        
    }
    
    
    
     //TOTAL
     static public void total(){
        
        
        System.out.println("Number of Names In Address Book Is: "+ l.size());
    }
    
    
    //EXIT
    static public void toexit(){
        
        System.exit(0);
    }
}
