
package HMS;

public class Doctor extends Worker {
    
     public Doctor(String name,String type,String dep,String id,String num)
    {
        super(name,type,dep, id, num) ; 
    }
    Doctor() 
    {
     
    }
   @Override
    public void DisplayUser()
    {
     System.out.println(getname()+"  \t\t "+getid()+"  \t\t "+gettype()+"  \t\t "+getdep()+"  \t\t "+getnum());   
    }
    @Override
    public void displayUserList() 
    {
        System.out.println("\n\t\t-----------------------------------------------------------------");
        System.out.println("\t\t\t\tWELCOME DOCTOR SECTION");
        System.out.println("\t\t-----------------------------------------------------------------");
        System.out.println("\n\t\t\t 1.Add New Doctor Profile  \n\t\t\t 2.Doctor Records  \nYour Choice:");  
    } 
}