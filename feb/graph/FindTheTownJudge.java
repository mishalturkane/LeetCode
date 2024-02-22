package leetcode.feb.graph;

public class FindTheTownJudge {
    public static void main(String[] args) {
        int[][] arr ={{1,3},{2,3},{3,1}};
        System.out.println( findJudge(3,arr));

    }
    public static int findJudge(int n, int[][] trust) {
        int length=trust.length;
        int degree[] =new int[n+1];
        for (int i=0;i<length;i++){
            degree[trust[i][0]]--;
            degree[trust[i][1]]++;
        }
        for(int i=1;i<=n;i++){
            if(degree[i]==n){
                return i;
            }
        }
        return -1;
    }
}
