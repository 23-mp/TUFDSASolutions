class Solution {
    public void pattern3(int n) {
        for(int i=n; i>0; i--)
        {   int k=1;
            for(int j=i; j<=n; j++)
            {
                System.out.print(k++);
            }
        System.out.println();
        }

    }
}