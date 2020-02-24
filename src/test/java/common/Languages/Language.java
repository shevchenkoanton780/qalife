package common.Languages;


public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
    //constructor
    Language(String langName, int speakers, String regions, String wdOrder){
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = wdOrder;
    }
    // test method
    public String getInfo() {
        return
            this.name + " is spoken by " + this.numSpeakers  + " people mainly in " + this.regionsSpoken + ". The language follows the word order: " + this.wordOrder + ".";

    }
   // setting a specific region
    public String specificRegion(){
        this.regionsSpoken = "Canada";
        return this.regionsSpoken;
    }

    //method to change the number of speakers

    public int getNumSpeakers() {
        this.numSpeakers = 22;
        return this.numSpeakers;
    }

    //modifying word order
    public String wordOrder(){
        this.wordOrder = "Subject-object-verb";
        return this.wordOrder;
    }

    //main method
    public static void main (String [] args){
        Language spanish = new  Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
        spanish.getInfo();
        Mayan yucatec = new Mayan("Yucatec", 2330000);
        yucatec.getInfo();
        SinoTibetian chinese = new SinoTibetian("Mandarin Chinese", 2530000);
        chinese.getInfo();
        SinoTibetian nonChinese = new SinoTibetian("Burmese", 230000);
        nonChinese.getInfo();

        //Adding ArrayLists
        Language mayan = new Mayan("Yucatec", 2330000);
        Language english = new English();
        Language sinoTibetianMandarin = new SinoTibetian("Mandarin Chinese", 2530000);
        Language sinoTibetianBurmese = new SinoTibetian("Burmese", 230000);
        Language japanese = new Japanese();

        Language[] allTheLanguages = {mayan, english, sinoTibetianMandarin, sinoTibetianBurmese, japanese};
        for (Language language : allTheLanguages){

            System.out.println(language.getInfo());
        }
    }
}
