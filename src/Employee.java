import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Employee {

	private int employeeNo;
	private String name;
	private String carSection;
	
	public void handelCustomer(Customer customer, boolean finance, Cars car) {
		
	}
}
