import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class testAgain {
	private HashMap<String, HashSet<String>> teacherSubject;
	private HashMap<String, HashSet<String>> subjectTeacher;
	private HashMap<String, HashSet<String>> pupilSubject;
	private HashMap<String, HashSet<String>> subjectPupil;

//	კონსტრუქტორს არაფერი არ გადაეცემა. აქ შეგიძლიათ ინიციალიზაცია გაუკეთოთ
//	თქვენთვის საჭირო ცვლადებს.
	public School() {
		teacherSubject = new HashMap<>();
		subjectTeacher = new HashMap<>();
		pupilSubject = new HashMap<>();
		subjectPupil = new HashMap<>();
	}

	private void printsForTesting() {
		System.out.println("-------");
		System.out.println("teacherSubject: " + teacherSubject);
		System.out.println("subjectTeacher: " + subjectTeacher);
		System.out.println("pupilSubject: " + pupilSubject);
		System.out.println("subjectPupil: " + subjectPupil);
	}

//	addTeacher მეთოდის საშუალებით შეგიძლიათ სკოლას დაამატოთ ახალი
//	მასწავლებელი. მეთოდს გადაეცემა მასწავლებლის სახელი. შეგიძლიათ ჩათვალოთ,
//	რომ მასწავლებლის სახელი უნიკალურია.
	public void addTeacher(String teacher) {
		teacherSubject.putIfAbsent(teacher, new HashSet<String>());

		// TIP: you can use System.out.println() to print your structures for testing
		printsForTesting();
	}

//	addSubject მეთოდის საშუალებით შეგიძლიათ მასწავლებელს დაუმატოთ საგანი.
//	მეთოდს გადაეცემა მასწავლებლის სახელი და საგნის სახელი. ჩათვალეთ, რომ საგნის
//	სახელი უნიკალურია. ერთი და იგივე მასწავლებელი შეიძლება რამდენიმე საგანს
//	კითხულობდეს, ასევე ერთსა და იმავე საგანს შეიძლება რამდენიმე მასწავლებელი
//	კითხულობდეს ერთდროულად.
//	თუკი teacher სახელის მქონე მასწავლებელი არ არის აქამდე დამატებული, მაშინ
//	მეთოდმა არაფერი არ უნდა გააკეთოს.
	public void addSubject(String teacher, String subject) {
		if (!teacherSubject.containsKey(teacher)) {
			return;
		}
		teacherSubject.get(teacher).add(subject);

		subjectTeacher.putIfAbsent(subject, new HashSet<String>());
		subjectTeacher.get(subject).add(teacher);

		// TIP: you can use System.out.println() to print your structures for testing
		printsForTesting();
	}

//	addPupil მეთოდის საშუალებით შეგიძლიათ საგანზე დაამატოთ მოსწავლე. ერთი და
//	იგივე მოსწავლე შეიძლება ერთ ან რამდენიმე საგანს სწავლობდეს.
	public void addPupil(String pupil, String subject) {
		if (!subjectTeacher.containsKey(subject)) {
			return;
		}

		subjectPupil.putIfAbsent(subject, new HashSet<String>());
		subjectPupil.get(subject).add(pupil);

		pupilSubject.putIfAbsent(pupil, new HashSet<String>());
		pupilSubject.get(pupil).add(subject);

		// TIP: you can use System.out.println() to print your structures for testing
		printsForTesting();
	}

//	getTeachers მეთოდს გადაეცემა მოსწავლის სახელი და მან უნდა დააბრუნოს ამ
//	მოსწავლის ყველა მასწავლებელზე იტერატორი. ანუ მხოლოდ იმ მასწავლებლების
//	სახელები, რომლებიც ასწავლიან იმ საგნებს, რომლებზეც მოსწავლეა
//	დამატებული(სწავლობს). თუკი pupil სახელის მოსწავლე არ გვყავს მაშინ მეთოდმა
//	უნდა დააბრუნოს null.
	public Iterator<String> getTeachers(String pupil) {
		if (!pupilSubject.containsKey(pupil)) {
			return null;
		}
		HashSet<String> teachers = new HashSet<>();
		for (String subject : pupilSubject.get(pupil)) {
			if (subjectTeacher.containsKey(subject)) {
				teachers.addAll(subjectTeacher.get(subject)); // TODO test on addAll(null);
			}
		}

		return teachers.iterator();
	}

//	getPupils მეთოდს გადაეცემა მასწავლებლის სახელი და მან უნდა დააბრუნოს ამ
//	მასწავლებლის ყველა სტუდენტზე იტერატორი. ანუ მხოლოდ იმ სტუდენტების
//	სახელები, რომლებიც მის რომელიმე საგანს სწავლობენ. თუკი teacher სახელის მქონე
//	ლექტორი არ გვყავს მაშინ მეთოდმა უნდა დააბრუნოს null.
	public Iterator<String> getPupils(String teacher) {
		if (!teacherSubject.containsKey(teacher)) {
			return null;
		}
		HashSet<String> pupils = new HashSet<>();
		for (String subject : teacherSubject.get(teacher)) {
			if (subjectPupil.containsKey(subject)) {
				pupils.addAll(subjectPupil.get(subject));
			}
		}
		return pupils.iterator();
	}

//	მეთოდმა უნდა წაშალოს მასწავლებლის შესახებ ყველა ინფორმაცია. ამ მეთოდის
//	გამოძახების, შემდეგ getTeachers მეთოდმა არ უნდა დააბრუნოს teacher სახელი არც
//	ერთი სტუდენტისთვის.
	public void removeTeacher(String teacher) {
		teacherSubject.remove(teacher);
		for(String subject: subjectTeacher.keySet()) {
			HashSet<String> teachers = subjectTeacher.get(subject);
			teachers.remove(teacher);
		}
		
		// TIP: you can use System.out.println() to print your structures for testing
		printsForTesting();
	}

}


//		555 244 676


/*
 * 244
 * 121
 * 74
 * 148
 */




