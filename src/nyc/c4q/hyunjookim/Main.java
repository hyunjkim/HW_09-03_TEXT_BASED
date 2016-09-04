package nyc.c4q.hyunjookim;



public class Main {

    public static void main(String[] args) {

        tools tools = new tools();

        System.out.println("THIS GAME IS M.A.S.H.");

        System.out.println("\n\nChoose one : BLUE, GREEN, OR RED");
        tools.readInput();
        tools.checkColor();
        //System.out.println(tools.jobIsNow);

        System.out.println("Choose a number : 1 , 2 , 3 ");
        tools.readInput();
        tools.checkNumber();
        //System.out.println(children);

        System.out.print("Name three people you secretly love.");
        System.out.println("\nPrint the first name : ");
        tools.readInput();
        tools.collectName();

        System.out.println("Print the second name : ");
        tools.readInput();
        tools.collectName();

        System.out.println("Print the third name : ");
        tools.readInput();
        tools.collectName();

        // System.out.println(tools.spouse);

        System.out.println("Choose a letter : A , B , C ");
        tools.readInput();
        tools.checkLetter();
        //System.out.println(tools.letter);

        System.out.print("\n\nYou will live in a ");
        tools.chooseHome();
        System.out.println("\nYou will become a" + tools.jobIsNow);
        System.out.println("\nYou will have" + tools.children);
        System.out.println("\nYou will own a" + tools.car );
        System.out.print("\nand be married to ");
        tools.chooseName();

    }
}
