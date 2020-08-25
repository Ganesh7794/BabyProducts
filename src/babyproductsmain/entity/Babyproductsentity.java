package babyproductsmain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Babyproductsentity {
	private long id;
	private int quantity;
	private String productName;
	private int orderedQuantity;
	private long productPrice;
	private long discount;
	private String inputUsername;
	private String inputDatetime;
	private String lastupdateUsername;
	private String lastupdateDatetime;
}