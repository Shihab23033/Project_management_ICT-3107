
public class Departments {
    private String name = "Department Name";
    private int id = 0;
    private String building = "Building Name";
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setBuilding(String building){
        this.building = building;
    }

    public String getBuilding(){
        return building;
    }

    public Departments(String name, int id, String building){
        this.name = name;
        this.id = id;
        this.building = building;
    }
    public Departments(){ 
    }

     public void displayInfo(){
        System.out.println("Department Name: " + name);
        System.out.println("Department ID: " + id);
        System.out.println("Building: " + building);
     }
}

