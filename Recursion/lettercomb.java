import java.io.*;
import java.util.*;

public class lettercomb {
    public static void main(String[] args) {
        try {
            // Read input from input.txt
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String digits = br.readLine().trim();
            br.close();

            Solution solution = new Solution();
            List<String> result = solution.letterCombinations(digits);

            // Write output to output.txt
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            bw.write(result.toString());
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return new ArrayList<String>();
        String[] arr = new String[10];
        arr[0] = "";arr[1] = "";arr[2] = "abc";arr[3] = "def";        
        arr[4] = "ghi";arr[5] = "jkl";arr[6] = "mno";arr[7] = "pqrs";
        arr[9] = "wxyz";arr[8] = "tuv";        
        List<String> list = new ArrayList<>();
        recursion(list, digits.length(), new StringBuilder(""), arr,digits,0 );
        return list;
    }
    static void recursion(List<String> list, int len, StringBuilder curr, String arr[], String digits , int i){
        if(curr.length() == len){
            list.add(curr.toString());
            return;
        }
        for(char ch : arr[Character.getNumericValue(digits.charAt(i))].toCharArray()){
            curr.append(ch);
            recursion(list,len,curr,arr,digits,i+1);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}

//it worked in first attempt
//very happy that i solved medium recursion & backtracking problm
//my 200th problem on leetcode