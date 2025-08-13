class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> outer = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->
{
            if(a[0]!=b[0]){
                return Integer.compare(a[0],b[0]);
            }
            return Integer.compare(a[1],b[1]);

     } );

        int[] initial = new int[2];
        int lastSecondValue = Integer.MIN_VALUE;


        for(int i = 0;i<intervals.length;i++){
            initial = intervals[i];
            if(initial[0]<=lastSecondValue){
                continue;
            }
            for(int j = i+1;j<intervals.length;j++){
                if(initial[1]>=intervals[j][0] && intervals[j][1]>=initial[1]){
                    initial[1] = intervals[j][1];
                }
            }

            outer.add(initial);
            lastSecondValue = initial[1]; 
            initial = new int[2];
        }

        int[][] finalList = new int[outer.size()][2];
        for(int i = 0;i<outer.size();i++){
            finalList[i] = outer.get(i);
        }

        return finalList;
    }




}