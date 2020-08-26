package babyproductsmain.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import babyproductsmain.dao.Babyproductsdao;
import babyproductsmain.entity.Babyproductsentity;

public class Babyproductsdaoimpl implements Babyproductsdao{

	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Babyproductsentity getAllProduct() {
		return null;
	}
	
	@Override
	public void createTable(){
		String sql = "create table babyproducts(id BIGINT NOT NULL AUTO_INCREMENT,"
				+ " quantity INT NOT NULL," + " product_name VARCHAR(200) NOT NULL," + " ordered_quantity INT NULL,"
				+ " product_price BIGINT NOT_NULL," + " discount BIGINT NULL," + " inputUsername VARCHAR(100) NULL," 
				+ " inputDatetime VARCHAR(100) NULL," + " inputDatetime VARCHAR(100) NULL," + " lastupdateDatetime VARCHAR(100) NULL"
				+ ")";
		jdbcTemplate.execute(sql);
	}
	
}