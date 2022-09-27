
package HMS;

abstract public class Worker {
    
    public String name, type, dep,id,num;
    
    public Worker(String name,String type,String dep,String id,String num)
    {
        this.name = name;
        this.type = type;
        this.dep = dep;
        this.id = id;
        this.num = num;      
    }

    public Worker() 
    {
     
    }
    
    public String getname(){
        return name;
    }
    public String gettype(){
        return type;
    }
    public String getdep(){
        return dep;
    }
    public String getid(){
        return id;
    }
    public String getnum(){
        return num;
    }
    
    public void setname(String name1){
        this.name=name;
    }
    public void settype(String type){
        this.type=type;
    }
    public void setdep(String dep){
        this.dep=dep;
    }
    public void setid(String id){
        this.id=id;
    }
    public void setnum1(String num1){
        this.num=num;
    }
    
    
    public abstract void DisplayUser();
    public abstract void displayUserList(); 
}
