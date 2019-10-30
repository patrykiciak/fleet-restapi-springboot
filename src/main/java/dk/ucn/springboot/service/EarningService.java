package dk.ucn.springboot.service;

import dk.ucn.springboot.model.Earning;
import dk.ucn.springboot.repository.EarningRepository;
import dk.ucn.springboot.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EarningService {

    @Autowired
    private EarningRepository earningRepository;

    public EarningService() {}

    public EarningService(EarningRepository earningRepository) {
        this.earningRepository = earningRepository;
    }

    public Earning add(Earning earning) {
        return earningRepository.save(earning);
    }

    public Earning update(Earning earning) {
        return earningRepository.save(earning);
    }

    public void delete(long id) {
        earningRepository.deleteById(id);
    }

    public void delete(Earning earning) {
        earningRepository.delete(earning);
    }

    public Earning get(long id) {
        return earningRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException("Can't find an object of Earning with id " + id)
        );
    }

    public List<Earning> getAll() {
        return earningRepository.findAll();
    }
}
