package oops.interfaces;

public class PersonInt implements StudentInter, YouTuber {

	public static void main(String[] args) {
		
		PersonInt obj = new PersonInt();
		
		
		obj.study();
		obj.makeVideo();
		
        YouTuber obj2 = obj;      //UPCASTING, BY DOING THIS NOW THE OBJ2 WILL ONLY HAVE THE FUNTIONS OF A YOUTUBER
        obj2.makeVideo();
        
	}
	
	public void makeVideo() {
		
		System.out.println("Person is making a youtube video");
		
	}

	
	public void study() {
		
		System.out.println("Person is studying");
		
		}

}
