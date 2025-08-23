class Solution {
    public int largestRectangleArea(int[] heights) {
        
        // first - naive - 0(n^2)- TLE
        // int maxarea=0;
        // int n = heights.length;
        // for(int i=0; i<n ; i++){

        //     int leftsmall=-1;
        //     int currheight= heights[i];
        //     for(int j =i-1; j>=0; j--){
        //         if(heights[j]< heights[i]){
        //             leftsmall =j;
        //             break;
        //         }
        //     }
        //       int rightsmall =n;

        //     for(int j =i+1 ; j<n; j++){
        //         if(heights[j]< heights[i]){
        //             rightsmall= j;
        //             break;
        //         }
        //     }

        //     int width= rightsmall-leftsmall -1;
        //     int area = width * currheight;
        //     maxarea= Math.max(maxarea, area);
        // }

        // return maxarea;

//*********************************************************************************************************************************************** */
        // BETTER SOLUTION 0(n) - 3 passes almost 
        //************  preprocessing********** - the prev smaller indeex, and next small index- in 2 separate arrays
        int n = heights.length;
        int [] leftsmall= new int[n];
        int [] rightsmall = new int[n];
        Deque<Integer> s= new ArrayDeque<>();


        for(int i =0; i<n; i++){
            while(! s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            //reached prev ele at top of stack where ele is smaller than i index  , so leftsmall[i]=s.peek();
            //or stack empty -  means no prev smaller ele, so leftsmall[i]=-1 ;

            leftsmall[i]= s.isEmpty()? -1: s.peek();
            // relevant stack top utilised, now we can push current ele index
            s.push(i);
        }

        s.clear();

        for(int i =n-1; i>=0; i--){
            while(! s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            rightsmall[i]= s.isEmpty()? n: s.peek();
            s.push(i);
        }

        int ans =0;

        for(int i =0; i<n ; i++){
            int height = heights[i]; // since we assume current is smallest height bar
            int width= rightsmall[i] -leftsmall[i]-1;
            int area = width* height;
            ans = Math.max(ans, area);
        }

return ans;

    }
}