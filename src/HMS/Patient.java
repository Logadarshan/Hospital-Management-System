
package HMS;

import java.util.Scanner;

public class Patient
{
  
    public String name, dob, add, num, gender,sta,dis,c;
    public int age;

   
    void new_patient()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Patient Name:");
        name=input.nextLine();
        System.out.println("Enter Patient Age:");
        age=input.nextInt();
        c=input.nextLine();
        System.out.println("Enter Patient Date of Birth:");
        dob=input.nextLine();
        System.out.println("Enter Patient Address");
        add=input.nextLine();
        System.out.println("Enter Patient Phone Number");
        num=input.nextLine();
        System.out.println("Enter Gender");
        gender=input.nextLine();
        System.out.println("Enter Disease");
        dis=input.nextLine();
        System.out.println("Enter Status");
        sta=input.nextLine();
    }
    void patient_info()
    {
        System.out.println(name+"  \t\t "+age+"  \t\t "+dob+"  \t\t "+add+"  \t\t "+num+"  \t\t "+gender+"  \t\t "+dis+"  \t\t "+sta);
                            
    }
    void pinfo()
    {
         System.out.println("\n\t\t-----------------------------------------------------------------");
         System.out.println("\t\t\t\tWELCOME PATIENT SECTION");
         System.out.println("\t\t-----------------------------------------------------------------");
         System.out.println("\n\t\t\t 1.Add New Patient Profile  \n\t\t\t 2.Patient Records  \nYour Choice:");
    }
}  
    

