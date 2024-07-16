public class EncapsulationDemo {

    private int emp_id; // this is called data hiding 

    public void setEmpId(int emp_id1){ // Setter Method
        emp_id = emp_id1;
    }
    public int getEmpId(){ // Getter Method(return type would be integer type)
        return emp_id;
    }
}
class Employee{
    public static void main(String[] args) {
        EncapsulationDemo ed = new EncapsulationDemo(); // object of class is created to call getter and setter methods

        // ed.emp_id =101; // this is not accessible as the access modifier is private so getter and setter method is used.


        ed.setEmpId(101); // emp_id has been set to "101"
        System.out.println(ed.getEmpId()); // gettter method is used to view the data
    }
}
