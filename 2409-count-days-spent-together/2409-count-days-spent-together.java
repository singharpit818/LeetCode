class Solution {
        static int count(String s){
        int[] days = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String arr[] = s.split("-");
        int sum=0;
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        for(int i = 0 ; i<a ; i++){
            sum+=days[i];
        }
        return sum+b;

    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int a1=count(arriveAlice);
        int a2=count(leaveAlice);
        int b1=count(arriveBob);
        int b2=count(leaveBob);
        // if(a2>=b1 && a2<=b2 && b1>=a1)return a2-b1+1;
        // if(a2<b1 || b2<a1)return 0;
        // if(b1<=a1 && b2>=a2)return a2-a1+1;
        // if(b1>=a1 && a2>=b2 )return b2-b1+1;
        // if(a1>=b1 && a2>=b2 && b2>=a1) return b2-a1+1;
        // return 1;
        int start = Math.max(a1, b1);
        int end = Math.min(a2, b2);

        if (start > end) return 0;

        return end - start + 1;
        
    }
}