public class PrinterWCounter{
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("Please enter a number!");
        } else {
            if(args[0].equals("-h")){
                System.out.println("Use this utility like so:");
                System.out.println("\tjava PrinterWCounter <number>");
            } else {
                for(int i = 0; i <= Integer.parseInt(args[0]); i++){
                    System.out.println(i);
                }
            }
        }
    }
}
