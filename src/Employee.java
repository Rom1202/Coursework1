public class Employee {
    public final Integer id;
    public String fullName;
    public Integer salary;
    public Integer departmentId;
    public   static  Integer idCounter=1;

    public Employee(String fullName, Integer salary, Integer departmentId) {
        this.id=idCounter++;
        this.fullName=fullName;
        this.salary=salary;
        this.departmentId=departmentId;
    }


    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public static Integer getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(Integer idCounter) {
        Employee.idCounter = idCounter;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", departmentId=" + departmentId +
                '}';
    }
}






