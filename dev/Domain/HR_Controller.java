package Domain;
import java.util.Date;
import Data.InMemoryWorkerRepository;

public class HR_Controller {

    private final InMemoryWorkerRepository workers_memory=new InMemoryWorkerRepository();

    public int Add_New_Worker(String details){
        //ID,name,hourly wage, monthly wage,start date,role,branch,dayoff=0,department
        String[] string_details = details.split(",");

        Date curr=new Date();
        int new_ID=Integer.parseInt(string_details[0]);
        if(workers_memory.getWorkerById(new_ID)==null){
            return -1;
        }
        String new_name=string_details[1];
        int new_hourly_wage=Integer.parseInt(string_details[2]);
        int new_monthly_wage=Integer.parseInt(string_details[3]);

        //check if the role is exist
        int role_ID=Integer.parseInt(string_details[4]);
        if(workers_memory.getRoleByID(role_ID)==null){
            return -1;
        }
        else{
            Role role=new Role(role_ID,workers_memory.getRoleByID(new_ID));
            Role[] roles=new Role[1];
            roles[1]=role;
        }
        //check if branch is exist
        int branch_ID=Integer.parseInt(string_details[5]);
        if(workers_memory.getBranchByID(branch_ID)==null){
            return -1;
        }
        else{
            String[] branch_details = workers_memory.getBranchByID(branch_ID).split(",");
            String branch_name=branch_details[0];
            String address=branch_details[1];
            Branch new_branch=new Branch(branch_ID,branch_name,address);
        }
        int dayoff=0;
        String department=string_details[6];




        Worker new_worker= new Worker(new_ID,new_name,new_hourly_wage,new_monthly_wage,curr,roles,new_branch,department);
    }
}
