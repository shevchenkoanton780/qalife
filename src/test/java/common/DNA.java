package common;

public class DNA {
    public static void main (String[] args){
        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-
        //DNA strands
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGAA";
        String dna4 = "ATCAAAAA";
        String dna = dna3;


        //finding the length of the dna string
        System.out.println("DNA length: " + dna.length());

        //finding the start codon and stop codon of protein
        int startCodon = dna.indexOf("ATG");
        System.out.println("Start: " + startCodon);
        int endCodon = dna.indexOf("TGA");
        System.out.println("Stop: " + endCodon);

        //finding the protein
        if (startCodon != -1 && endCodon != -1 && (endCodon-startCodon) % 3 ==0 && (dna.length() % 3) == 0){
            String protein = dna.substring(startCodon, endCodon + 3);
            System.out.println("Protein found: " + protein);
        } else {
            System.out.println("No protein found");
        }
    }
}

