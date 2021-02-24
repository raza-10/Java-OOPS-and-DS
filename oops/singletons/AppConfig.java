package oops.singletons;

public class AppConfig {

	private AppConfig() {
		
	}
	
	private static AppConfig obj = null;      //IN MEMORY
	
	public static AppConfig getInstance() {   //HERE WE CAN DIRECTLY ACCESS THE OBJECT FROM THIS METHOD WITHOUT GOING IN MEMORY
		if(obj == null) {
	       obj = new AppConfig();
		}
		 
		return obj;
	}
}
