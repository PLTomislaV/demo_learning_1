package pl.tomislav.demo_learning_1.norris_chuck;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class NorrisService {
    public ChuckNorrisQuotes joke(){
        ChuckNorrisQuotes jokes = new ChuckNorrisQuotes();
        return jokes;
    }

}
