package mainclass;
import static java.lang.System.out;
import java.util.*;
import Exception.NoDataFoundException;
import service.OrderDetailService;

public class RawMain {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	control:while(true)
	{
		out.println("Enter \n 1: To place an order");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			OrderDetailService obj = new OrderDetailService();
			out.println("Placing the order details");
			out.println("-------------------------");
			out.println("Available ids are \n"+obj.getID());
			out.println("Enter the id from the given list");
			
			int id=sc.nextInt();
            try {
			out.println(obj.getOrderDetails(id));
            }
            catch(NoDataFoundException e) {
            	e.printStackTrace();
            }
            break;
		case 2:
			break;
			default : out.println("You entered the wrong choice");
		}
	}
}
}
