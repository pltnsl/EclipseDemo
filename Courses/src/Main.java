
public class Main {

	public static void main(String[] args) {
		Courses course1 = new Courses (1, "C# + Angular","Engin Demiro�", "�cretsiz" );
		Courses course2 = new Courses (2,"Java + React","Engin Demiro�","�cretsiz");
		Courses course3 = new Courses (3,"Programlamaya G�ri� ��in Temel Kurs","Engin Demiro�","�cretsiz");
		
		Courses [] course = {course1,course2,course3};
		
		for(Courses courses : course) {
			System.out.println(courses.name);
		}
		System.out.println(course.length);
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Yaz�l�m Geli�tirme Kursu";
		
		CoursesManager coursesManager = new CoursesManager ();
		coursesManager.joinCourses(course3);
		coursesManager.deleteCourses(course2);
	}

}
