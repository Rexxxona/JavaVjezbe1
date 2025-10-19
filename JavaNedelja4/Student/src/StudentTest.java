import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class StudentTest {

	public static void main(String[] args) throws FileNotFoundException {
		
		Student.setProlazNaIspitu(50);
		
		Student s1 = new Student("Pavle", "Vesovic", "25/001", "Oktoih 1, 81000, Podgorica", 49);
		s1.toString();
		
		s1.setBrojBodova(23);
		System.out.println(s1.toString());
		
		ArrayList<Student> x = new ArrayList<Student>();
		/*x.add(new Student("Pavle", "Vesovic", "25/001", "Oktoih 1, 81000, Podgorica", 49, null));
		x.add(new Student("Marko", "Markovic", "25/002", "Bulevar 1, 81000, Podgorica", 51, null));
		x.add(new Student("Janko", "Jankovic", "25/003", "Njegoseva, 81000, Podgorica", 75, null));
		*/
		
		String ime, prezime, brojIndeksa, adresa;
		float brojBodova;
		
		Scanner u = new Scanner(new File("C:\\Users\\DARTHMAUL\\OneDrive\\Desktop\\temp\\Studenti.txt"));
		while(u.hasNext()) {
			System.out.println("Tu");
			ime = u.nextLine();
			prezime = u.nextLine();
			brojIndeksa = u.nextLine();
			adresa = u.nextLine();
			brojBodova = Float.parseFloat(u.nextLine());
			
			x.add(new Student(ime, prezime, brojIndeksa, adresa, brojBodova));
		}
		
		u.close();
		
		ArrayList<Student> izdvojeno = Student.izdvojUlica(x, "Oktoih");
		System.out.println("Studenti koji zive u ulici Oktoih su: ");
		for(Student s : izdvojeno) {
			if(s.getAdresa().toLowerCase().contains("oktoih"))
			System.out.println(s.toString());
		}
		
	}
}