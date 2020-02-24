package common.Languages;

public class SinoTibetian extends Language {
    SinoTibetian(String langName, int speakers) {
        super(langName, speakers, "Asia", "subject-object-verb");

        //"subject-object-verb"
        if (langName.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }
    }
        @Override
        public String getInfo() {
return this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ". The language follows the word order: " + wordOrder();

            }
    }

