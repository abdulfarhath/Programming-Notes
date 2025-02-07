import java.util.*;

public class subsets {
    
    static void printSubSets(String s,int idx ,StringBuilder current ){
        if(idx >= s.length()){
            System.out.println(current);
            return;
        }
        printSubSets(s, idx+1, current);
        printSubSets(s, idx+1, current.append(s.charAt(idx)));
        current.deleteCharAt(current.length()-1);
    }

    static List<String> generateSubSetList(String s, int idx, StringBuilder curr, List<String> res){
        if(idx >=s.length()){
            res.add(curr.toString());
            return res;
        }
        generateSubSetList(s, idx+1 , curr.append(s.charAt(idx)), res);
        curr.deleteCharAt(curr.length()-1);
        generateSubSetList(s, idx+1, curr, res);
        return res;
    }

    public static void main(String[] args) {
        String s = "abd";
        printSubSets(s,0,new StringBuilder(""));
        // List<String> res = new ArrayList<String>();
        // res = generateSubSetList(s,0,new StringBuilder(""),res);
        // Collections.sort(res);
        // System.out.println(res);
    }

}
