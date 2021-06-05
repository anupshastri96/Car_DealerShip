import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Customer {
	
	private String name;
	private String address;
	private double cashOnHand;
	
public void purchaseCar(Cars car, Employee e, boolean finance) {
	System.out.println("I want to buy "+ car.getCarName()+" of model "+car.getCarModel()+" from "+e.getName());
}
}
