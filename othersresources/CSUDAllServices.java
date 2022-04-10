package othersresources;
import java.util.ArrayList;

import studentdetails.StudentInformation;


public class CSUDAllServices {

    // create | post
    public static void create(StudentInformation stdnt, ArrayList<StudentInformation> datab)
    {
        for (StudentInformation student: datab)
        {
            if (student.getId() == stdnt.getId())
            {
                System.out.println("Id already exist");
                return;
            }
        }
        datab.add(stdnt);
        System.out.println("Successfully added.");
    }

    // read | get
    public static void filterById(int id, ArrayList<StudentInformation> datab)
    {
        for (StudentInformation stdnt: datab)
        {
            if (stdnt.getId() == id)
            {
                System.out.println("Student Information:");
                System.out.println("Id              : " + stdnt.getId());
                System.out.println("Name            : " + stdnt.getName());
                System.out.println("Age             : " + stdnt.getAge());
                System.out.println("Department      : " + stdnt.getDepartment());
                System.out.println("Admission Year  : " + stdnt.getAdmissionYear());
                System.out.println("Contect         : " + stdnt.getContact());
                System.out.println("Address         : " + stdnt.getAddress());
                return;
            }
        }
        System.out.println("Student Information Not Found in Database.");
    }

    // update
    public static void update(StudentInformation stdnt, ArrayList<StudentInformation> datab)
    {
        int update_index = 0;
        for (StudentInformation student: datab)
        {
            if (student.getId() == stdnt.getId())
            {
            	System.out.println("Student Information:");
            	System.out.println("Id              : " + stdnt.getId());
                System.out.println("Name            : " + stdnt.getName());
                System.out.println("Age             : " + stdnt.getAge());
                System.out.println("Department      : " + stdnt.getDepartment());
                System.out.println("Admission Year  : " + stdnt.getAdmissionYear());
                System.out.println("Contect         : " + stdnt.getContact());
                System.out.println("Address         : " + stdnt.getAddress());
                datab.remove(update_index);
                datab.add(stdnt);
                return;
            }
            update_index ++;
        }
        System.out.println("Information Not Found in Database");
    }

    // delete
    public static void delete(int id, ArrayList<StudentInformation> datab)
    {
        int item_index = 0;
        for (StudentInformation stdnt: datab)
        {
            if (stdnt.getId() == id) {
                datab.remove(item_index);
                return;
            }
            item_index ++;
        }
        System.out.println("Item Not Found in Database");
    }
    
 // All Data Read
    public static void studentAllDataRead(ArrayList<StudentInformation> datab){
    	
        for (StudentInformation student: datab)
        {
        	System.out.println("Student Information:");
        	System.out.println("Id              : " + student.getId());
            System.out.println("Name            : " + student.getName());
            System.out.println("Age             : " + student.getAge());
            System.out.println("Department      : " + student.getDepartment());
            System.out.println("Admission Year  : " + student.getAdmissionYear());
            System.out.println("Contect         : " + student.getContact());
            System.out.println("Address         : " + student.getAddress());
        }
        System.out.println("Information Not Found in Database");
    }
}