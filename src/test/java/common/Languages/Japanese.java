package common.Languages;


public class Japanese extends Language {
    Japanese(){
        super("Japanese", 300, "Japan", "subject-object-verb");
    }
    @Override
public String getInfo() {
    return
            this.name + " is spoken by " + this.numSpeakers  + " people mainly in " + this.regionsSpoken + ". The language follows the word order: " + wordOrder() + ".";

    }
}
