//////////////////////////////////////////////////////
//                                                  //
//   https://app.codility.com/programmers/lessons   //
//                                                  //
//////////////////////////////////////////////////////

package codilityTests.test1;

public class CodilityTest1 {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(Integer.valueOf(Integer.toString(500,2)));
        System.out.println(solution.solution(500));

    }



    static class Solution {
        public int solution(int N) {
            String binaryRepresentation = Integer.toString(N,2);
            char[] tablica = binaryRepresentation.toCharArray();

            int dlugosc = tablica.length;
            int licznikZer = -1;
            int maxLicnikZer = 0;

            for (int i = 0; i < dlugosc; i++){
                if (licznikZer == -1){
                    if (Character.getNumericValue(tablica[i]) == 1){
                        licznikZer = 0;
                    }
                } else {
                    if (Character.getNumericValue(tablica[i])==0){
                        licznikZer ++;
                    } else {
                        if (licznikZer>maxLicnikZer){
                            maxLicnikZer=licznikZer;
                            licznikZer = 0;
                        } else{
                            licznikZer = 0;
                        }
                    }
                }
            }
            return maxLicnikZer;
        }
    }
}
