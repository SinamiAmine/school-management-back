package ma.inor.demo.services;

import ma.inor.demo.requests.MatiereRequest;
import ma.inor.demo.responses.MatiereResponse;

public interface MatiereService {

	MatiereResponse create(MatiereRequest matiereRequest);

}
