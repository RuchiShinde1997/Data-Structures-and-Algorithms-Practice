package Searching;

public class FindFirstAndLast {
    int BSLeft(int ar[], int n, int k){
        int ans = -1, low=0, high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(ar[mid] == k){
                high = mid-1;
                ans = mid;
            }
            else if(ar[mid] > k){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    int BSRight(int ar[], int n, int k){
        int ans = -1, low=0, high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(ar[mid] == k){
                low = mid+1;
                ans = mid;
            }
            else if(ar[mid] > k){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int ar[] = new int[] {5,7,7,8,8,10};
        FindFirstAndLast sol = new FindFirstAndLast();
        int p1 = sol.BSLeft(ar, ar.length, 8);
        int p2 = sol.BSRight(ar, ar.length, 8);
        System.out.println(p1+" "+p2);
    }
}
