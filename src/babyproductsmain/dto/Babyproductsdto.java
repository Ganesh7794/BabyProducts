package babyproductsmain.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Babyproductsdto {
	
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