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

        initial = intervals[0];
        for(int i = 1;i<intervals.length;i++){

            if(intervals[i][0]<=initial[1] && intervals[i][1]<=initial[1]){
                continue;
            }

            if(intervals[i][0]<=initial[1] && intervals[i][1]>=initial[1]){
                initial[1] = intervals[i][1];
            }

            else{
                outer.add(initial);
                initial = new int[2];
                initial = intervals[i];
            }

        }

        outer.add(initial);
        int[][] finalList = new int[outer.size()][2];
        for(int i = 0;i<outer.size();i++){
            finalList[i] = outer.get(i);
        }

        return finalList;
    }




}