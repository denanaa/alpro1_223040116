package pertemuan3;

public class LatihanBooleanOperator {
	
	public static void main (String [] args) {
		/*
		 * operator Boolean adalah operator logika yang digunakan 
		 * untuk syarat dalam pengulangan atau pengkondisian
		 * 1. == digunakan untuk tidak sama dengan nilai non String
		 * 2. != digunakan untuk tidak sama dengan nilai non String
		 * 3. < digunakan untuk nilai lebih kecil
		 * 4. <= digunakan untuk nilai lebih kecil sama dengan
		 * 5. > digunakan untuk nilai lebih besar
		 * 6. >= digunakan untuk nilai lebih besar sama dengan
		 * 
		 * 7. .equalsIgnoreCase digunakan untuk membandingkan String
		 */
		
		System.out.println(5==5);
		System.out.println(5!=5);
		
		System.out.println(5<5);
		System.out.println(5<=5);
		
		System.out.println(5>5);
		System.out.println(5>=5);
		
		String a = "abcd";
		System.out.println(a.equalsIgnoreCase("ABCD"));
		System.out.println(a.equals("ABCD"));
	}

}
