class Solution {
    public void pattern6(int n) {
        for(int i =0; i<n; i++)
        {   int k=1;
            for(int j=n; j>i; j--)
            {
                System.out.print(k++);
            }
            System.out.println();
        }
    }
}