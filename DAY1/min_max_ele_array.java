//https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1#
class Compute 
{
    static pair getMinMax(long a[],int n){
    long max,min;
        if (n == 1) {
            max = a[0];
            min = a[0];
            return new pair(min,max);
        }
        if (a[0] > a[1]) {
            max = a[0];
            min = a[1];
        } else {
            max = a[1];
            min = a[0];
        }
 
        for (int i = 2; i < n; i++) {
            if (a[i] > max) {
             max = a[i];
            }else if (a[i] < min) {
                min = a[i];
            }
        }
 
        return new pair(min,max);
    }
}
