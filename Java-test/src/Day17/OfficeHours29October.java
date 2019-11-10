package Day17;

public class OfficeHours29October {
    public static void main(String[] args) {


//    Reverse thearray seattle new york     newyork seattle

//        String[] strarr1 = {"Seattle", "California", "Florida", "Texas", "Georgia"};
//
//        for (int i = strarr1.length - 1; i >= 0; i--) {
//            System.out.print(strarr1[i] + " ");
//
//        }
//        System.out.println();
//        System.out.println("--------------------");


//      reverse multi dimontional array

//        0 0 ,  0 1 ,0 2
//        1 0 ,  1 1 ,1 2

//        String[][] strarr2 = {{"USA", "Mexico"}, {"South Korea", "Russia", "China"}, {"India", "Pakistan"}};
//
//        for (int i = strarr2.length - 1; i >= 0; i--) {
//
//            for (int j = strarr2[i].length - 1; j >= 0; j--) {
//
//                System.out.print(strarr2[i][j] + " ");
//
//
//                System.out.println();



//            for(int i = 0 ; i<strarr3.length ; i++){
//
//                char[] strarr3Chars = strarr3[i].toCharArray();
//
//                for(int j = strarr3Chars.length-1 ; j>=0 ; j-- ){
//
//                    System.out.print(strarr3Chars[j]);
//
//                }
//
//                System.out.println();
//            }
//
//            {


                String[][] strarr2 = {{"USA" , "Mexico"} , {"South Korea" ,"Russia" , "China"} , {"India","Pakistan"}};

                for(int i = strarr2.length-1 ; i>=0 ; i--){

                    for(int j = strarr2[i].length-1 ;j>=0; j--){

                        char[] strarr3Chars = strarr2[i][j].toCharArray();

                        for(int k = strarr3Chars.length-1 ; k>=0 ; k-- ){

                            System.out.print(strarr3Chars[k] );

                        }

                        System.out.print(" ");

                    }

                    String[] numarr1 = {"$50" , "$40" , "$30"};

                    System.out.println(numarr1.length + " length is here ");

                    int total = 0;

                    for(int in = 0 ; i<numarr1.length; in++){

                        String num1 = numarr1[in];

                        num1 = num1.replace("$","");

                        System.out.println(num1 + " num1 is  here");

                        int mynum = Integer.valueOf(num1);

                        total +=  mynum;

                    }

                    System.out.println(total);

                }

                }
            }


//      reverse the each character in the array seattle elttaes new york kroy wen


//      Get the String array as $115  $23 , $75  remove the $ and sum the numbers
