public class Classroom {

    public static void main(String[] args) {

        Wilder jeanClaude = new Wilder("Jean Claude", true);
        Wilder arnold = new Wilder("Arnold", true);
        Wilder donald = new Wilder("Donald", false);

        System.out.println(jeanClaude.whoAmI());
        System.out.println(arnold.whoAmI());
        System.out.println(donald.whoAmI());



    }

}
