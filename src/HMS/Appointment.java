
package HMS;

import java.util.Scanner;

public class Appointment {
  
    public String aname, date, time, docname, rea;
    
   void new_appointment()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name:");
        aname=input.nextLine();
        System.out.println("Enter Date:");
        date=input.nextLine();
        System.out.println("Enter Time:");
        time=input.nextLine();
        System.out.println("Enter Doctor Name");
        docname=input.nextLine();
        System.out.println("Enter Purpose");
        rea=input.nextLine();
    }
    void appointment_info()
    {
        System.out.println(aname+"  \t\t "+date+"  \t\t "+time+"  \t\t "+docname+"  \t\t "+rea);
                            
    }
    void appinfo()
    {
         System.out.println("\n\t\t-----------------------------------------------------------------");
         System.out.println("\t\t\t\tWELCOME APPOINTMENT SECTION");
         System.out.println("\t\t-----------------------------------------------------------------");
         System.out.println("\n\t\t\t 1.Add New Appointment  \n\t\t\t 2.Appointment Records  \nYour Choice:");
    }
    
}
