package ch13_generic.sec06_wildcard;

import java.util.Arrays;

public class Main {
	
	public static void registerCourse(Course<?> course) {
		// course<?> 와일드카드타입 = 제한없음 (person, worker,student , highstudent 모두 수강가능)
		System.out.println(course.getName() + "수강생 : " + 
			 Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		// <? extends Student> : student를 상속받은 어떤 객체 (student 또는 highstudent가 올수있음)
		System.out.println(course.getName() + "수강생 : " + 
			 Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		//<? super Worker> : worker와 worker의 상위 클래스 (worker , person 가 올수있음)
		System.out.println(course.getName() + "수강생 : " + 
			 Arrays.toString(course.getStudents()));
	}
	
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("일반인 과정 ", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		
		Course<Worker> workerCourse = new Course<>("직장인 과정", 5);
	//	workerCourse.add(new Person("일반인"));
		workerCourse.add(new Worker("직장인"));
	//	workerCourse.add(new Student("학생"));
	//	workerCourse.add(new HighStudent("고등학생"));

		// alt + shirt + r 로 이름 동시변경가능 
		
		Course<Student> studentCourse = new Course<>("학생 과정", 5);
//		studentCourse.add(new Person("일반인"));
//		studentCourse.add(new Worker("직장인"));
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highStudentCourse = new Course<>("고등학생 과정", 5);
//		personCourse.add(new Person("일반인"));
//		personCourse.add(new Worker("직장인"));
//		highStudentCourse.add(new Student("학생"));
		highStudentCourse.add(new HighStudent("고등학생"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
	//	registerCourseStudent(personCourse); 
	// 	registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
//		registerCourseWorker(studentCourse);
//		registerCourseWorker(highStudentCourse);
		System.out.println();

	}

}
