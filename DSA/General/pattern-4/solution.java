class Solution {
    public void pattern4(int n) {
        int k=0;
        for(int i=n; i>0; i--)
        {   k++;
            for(int j=i; j<=n; j++)
            {
                System.out.print(k);
            }
            System.out.println();
        }

    }
}