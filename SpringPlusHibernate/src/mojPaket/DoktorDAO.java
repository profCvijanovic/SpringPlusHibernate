package mojPaket;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DoktorDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void snimiDoktoraUbazu(Doktor doktor) {	
		sessionFactory.getCurrentSession().save(doktor);	
	}
	
	
	
	

}
