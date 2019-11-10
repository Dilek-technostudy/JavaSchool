package Day16;

public class MultiDimensional2 {
    public static void main(String[] args) {
        String[][] namesAndLastNames = {
                {"dilek", "nuran", "Arif ", "irfan "},
                {"yilmaz", "yildirim", "Sarsilmaz", "yorulmaz"},
        };

        System.out.println(namesAndLastNames[0][0] + " " + namesAndLastNames[1][1]);
        System.out.println(namesAndLastNames[0][1] + " " + namesAndLastNames[1][1]);


        System.out.println("columns at row 0: " + namesAndLastNames[0].length);
        for (int i = 0; i < 4; i++) {

            System.out.println(namesAndLastNames[0][i] + " " + namesAndLastNames[1][i]);
        }
    }
}