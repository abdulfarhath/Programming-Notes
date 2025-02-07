public class Subsets {

    static void recursion(String s, String res, int idx){
        if(idx == s.length()){
            System.out.println(res);
            return;
        }
        recursion(s, res, idx+1);
        recursion(s, res+s.charAt(idx), idx+1);
    }

    public static void main(String[] args) {
        String s = "abc";
        recursion(s,"",0);
    }

}


