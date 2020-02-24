package ui.apple;

public class StringParcer {

    public void findOOP(String str) {
        int start = 0;
        while (true) {
            int found = str.indexOf("Last", start);
            if (found != -1) {
                // Found one -- do whatever here
                System.out.println(found);
            }
            if (found == -1) break;
            start = found + 2;  // move start up for next iteration
        }
    }
        public static void main(String[] args){
        String s = "[Last, login:, Wed, Apr, , 3, 08:06:01, on, ttys001, Antons-MacBook-Pro:~, antonbear$, bash, bash-3.2$, /Users/antonbear/Desktop/, bash:, /Users/antonbear/Desktop/:, is, a, directory, bash-3.2$, cd, /Users/antonbear/Desktop/, bash-3.2$, mkdir, Anton777, bash-3.2$, cd, /Users/antonbear/Desktop/Anton777, bash-3.2$, mkdir, fruits, bash-3.2$, mkdir, vegetables, bash-3.2$, mkdir, grains, bash-3.2$, cd, /Users/antonbear/Desktop/Anton777/fruits, bash-3.2$, mkdir, apples, bash-3.2$, cd, /Users/antonbear/Desktop/Anton777/fruits/apples, bash-3.2$, pwd, /Users/antonbear/Desktop/Anton777/fruits/apples, bash-3.2$, mkdir, fuji, bash-3.2$, cd, /Users/antonbear/Desktop/Anton777/, bash-3.2$, ls, *, -r, ls:, -r:, No, such, file, or, directory, fruits:, apples, , grains:";
            StringParcer parse = new StringParcer();
           parse.findOOP(s);
            System.out.println(s.indexOf(673));
          //  if (i=1)


        }
}

