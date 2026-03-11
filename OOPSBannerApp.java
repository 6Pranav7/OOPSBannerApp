package CoreProgrammingApps.OOPSBannerApp;

//UC1
public class OOPSBannerApp{
    public static void main(String[] args) {
        System.out.println("OOPS");
        
            //UC2
            System.out.println("  *** " + "   ***" + "   ***** "  +   "  ***** ");
            System.out.println(" **  ** " +"**   **" + " **  **"  +   "  ** ");
            System.out.println("**    **" +"**    **" + "**   **" +  " ** ");
            System.out.println("**     **" +"**   **" + "**  **"  +    " *****" );
            System.out.println("**     **" +"**   **" + "**"      +    "      **" );
            System.out.println(" **   ** " +"**  ** " + "** "     +   " ** **");
            System.out.println("   *** " +    "***" +  " ** "     + "  ***** ");

                //UC3
                System.out.println(String.join(" ", " ***** ", " ***** ", " ***** ", " ***** "));
                System.out.println(String.join(" ", "*     *", "*     *", "*     *", "*      "));
                System.out.println(String.join(" ", "*     *", "*     *", "*     *", "*      "));
                System.out.println(String.join(" ", "*     *", "*     *", " ***** ", " ***** "));
                System.out.println(String.join(" ", "*     *", "*     *", "*      ", "      *"));
                System.out.println(String.join(" ", "*     *", "*     *", "*      ", "      *"));
                System.out.println(String.join(" ", " ***** ", " ***** ", "*      ", " ***** "));



    }
}
