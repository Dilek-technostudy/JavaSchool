import java.util.ArrayList;
import java.util.HashSet;

public class PracticeTask9 {
    // Given arrayList of chars
    // print true if they have repetitive letters
    // {'A','B','B'} => true
    // {'C','D'} => false
    public static void main(String[] args) {
        ArrayList<Character> alist=new ArrayList<>();

        alist.add('a');
        alist.add('b');
        alist.add('a');

//        int count=0;
//        boolean rep=false;
//        for(int i=0;i<alist.size();i++) {
//            for(int j=i+1;j<alist.size();j++) {
//
//                if(alist.get(i)==alist.get(j)&& i!=j){
//                    rep=true;
//
//                }
//            }
//
//        }if(rep) {
//
//            System.out.println("there are repetitive letters");
//        }else {
//            System.out.println("nothing");
//        }

        HashSet<Character> letterSet = new HashSet<>();
        for (Character letter : alist) {
            letterSet.add(letter);
        }

        System.out.println(alist);
        System.out.println(letterSet);
        if(alist.size() == letterSet.size()){
            System.out.println("we dont have repetition: " + false);
        }else {
            System.out.println("we have repetition: " + true);
        }



    }


}
