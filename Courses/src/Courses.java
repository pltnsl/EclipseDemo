
public class Courses {
	
	public Courses () {
		System.out.println("Yazýlým Geliþtirme Kursuna Hoþ Geldin");
	}
	
	public Courses(int id, String name,String teachername ,String unitPrice) {
		this ();
		this.id = id;
		this.name = name;
		this.teachername = teachername;
		this.unitPrice = unitPrice;
		
		
	}
	int id;
	String name;
	String teachername;
	String unitPrice;
		
		
	
      
}
