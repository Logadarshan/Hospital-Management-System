
package HMS;

public class Department implements DepartmentInterface{ 
    
    public String doname, did, staname, docname;
    
    public Department (String doname,String did,String staname,String docname)
    {
        this.doname = doname;
        this.did = did;
        this.staname = staname;
        this.docname = docname;
    }

    public Department() 
    {
     
    }
   
    @Override
    public String getdoname()
    {
        return doname;
    }
    
    @Override
    public String getdid()
    {
        return did;
    }
    
    @Override
    public String getstaname()
    {
        return staname;
    }
    
    @Override
    public String getdocname()
    {
        return docname;
    }
     
    @Override
    public void setdoname(String doname)
    {
        this.doname = doname;
    }
    
    @Override
    public void setdid(String did)
    {
        this.did = did;
    }
    
    @Override
    public void setstaname(String staname)
    {
        this.staname = staname;     
    }
    
   
    @Override
    public void setdocname(String docname)
    {
        this.docname = docname;
    }
    
  
    @Override
    public void displayDepartmentList()
    {
        System.out.println(getdoname()+"  \t\t "+getdid()+"  \t\t "+getstaname()+"  \t\t "+getdocname());
    }

    @Override
    public void diplayDepartment() {
        System.out.println("\n\t\t-----------------------------------------------------------------");
        System.out.println("\t\t\t\tWELCOME DEPARTMENT SECTION");
        System.out.println("\t\t-----------------------------------------------------------------");
        System.out.println("\n\t\t\t 1.Add Department Details  \n\t\t\t 2.Department Records  \nYour Choice:");
    }
}
