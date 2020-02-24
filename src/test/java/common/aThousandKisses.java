package common;

import static web.driver.factory.DriverFactory.ANSI_GREEN_BACKGROUND;
import static web.driver.factory.DriverFactory.ANSI_RESET;

public class aThousandKisses {



        public static void main(String[] args) {

            // initialize cupsOfCoffee
            int kisses = 1;
            // add while loop with counter
            while (kisses <= 1000){
                System.out.println(ANSI_GREEN_BACKGROUND + "Papa kisses Sofia & David " + kisses + " time!"+ ANSI_RESET);
                kisses ++;
            }
        }
    }