package comxworkz.touristRunner;

import javax.naming.InvalidNameException;

import com.xworkz.touristPlace.TouristPlaceDAO;
import com.xworkz.touristPlace.TouristPlaceDaoImpl;
import com.xworkz.touristService.TouristService;
import com.xworkz.touristService.TouristServiceImpl;

public class TouristRunner {

	public static void main(String[] args) {
		TouristPlaceDAO dao=new TouristPlaceDaoImpl();
		
		TouristService touristService=new TouristServiceImpl(dao);
		try {
			touristService.nameValidation("somthing");
		} catch (InvalidNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
