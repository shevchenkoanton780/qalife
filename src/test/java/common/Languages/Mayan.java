package common.Languages;

public class Mayan extends Language {
    Mayan(String langName, int speakers){
        super(langName, speakers, "Central America", "verb-object-subject");
    }
    @Override
    public String getInfo() {
        return this.name + " is spoken by " + getNumSpeakers() + " people mainly in " + this.regionsSpoken + ". The language follows the word order: " + this.wordOrder + ". Fun fact: " + this.name + " is an ergative language.";

    }

}
