package Domain;
import java.util.Date;


public class Worker {
    private int id;
    private String name;
    private int hourly_wage;
    private int monthly_wage;
    private Date start_date;
    private int direct_manager_ID;
    private Role[] roles;
    private Branch work_branch;
    private int days_off;
    private String departement;

    public Worker(int id, String name, int monthly_wage, int hourly_wage, Date start_date, int direct_manager_ID,Role[] roles, Branch work_branch, String departement) {
        this.id = id;
        this.name = name;
        this.monthly_wage = monthly_wage;
        this.hourly_wage = hourly_wage;
        this.start_date = start_date;
        this.direct_manager_ID = direct_manager_ID;
        this.work_branch = work_branch;
        this.departement = departement;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHourly_wage() {
        return hourly_wage;
    }

    public int getMonthly_wage() {
        return monthly_wage;
    }

    public Date getDate_of_birth() {
        return start_date;
    }

    public int getDirect_manager() {
        return direct_manager_ID;
    }

    public Role[] getRoles() {
        return roles;
    }

    public Branch getWork_branch() {
        return work_branch;
    }

    public int getDays_off() {
        return days_off;
    }

    public String getDepartement() {
        return departement;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHourly_wage(int hourly_wage) {
        this.hourly_wage = hourly_wage;
    }

    public void setMonthly_wage(int monthly_wage) {
        this.monthly_wage = monthly_wage;
    }

    public void setDirect_manager(int direct_manager_ID) {
        this.direct_manager_ID = direct_manager_ID;
    }

    public void setRoles(Role[] roles) {
        this.roles = roles;
    }

    public void setWork_branch(Branch work_branch) {
        this.work_branch = work_branch;
    }


}
