package Domain;
import java.util.Date;


public class Worker {
    private int id;
    private String name;
    private int hourly_wage;
    private int monthly_wage;
    private Date date_of_birth;
    private Worker direct_manager;
    private Role[] roles;
    private Branch work_branch;
    private int days_off;
    private String departement;

    public Worker(int id, String name, int monthly_wage, int hourly_wage, Date date_of_birth, Worker direct_manager, Branch work_branch, String departement) {
        this.id = id;
        this.name = name;
        this.monthly_wage = monthly_wage;
        this.hourly_wage = hourly_wage;
        this.date_of_birth = date_of_birth;
        this.direct_manager = direct_manager;
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
        return date_of_birth;
    }

    public Worker getDirect_manager() {
        return direct_manager;
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

    public void setDirect_manager(Worker direct_manager) {
        this.direct_manager = direct_manager;
    }

    public void setRoles(Role[] roles) {
        this.roles = roles;
    }

    public void setWork_branch(Branch work_branch) {
        this.work_branch = work_branch;
    }


}
