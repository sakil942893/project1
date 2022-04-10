package studentdetails;

import othersresources.ServiceMsges;

public class StudentDetailsMsg extends ServiceMsges{

    // Greetings message
    @Override
    public void wellcome_msg()
    {
        System.out.println("\nWelcome to our Student Services !!!");
    }

    // Ending message
    @Override
    public void stop_msg()
    {
        System.out.println("Terminating Student Services");
    }

    // Student Services
    @Override
    public void service_info()
    {
        System.out.println(
                "\nStudent Services: \n" +
                "# 1 Create\n" +
                "# 2 Read\n" +
                "# 3 Update\n" +
                "# 4 Delete\n" +
                "# 5 All Student Info\n" +
                "# 0 Terminate\n"
        );
    }
}