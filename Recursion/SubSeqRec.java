import java.util.ArrayList;

public class SubSeqRec {
    public static void main(String[] args) {
        System.out.println(subseq("","abdul"));
    }

    static ArrayList<String> subseq(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> al = new ArrayList<>();
            al.add(p);
            return al;
        }
        ArrayList<String> left =  subseq(p+up.charAt(0), up.substring(1));
        left.addAll(subseq(p, up.substring(1)));
        return left;
    }
    
}
