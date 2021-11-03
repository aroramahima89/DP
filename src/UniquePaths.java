class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] a=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1 ||j==1){
                    a[i][j]=1;
                }
            }
        }
        for(int i=2;i<=m;i++){
            for(int j=2;j<=n;j++){
                a[i][j]=a[i][j-1]+a[i-1][j];
            }
        }
        return a[m][n];
    }
}