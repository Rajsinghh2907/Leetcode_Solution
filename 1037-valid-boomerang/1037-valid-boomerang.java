class Solution {
    public boolean isBoomerang(int[][] points) {
        

    //  A boomerang in the context of this problem is defined as a set of three points 
    //  that are not all on the same line. In other words, the three points must form
    // a triangle, meaning they must not be collinear.

    // we can use the concept of the area of a triangle formed by these points. If the
    // area is zero, the points are collinear. 

        // AREA = (1/2) |x1(y2 − y3) + x2(y3 − y1) + x3(y1 − y2)|


        int x1 = points[0][0];
        int y1 = points[0][1];
        int x2 = points[1][0];
        int y2 = points[1][1];
        int x3 = points[2][0];
        int y3 = points[2][1];

        int area = ( x1 * (y2 - y3) )  +  ( x2 * (y3 - y1) ) + ( x3 * (y1 - y2) );

        if(area == 0){
            return false;
        }

        return true;


    }
}