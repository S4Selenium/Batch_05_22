import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		System.out.println("Random r = "+r.nextInt());
		System.out.println("Random r="+r.nextDouble());
        String fullname = "fullname"+r.nextInt();
        String Firstname= "firstname"+r.nextInt();
        String lastname="lastname"+r.nextInt();
        String address="address"+r.nextInt();
        long Phoneno=(long)(Math.random()*1000000+333000000L);
        String email = "email"+r.nextInt()+"gmail.com";
        
        System.out.println("Fullname is    "+ fullname);
        System.out.println("Firstname is    "+ Firstname);
        System.out.println("lastname is    "+ lastname);
        System.out.println("address is   "+ address);
        System.out.println("Phoneno is   "+ Phoneno);
        System.out.println("email is   "+ email);
 
        
	}

}
