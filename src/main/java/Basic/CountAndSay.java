package Basic;

/**
 * Created by yuehu on 10/4/17.
 */
public class CountAndSay {
    public String countAndSay(int n) {
        String result = "1";
        if (n == 0){
            return null;
        }

        if (n == 1){
            return "1";
        }

        int i = 1;

        while (i < n){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int j = 1; j < result.length(); j++){
                if(result.charAt(j) == result.charAt(j-1)){
                    count++;
                }else{
                    sb.append(count);
                    sb.append(result.charAt(j-1));
                    count = 1;

                }
            }

            sb.append(count);
            //System.out.println(sb);
            sb.append(result.charAt(result.length() - 1));
            //System.out.println(sb);
            result = sb.toString();
            i++;
        }
        return result;

    }

    public static void main(String args[]){
        CountAndSay a = new CountAndSay();
        System.out.println(a.countAndSay(8));
    }
}
