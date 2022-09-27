
package HMS;
import java.util.*;

public class HMS {

   
public static void main(String[] args) {

   Scanner input = new Scanner(System.in);
   int choice, opt,b,age;
   String name,num,type, dep,id,docname,did, staname, doname,n;
   int doct=0, staf=0 , dept=0;
   int i = 0;
   int l;
   int m=3;
   
    Patient[] p = new Patient[10];
    for (l = 0; l < 10; l++)
    p[l] = new Patient();
    p[0].name = "Dars";p[0].age = 20;p[0].dob = "12 Feb 2000";p[0].add= "22 Permai";p[0].gender = "M";p[0].dis = "Fever";p[0].sta="Discharged";p[0].num="0193938748";
    p[1].name = "Raju";p[1].age = 36;p[1].dob = "14 Mac 1984";p[1].add= "2345 Okland";p[1].gender = "M";p[1].dis = "Medical Checkup";p[1].sta="Discharged";p[1].num="0134356423";
    p[2].name = "Siti";p[2].age = 67;p[2].dob = "9 Dec 1857";p[2].add= "344 Anggerik";p[2].gender = "F";p[2].dis = "Blood Pressure";p[2].sta="Admitted";p[2].num="0193933575";
   
  
   Worker Doctor[]  = new Doctor[10];
   Doctor[0] = new Doctor("Lim Wei","Surgeon","General Surgeory","CB192830","0192937364");
   Doctor[1] = new Doctor("Loga","Cardiologists","Cardiology","CB19083","01123415482");
   Doctor[2] = new Doctor("Abu Bakar","Neurologists","Neurology","CD18273","01929390765");
   
   Worker Staff[] = new Staff[10];
   Staff[0] = new Staff("Siti","Nurse","General Surgeory","CB19246","0115489643");
   Staff[1] = new Staff("Mala","Receptionist","Patient Service","CB19234","0193682953");
   Staff[2] = new Staff("Lee","Manager","Human Resources","CD14683","01293440184");
   
   Appointment[] a = new Appointment[10];
   for (l = 0; l < 10; l++)
   a[l] = new Appointment();
   a[0].aname="Mail";a[0].date="20 Dec 2020";a[0].docname="Loga";a[0].rea="Heart Problem";a[0].time="11.30am";
   a[1].aname="Leeye";a[1].date="25 Dec 2020";a[1].docname="Abu";a[1].rea="Medical";a[1].time="9.30am";
   a[2].aname="Siti";a[2].date="29 Dec 2020";a[2].docname="Lim";a[2].rea="High Fever";a[2].time="2.00pm";
   
   Department Department[]= new Department[10];
   Department[0] = new Department("General Surgeory","GK23","Rajan","Lim Wei");
   Department[1] = new Department("Cardiology","CAR68","Abu","Loga");
   Department[2] = new Department("Neurology","N24","Lim","Abu Bakar");
   

   System.out.println("\n\t\t-----------------------------------------------------------------");
   System.out.println("\t\t\t\tWELCOME HOSPITAL MANAGEMENT SYSTEM");
   System.out.println("\t\t-----------------------------------------------------------------");
   System.out.println("\n\n\t\t-----------------------------------------------------------------");
   System.out.println("\t\t\t\t\tMAIN MENU");
   System.out.println("\n\t\t\t 1.Patient  \n\t\t\t 2.Doctor  \n\t\t\t 3.Satff  \n\t\t\t 4.Appoinment  \n\t\t\t 5.Department");
   System.out.println("\t\t-----------------------------------------------------------------");
   
   System.out.println("\n\nEnter Your Choice : ");
   choice = input.nextInt();
   
   switch(choice)
   {
       case 1 : 
                {
                b = 1;
                while (b == 1)
                {
                p[m].pinfo();
                opt = input.nextInt();
                
                           if (opt == 1)
                            {
                    
                             p[m].new_patient();m++;
                            
                            }
                           else if (opt ==2)
                            {
                             System.out.println("\n\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                             System.out.println("Name  \t\t Age  \t\t DOB  \t\t\t Address  \t\t Number  \t\t Gender  \t Disease  \t\t Status");
                             System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                             for (int j = 0; j < m; j++) 
                                {
                                  p[j].patient_info();
                                }
                            
                            }
                           else
                            {
                              System.out.println("INVALID PIN");
                            }
                System.out.println("\nReturn to Back Press 1 and for Exit Press 0 :");
                b = input.nextInt();
                }
                break;
                }
       case 2 :
               {
                b = 1;
                while (b == 1)
                {
                Doctor[i].displayUserList();
                opt = input.nextInt();
                
                           if (opt == 1)
                            {
                               for(int x=4 + doct; x < Doctor.length; x++)                          
                               {
                                 n=input.nextLine();    
                                 System.out.println("Enter Doctor Name:");
                                 name=input.nextLine();
                                 System.out.println("Enter Doctor ID:");
                                 id=input.nextLine();
                                 System.out.println("Enter Doctor Type:");
                                 type=input.nextLine();
                                 System.out.println("Enter Department");
                                 dep=input.nextLine();
                                 System.out.println("Enter Doctor Phone Number");
                                 num=input.nextLine();
                                 Doctor[x] = new Doctor(name,type,dep, id, num);
                                 doct += 1;
                                 break;                          
                               }
                            }
                           else if (opt ==2) 
                            {
                             System.out.println("\n\n-----------------------------------------------------------------------------------------------------------------------------------");                                 
                             System.out.println("Name  \t\t\t ID  \t\t\t TYPE  \t\t\t DEPARMENT  \t\t NUMBER");
                             System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
                                for(int x = 0; x < Doctor.length; x++)                           
                                {                               
                                   if(Doctor[x] != null)                                
                                      {  
                                       Doctor[x].DisplayUser(); 
                                      }                            
                                } 
                            }
                           else
                            {
                              System.out.println("INVALID PIN");
                            }
                System.out.println("\nReturn to Back Press 1 and for Exit Press 0 :");
                b = input.nextInt();
                }
                break;
                }
              case 3 :
               {
                b = 1;
                while (b == 1)
                {
                Staff[i].displayUserList();
                opt = input.nextInt();
                
                           if (opt == 1)
                            {
                                for(int x=4 + staf; x < Staff.length; x++)                          
                               {
                                  n=input.nextLine();  
                                  System.out.println("Enter Staff Name:");
                                  name=input.nextLine();
                                  System.out.println("Enter Staff ID:");
                                  id=input.nextLine();
                                  System.out.println("Enter Staff Type:");
                                  type=input.nextLine();
                                  System.out.println("Enter Department");
                                  dep=input.nextLine();
                                  System.out.println("Enter Staff Phone Number");
                                  num=input.nextLine();
                                  Staff[x] = new Staff(name,type,dep, id, num);
                                  staf += 1;
                                  break; 
                                }
                            }
                           else if (opt ==2)
                            {
                             System.out.println("\n\n----------------------------------------------------------------------------------------------------------------");
                             System.out.println("Name  \t\t ID  \t\t\t TYPE  \t\t\t DEPARMENT  \t\t\tNUMBER");
                             System.out.println("----------------------------------------------------------------------------------------------------------------");
                             for(int x = 0; x < Doctor.length; x++)                           
                                {                               
                                   if(Staff[x] != null)                                
                                      {  
                                       Staff[x].DisplayUser(); 
                                      }                            
                                } 
                            }
                           else
                            {
                              System.out.println("INVALID PIN");
                            }
                System.out.println("\nReturn to Back Press 1 and for Exit Press 0 :");
                b = input.nextInt();
                }
                break;
                }
       case 4 :
               {
               b = 1;
                while (b == 1)
                {
                a[m].appinfo();
                opt = input.nextInt();
                
                           if (opt == 1)
                            {
                               a[m].new_appointment();m++;
                            }
                           else if (opt == 2) 
                            {
                             System.out.println("\n\n------------------------------------------------------------------------------------------------------------------------------");
                             System.out.println("Name  \t\t DATE  \t\t\t TIME  \t\t\t DOC.NAME  \t\t PURPOSE");
                             System.out.println("------------------------------------------------------------------------------------------------------------------------------");
                              for (int j = 0; j < m; j++) 
                                {
                                  a[j].appointment_info();
                                }
                            }
                           else
                            {
                              System.out.println("INVALID PIN");
                            }
                System.out.println("\nReturn to Back Press 1 and for Exit Press 0 :");
                b = input.nextInt();
                }
                break;
                }
       case 5 :
               {
                b = 1;
                while (b == 1)
                {
                Department[i].diplayDepartment();
                opt = input.nextInt();
                
                           if (opt == 1)
                            {
                                for(int x=4 + dept; x < Department.length; x++)                          
                               {
                                n=input.nextLine();
                                System.out.println("Enter Department Name:");
                                doname=input.nextLine();
                                System.out.println("Enter Department ID:");
                                did=input.nextLine();
                                System.out.println("Enter Staff Name:");
                                staname=input.nextLine();
                                System.out.println("Enter Doctor Name");
                                docname=input.nextLine();
                                Department[x] = new Department(doname,did,staname,docname);
                                dept += 1;
                                break; 
                                }
                            }
                           else if (opt ==2)
                            {
                             System.out.println("\n\n----------------------------------------------------------------------------------");
                             System.out.println("DEPARMENT NAME  \t DEPARMENT ID  \t\t STAFF.NAME  \t DOC.NAME");
                             System.out.println("----------------------------------------------------------------------------------");
                             for(int x = 0; x < Department.length; x++)                           
                                {                               
                                   if(Department[x] != null)                                
                                      {  
                                       Department[x].displayDepartmentList(); 
                                      }                            
                                } 
                            }
                           else
                            {
                              System.out.println("INVALID PIN");
                            }
                System.out.println("\nReturn to Back Press 1 and for Exit Press 0 :");
                b = input.nextInt();
                }
                break;
                }

              default:
                    {
                        System.out.println(" You Have Enter Wrong Choice!!!");
                    }
}
   
}
}

   

    




    
