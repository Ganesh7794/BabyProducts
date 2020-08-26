package babyproductsmain.service.impl;

import babyproductsmain.dao.Babyproductsdao;
import babyproductsmain.entity.Babyproductsentity;
import babyproductsmain.service.Babyproductssearchservice;

public class Babyproductssearchserviceimpl implements Babyproductssearchservice {

	private Babyproductsdao babyproductsdao;
	
	@Override
	public Babyproductsentity getAllProduct() {
		return babyproductsdao.getAllProduct();
	}
	
}