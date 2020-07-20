package mojPaket;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServisDoktor {
	
	@Autowired
	private DoktorDAO doktorDAO;

	@Transactional
	public void snimiDoktoraUbazu(Doktor doktor) {
		doktorDAO.snimiDoktoraUbazu(doktor);
	}
	
	
	
	
	
}
