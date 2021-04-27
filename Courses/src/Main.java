
public class Main {

	public static void main(String[] args) {
		Courses course1 = new Courses (1, "C# + Angular","Engin Demiroð", "Ücretsiz" );
		Courses course2 = new Courses (2,"Java + React","Engin Demiroð","Ücretsiz");
		Courses course3 = new Courses (3,"Programlamaya GÝriþ Ýçin Temel Kurs","Engin Demiroð","Ücretsiz");
		
		Courses [] course = {course1,course2,course3};
		
		for(Courses courses : course) {
			System.out.println(courses.name);
		}
		System.out.println(course.length);
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Yazýlým Geliþtirme Kursu";
		
		CoursesManager coursesManager = new CoursesManager ();
		coursesManager.joinCourses(course3);
		coursesManager.deleteCourses(course2);
	}

}
