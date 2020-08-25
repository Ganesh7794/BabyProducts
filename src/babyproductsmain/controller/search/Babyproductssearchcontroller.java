import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Babyproductssearchcontroller(){
	/** */
	private final babyproductssearchservice babyproductssearchservice
	
	@RequestMapping(value ="/getList", method=RequestMethod.GET)
	public babyProductEntity getList(){
		return new babyProductEntity();
	}
	
	@RequestMapping(value ="/getCount", method=RequestMethod.GET)
	public int getCount(){
		return 0;
	}
	
}