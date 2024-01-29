
//71. School კლასი(2018 წლის გამოცდის ამოცანა).
//თქვენი მიზანია დაწეროთ School კლასი, რომლის საშუალებითაც შევძლებთ
//უნივერსიტეტის მართვას. კლასს უნდა ჰქონდეს კონსტრუქტორი და 5 public მეთოდი.

import java.util.Iterator;
import java.util.*;

public class School {
	//
	// კონსტრუქტორს არაფერი არ გადაეცემა. აქ შეგიძლიათ ინიციალიზაცია გაუკეთოთ
	// თქვენთვის საჭირო ცვლადებს.

	private Map<String, ArrayList<String>> teacherSubjects;
	private Map<String, ArrayList<String>> pupilSubjects;
	private Map<String, ArrayList<String>> SubjectTeachers;
	private Map<String, ArrayList<String>> subjectPupils;

	public School() {
		teacherSubjects = new HashMap<String, ArrayList<String>>();
		SubjectTeachers = new HashMap<String, ArrayList<String>>();
		pupilSubjects = new HashMap<String, ArrayList<String>>();
		subjectPupils = new HashMap<String, ArrayList<String>>();
		;
	}

	// addTeacher მეთოდის საშუალებით შეგიძლიათ სკოლას დაამატოთ ახალი
	// მასწავლებელი. მეთოდს გადაეცემა მასწავლებლის სახელი. შეგიძლიათ ჩათვალოთ,
	// რომ მასწავლებლის სახელი უნიკალურია.
	public void addTeacher(String teacher) {
		// TIP: you can use System.out.println() to print your structures for
		// testing

//		if (!teacherSubjects.containsKey(teacher)) {
			teacherSubjects.putIfAbsent(teacher, new ArrayList<String>()); 
			
	//	}

	}

	// addSubject მეთოდის საშუალებით შეგიძლიათ მასწავლებელს დაუმატოთ საგანი.
	// მეთოდს გადაეცემა მასწავლებლის სახელი და საგნის სახელი. ჩათვალეთ, რომ
	// საგნის
	// სახელი უნიკალურია. ერთი და იგივე მასწავლებელი შეიძლება რამდენიმე საგანს
	// კითხულობდეს, ასევე ერთსა და იმავე საგანს შეიძლება რამდენიმე მასწავლებელი
	// კითხულობდეს ერთდროულად.
	// თუკი teacher სახელის მქონე მასწავლებელი არ არის აქამდე დამატებული, მაშინ
	// მეთოდმა არაფერი არ უნდა გააკეთოს.
	public void addSubject(String teacher, String subject) {
		// TIP: you can use System.out.println() to print your structures for
		// testing

		if (!teacherSubjects.containsKey(teacher)) {
			System.out.println("No such teacher: " + teacher);
			return;
		}
		/*if (teacherSubjects.get(teacher).contains(subject)) {
			System.out.println("This subject is already added.");
			return;
		}*/
		teacherSubjects.get(teacher).add(subject);
		SubjectTeachers.putIfAbsent(subject, new ArrayList<String>());
		SubjectTeachers.get(subject).add(teacher);
		System.out.println(teacherSubjects.toString());
		System.out.println(SubjectTeachers.toString());

	}

	// addPupil მეთოდის საშუალებით შეგიძლიათ საგანზე დაამატოთ მოსწავლე. ერთი და
	// იგივე მოსწავლე შეიძლება ერთ ან რამდენიმე საგანს სწავლობდეს.
	public void addPupil(String pupil, String subject) {
		// TIP: you can use System.out.println() to print your structures for
		// testing
		if (!SubjectTeachers.containsKey(subject)) {
			System.out.println("No such subject.");
			return;
		}
		if (!pupilSubjects.containsKey(pupil)) {
			pupilSubjects.put(pupil, new ArrayList<String>());
			pupilSubjects.get(pupil).add(subject);
		}

		if (!subjectPupils.containsKey(subject)) {
			subjectPupils.put(subject, new ArrayList<String>());
			subjectPupils.get(subject).add(pupil);
		}
		System.out.println(pupilSubjects.toString());
		System.out.println(subjectPupils.toString());

	}

	// getTeachers მეთოდს გადაეცემა მოსწავლის სახელი და მან უნდა დააბრუნოს ამ
	// მოსწავლის ყველა მასწავლებელზე იტერატორი. ანუ მხოლოდ იმ მასწავლებლების
	// სახელები, რომლებიც ასწავლიან იმ საგნებს, რომლებზეც მოსწავლეა
	// დამატებული(სწავლობს). თუკი pupil სახელის მოსწავლე არ გვყავს მაშინ მეთოდმა
	// უნდა დააბრუნოს null.
	public Iterator<String> getTeachers(String pupil) {

		if (!pupilSubjects.containsKey(pupil)) {
			return null;
		}
		ArrayList<String> teacherList = new ArrayList<String>();
		for (String subj : pupilSubjects.get(pupil)) {
			if (SubjectTeachers.containsKey(subj)) {
				teacherList.addAll(SubjectTeachers.get(subj));
			}
		}
		return teacherList.iterator();
	}

	// getPupils მეთოდს გადაეცემა მასწავლებლის სახელი და მან უნდა დააბრუნოს ამ
	// მასწავლებლის ყველა სტუდენტზე იტერატორი. ანუ მხოლოდ იმ სტუდენტების
	// სახელები, რომლებიც მის რომელიმე საგანს სწავლობენ. თუკი teacher სახელის
	// მქონე
	// ლექტორი არ გვყავს მაშინ მეთოდმა უნდა დააბრუნოს null.
	public Iterator<String> getPupils(String teacher) {
		if (!teacherSubjects.containsKey(teacher)) {
			return null;
		}
		ArrayList<String> pupilList = new ArrayList<String>();
		for (String subj : teacherSubjects.get(teacher)) {
			if (subjectPupils.containsKey(subj)) {
				pupilList.addAll(subjectPupils.get(subj));
			}
		}

		return pupilList.iterator();
	}

	// მეთოდმა უნდა წაშალოს მასწავლებლის შესახებ ყველა ინფორმაცია. ამ მეთოდის
	// გამოძახების, შემდეგ getTeachers მეთოდმა არ უნდა დააბრუნოს teacher სახელი
	// არც
	// ერთი სტუდენტისთვის.
	public void removeTeacher(String teacher) {
		// TIP: you can use System.out.println() to print your structures for
		// testing
		
		
		
	}
}