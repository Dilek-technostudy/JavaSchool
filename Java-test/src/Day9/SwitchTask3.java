package Day9;

public class SwitchTask3 {
    public static void main(String[] args) {

        char stream = 'C';
        int x = 2;

        switch (x) {
            case 1:
                System.out.println("SCIENCE, MATHS, PHYSICS");
                break;
            case 2:
                switch (stream) {
                    case 'A':
                        System.out.println("Welcome");
                        break;
                    case 'C':
                        System.out.println("TechnoStudy");
                        break;
                    case 'B':
                        System.out.println("Have a nice day");
                        break;
                }
                break;
            case 3:
                switch (stream) {
                    case 'C':
                        System.out.println("Welcome");
                        break;
                    case 'D':
                        System.out.println("In");
                        break;
                    case 'E':
                        System.out.println("GFG");
                        break;
                }
                break;
        }
    }
}




