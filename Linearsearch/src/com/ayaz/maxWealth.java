package come.ayaz;

public class maxWealth{
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,90}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int max[] = new int[m];
        for(int i = 0; i < m; i++) {
            int sum = 0;
            int n = accounts[i].length;
            for(int j = 0; j < n; j++) {
                sum += accounts[i][j];
            }
            max[i] = sum;
        }
        int maxWealth = max[0];
        for(int i = 1; i < m; i++) {
            if(max[i] > maxWealth) {
                maxWealth = max[i];
            }
        }
        return maxWealth;
    }
}