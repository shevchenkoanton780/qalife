package common.Languages;

public class English extends Language {
  English(){
      super("English", 55550000, "all around the world", "subject-verb-object");
  }
        @Override
        public String getInfo() {
            return this.name + " is spoken by " + this.numSpeakers + " people mainly in " + specificRegion() + ". The language follows the word order: " + this.wordOrder + ". Fact: " + this.name + " is an widespread language.";

        }
    }

