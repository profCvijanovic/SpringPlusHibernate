package mojPaket;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Kontroler {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		ServisDoktor servis = context.getBean("servisDoktor",ServisDoktor.class);
		
		Doktor doktor = context.getBean("doktor",Doktor.class);
		
		
		servis.snimiDoktoraUbazu(doktor);
		
		
		context.close();
		
		

	}

}
