package classes;

/**
 * Created by JPMPC-B212 on 11/10/2016.
 */
public class Employee extends Person{

    public String Department;
    public int SSSID;
    public int PagibigID;

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getSSSID() {
        return SSSID;
    }

    public void setSSSID(int SSSID) {
        this.SSSID = SSSID;
    }

    public int getPagibigID() {
        return PagibigID;
    }

    public void setPagibigID(int pagibigID) {
        PagibigID = pagibigID;
    }
}
