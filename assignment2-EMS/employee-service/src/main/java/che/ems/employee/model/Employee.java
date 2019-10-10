package che.ems.employee.model;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer emp_code;

    private String fName;
    private String lName;
    private String address;
    private String telNo;

    public Integer getEmp_code() {
        return emp_code;
    }

    public void setEmp_code(Integer emp_code) {
        this.emp_code = emp_code;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
}
