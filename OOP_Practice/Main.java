

public class Main {
    public static void main(String[] args) {
        String st ="a";
        if (st=="a"){
            System.out.println("yes");
        }
        Departments CS = new Departments();
        CS.setName("Computer Science");
        CS.setId(101);
        CS.setBuilding("Academic Building 3");
        CS.displayInfo();

        System.out.println();
        Departments IT = new Departments("Information Technology", 102, "Academic Building 1");
        IT.displayInfo();
        
       
    }
}