public class Solution {
    public ArrayList<Integer> nextGreater(ArrayList<Integer> A) {
        ArrayList<Integer> newArray = new ArrayList();
        int next;
        int i;
        int n = A.size();

        int j;
        for (i=0; i<n; i++)
        {
            next = -1;
            for (j = i+1; j<n; j++)
            {
                if (A.get(i) < A.get(j))
                {
                    next = A.get(j);
                    break;
                }
            }
            newArray.add(A.get(i));
            //System.out.println(arr[i]+" -- "+next);
        }
        return newArray;
    }
}
