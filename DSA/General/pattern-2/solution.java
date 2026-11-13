class Solution {
    public void pattern2(int n) {
        for(int i=n; i>0; i--)
        {
            for(int j=i; j<=n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}