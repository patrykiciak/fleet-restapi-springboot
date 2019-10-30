package dk.ucn.springboot.api;

import dk.ucn.springboot.model.Earning;
import dk.ucn.springboot.service.EarningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/earnings")
public class EarningApi {

    private EarningService earningService;

    @Autowired
    public EarningApi(EarningService earningService) {
        this.earningService = earningService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Earning add(@RequestBody Earning earning) {
        return earningService.add(earning);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Earning> getAll() {
        return earningService.getAll();
    }

    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Earning get(@PathVariable long id) {
        return earningService.get(id);
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {
        earningService.delete(id);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@RequestBody Earning earning) {
        earningService.delete(earning);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Earning updateOne(@RequestBody Earning earning) {
        return earningService.add(earning);
    }
}