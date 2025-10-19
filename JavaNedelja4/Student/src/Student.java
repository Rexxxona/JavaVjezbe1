import java.util.ArrayList;

public class Student {
	public String name;
	public String prezime;
	public String brojIndeksa;
	public String adresa;
	public float brojBodova;
	public Boolean polozioIliNe;
	public static int prolazNaIspitu;
	
	
	public Student(String name, String prezime, String brojIndeksa, String adresa, float brojBodova,
			Boolean polozioIliNe) {
		super();
		this.name = name;
		this.prezime = prezime;
		this.brojIndeksa = brojIndeksa;
		this.adresa = adresa;
		this.brojBodova = brojBodova;
		this.azurirajProlaz();
	}


	public Student() {
		
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPrezime() {
		return prezime;
	}


	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}


	public String getBrojIndeksa() {
		return brojIndeksa;
	}


	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}


	public String getAdresa() {
		return adresa;
	}


	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}


	public float getBrojBodova() {
		return brojBodova;
	}


	public void setBrojBodova(float brojBodova) {
		this.brojBodova = brojBodova;
	}


	public Boolean getPolozioIliNe() {
		return polozioIliNe;
	}


	public void setPolozioIliNe(Boolean polozioIliNe) {
		this.polozioIliNe = polozioIliNe;
	}


	public static int getProlazNaIspitu() {
		return prolazNaIspitu;
	}


	public static void setProlazNaIspitu(int prolazNaIspitu) {
		Student.prolazNaIspitu = prolazNaIspitu;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", prezime=" + prezime + ", brojIndeksa=" + brojIndeksa + ", adresa=" + adresa
				+ ", brojBodova=" + brojBodova + ", polozioIliNe=" + polozioIliNe + "]";
	}
	
	
	public void azurirajProlaz() {
		this.polozioIliNe = this.brojBodova >= Student.prolazNaIspitu;
	}
	
	public static ArrayList<Student> izdvojUlica(ArrayList<Student> niz, String ulica) {
		ArrayList<Student> izdvojeno = new ArrayList<Student>();
		
		for(Student s : niz) {
			if(s.getAdresa().toLowerCase().contains("Ulica".toLowerCase())) {
				izdvojeno.add(s);
			}
		}
		
		return izdvojeno;
	}
	
	public static ArrayList<Student> izdvojProlaz(ArrayList<Student> niz, boolean poloziliNisuPolozili) {
		ArrayList<Student> izdvojeno = new ArrayList<Student>();
		
		for(Student s : niz) {
			
			if(s.getPolozioIliNe() == poloziliNisuPolozili) {
				izdvojeno.add(s);
			}
		
		}
		return izdvojeno;
	}
		
}