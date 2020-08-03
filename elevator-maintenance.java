public class Solution{
    public static String[] solution(String[] l) {
        for (int i = 0; i < l.length; i++){
            for (int j = 0; j < l.length; j++){
                String a = l[i];
                String b = l[j];
                int compare = compareVersion(a, b);
                //If 1, which means a string is larger than b string, move backwards
                if (compare == 1){
                    l[i] = l[j];
                    l[j] = a;
                }
            }
        }
        return l;
    }
    
    public static int compareVersion(String a, String b){
        String[] sptA = a.split("\\.");
        String[] sptB = b.split("\\.");
        
        for (int i = 0; i < Math.max(sptA.length, sptB.length); i++){
            int verA = (i >= sptA.length)? -1:Integer.parseInt(sptA[i]);
            int verB = (i >= sptB.length)? -1:Integer.parseInt(sptB[i]);
            
            if (verA < verB) return 1;
            else if (verA > verB) return -1;
        }
        return 0;
    }
}
