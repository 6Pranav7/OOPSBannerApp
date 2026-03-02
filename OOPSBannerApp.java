package CoreProgrammingApps.OOPSBannerApp;

public class OOPSBannerApp{
    public static void main(String[] args) {

        //UC1
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


                    //UC4 
                    String[] lines = new String[7];
                    lines[0] = String.join(" ", "  *****  ", "  *****  ", " ******  ", "  *****  ");
                    lines[1] = String.join(" ", " **   ** ", " **   ** ", " **   ** ", " **      ");
                    lines[2] = String.join(" ", " **   ** ", " **   ** ", " **   ** ", " **      ");
                    lines[3] = String.join(" ", " **   ** ", " **   ** ", " ******  ", "  *****  ");
                    lines[4] = String.join(" ", " **   ** ", " **   ** ", " **      ", "      ** ");
                    lines[5] = String.join(" ", " **   ** ", " **   ** ", " **      ", "      ** ");
                    lines[6] = String.join(" ", "  *****  ", "  *****  ", " **      ", "  *****  ");

                    for (String line : lines) {
                    System.out.println(line);


                        //UC5
                        String[] Banner = new String[7];
                        String.join(" ", "  *****  ", "  *****  ", " ******  ", "  *****  ");
                        String.join(" ", " **   ** ", " **   ** ", " **   ** ", " **      ");
                        String.join(" ", " **   ** ", " **   ** ", " **   ** ", " **      ");
                        String.join(" ", " **   ** ", " **   ** ", " ******  ", "  *****  ");
                        String.join(" ", " **   ** ", " **   ** ", " **      ", "      ** ");
                        String.join(" ", " **   ** ", " **   ** ", " **      ", "      ** ");
                        String.join(" ", "  *****  ", "  *****  ", " **      ", "  *****  ");

                        for (String line1 : Banner) {
                        System.out.println(line1);

                    }
                }
            }
        }
