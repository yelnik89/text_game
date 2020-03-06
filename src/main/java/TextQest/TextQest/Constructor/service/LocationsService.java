package TextQest.TextQest.Constructor.service;


import TextQest.TextQest.Constructor.model.Locations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LocationsService {

    @Autowired
    private LocationsRepository locationsRepository;

    public void delete(Integer id) {
        locationsRepository.delete(this.getLocationById(id));
    }

    public Locations create(Locations location ){
        return locationsRepository.save(location);
    }

    public Locations update(Integer id, Locations newLocation) {
        Locations originalLocation = getLocationById(id);
        if(!originalLocation.getId().equals(id)) {
            throw new IllegalStateException("Mismatch of locations id's");
        }
        newLocation.setId(originalLocation.getId());
        return locationsRepository.save(newLocation);
    }

    public Locations getLocationById(Integer id) {
        String stringId = id.toString();
        return locationsRepository.findById(stringId).orElseThrow(ResourceNotFoundException::new);
    }
}
