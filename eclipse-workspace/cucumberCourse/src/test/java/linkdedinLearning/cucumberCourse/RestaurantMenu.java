package linkdedinLearning.cucumberCourse;

import java.util.ArrayList;

public class RestaurantMenu {

	ArrayList<RestaurantMenuItem> MenuItems= new ArrayList<RestaurantMenuItem>();
	public boolean addMenuItem (RestaurantMenuItem newMenuItem) throws IllegalArgumentException {
		return MenuItems.add(newMenuItem);
		
	}
	
	public boolean DoseItemExist(RestaurantMenuItem newMenuItem) {
		boolean Exists= false;
		if(MenuItems.contains(newMenuItem)) {
			Exists = true;
		}
		return Exists;
	}

}
