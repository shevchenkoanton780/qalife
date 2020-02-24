package common;
//. Write a Java program to print a face. Go to the editor
//Expected Output
//
// +"""""+
//[| o o |]
// |  ^  |
// | '-' |
// +-----+
public class printingFace {

    public static void main (String [] args){
        printingFace result = new printingFace();
        result.facePrint();
    }
    public void facePrint (){
        System.out.println (" +'''''+");
        System.out.println("[| o o |] ");
        System.out.println(" |  ^  | ");
        System.out.println( " | '-' | ");
        System.out.println(" +-----+");

    }
}
