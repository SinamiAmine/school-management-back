package ma.inor.demo.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.inor.demo.entities.Matiere;
import ma.inor.demo.mappers.MatiereMapper;
import ma.inor.demo.repositories.MatiereRepository;
import ma.inor.demo.requests.MatiereRequest;
import ma.inor.demo.responses.MatiereResponse;
import ma.inor.demo.services.MatiereService;

@Service
public class MatiereServiceImpl implements MatiereService {
	
	@Autowired
	MatiereMapper matiereMapper;
	@Autowired
	MatiereRepository matiereRepository;

	@Override
	public MatiereResponse create(MatiereRequest matiereRequest) {
		Matiere matiere = matiereMapper.map(matiereRequest);
		MatiereResponse matiereResponse = matiereMapper.map(matiereRepository.save(matiere));
		
		return matiereResponse;
	}

}
