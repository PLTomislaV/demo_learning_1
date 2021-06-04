package pl.tomislav.demo_learning_1.norris_chuck;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/norris")
public class NorrisController {

    private final NorrisService norrisService;

    @Autowired
    public NorrisController(NorrisService norrisService) {
        this.norrisService = norrisService;
    }

    @GetMapping
    public ChuckNorrisQuotes joke(){
        return norrisService.joke();
    }
}
