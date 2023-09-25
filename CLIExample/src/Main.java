public class Main {

    public static void main(String[] args) {

        if(args.length==0) {
            System.out.println("No args!");
        }
        else if(args[0].equals("-p")){
            System.out.println("you need to print the band information");
        }
        else {
            if (args.length != 2) {
                System.out.println("print usage:");
            } else {
                if (args[0].equals("-n")) {
                    System.out.println("search for the band member " + args[1]);
                }

            }
        }
    }
}