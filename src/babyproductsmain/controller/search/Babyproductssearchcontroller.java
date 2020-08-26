package babyproductsmain.controller.search;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import babyproductsmain.entity.Babyproductsentity;
import babyproductsmain.service.Babyproductssearchservice;

@RestController
@RequestMapping("sample/babyproducts/")
public class Babyproductssearchcontroller {
	
	/** The babyproductssearchservice*/
	private Babyproductssearchservice babyproductssearchservice;
	
	@RequestMapping(value ="/getList", method=RequestMethod.GET)
	public Babyproductsentity getList(@RequestParam(name = "query", required = false) String searchQuery){
		babyproductssearchservice.getAllProduct();
		return new Babyproductsentity();
	}
	
	@RequestMapping(value ="/getCount", method=RequestMethod.GET)
	public int getCount(){
		return 0;
	}
	
}