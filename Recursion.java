package codingTest;

public class Recursion {

     // 재귀함수 이해하기 : 농구공 16m 에서 던졌을 때 한번 튕길 때 마다 높이 1/2씩 감소할 때 공의 이동거리 구하기
    public static int recur(int h, int prev){
        //재귀탈출조건
        if(1>h){
            return prev;
        }

        int an = (prev == 0) ? h : h*2;
        int sum = prev + an;
        return recur(h/2, sum);
    }

    // 피보나치 수열 : 재귀로 풀기
    // a1       a2       a3       a4        a5        a6 
    //    a0+a1    a1+a2    a2+a3    a3+a4     a4+a5 
    public static int pivona(int n, int twoprev, int oneprev){
        if(5<n){
            return oneprev;
        }
        int val = (1==n || 2==n) ? 1 : twoprev + oneprev;

        return pivona(n+1, oneprev, val);
    }

    // 피보나치 수열 : 재귀 + 분할 정복 알고리즘
    public static int pivona2(int n){
        if(1 == n || 2 == n){
            return 1;
        }
        return pivona2(n-2) + pivona2(n-1);
    }

    // 재귀 + 분할 정복 알고리즘
    public static int sum(int[] arr, int startIndex, int endIndex){
        if(startIndex == endIndex){
            System.out.println(startIndex);
            return arr[startIndex];
        }
        System.out.println("startIndex : "+ startIndex);
        System.out.println("endIndex : "+ endIndex);
        int middleIndex = (startIndex + endIndex) / 2;
        System.out.println("middleIndex : "+middleIndex);

        return sum(arr, startIndex, middleIndex) + sum(arr, middleIndex+1, endIndex);
    }

    // 퀴즈 
    public static int max(int[] arr, int startIndex, int endIndex){
        if(startIndex == endIndex){
            return arr[startIndex];
        }

        int middleIndex = (startIndex + endIndex) / 2;
        int leftVal = max(arr, startIndex, middleIndex);
        int rightVal = max(arr, middleIndex+1, endIndex);
        return Math.max(leftVal, rightVal);  
    }


    public static void main(String[] args){
        // 초기 높이 : 16
        // System.out.println(recur(16,0));
        // // 피보나치 수열 : 재귀로 풀기
        // System.out.println(pivona(1,1,1));
        // // 피보나치 수열 : 재귀 + 분할-정복 알고리즘
        // System.out.println(pivona2(5));
        // 재귀+분할-정복
        int[] arr = {6,4,3,5,2,1};
        System.out.printf("합계 : %d", sum(arr, 0, arr.length-1));

        // 퀴즈 
        // 재귀 호출을 이용하여 다음의 배열 중 가장 큰 값만 뽑아내고
        // 배열의 값을 바꿔 가장 큰 값만 뽑아낼 수 있는지 검산
        // // 메소드명 : max
        // int[] arr2 = {2,1,6,7,5,8,3,4};
        // System.out.printf("최대값 : %d", max(arr2, 0, arr.length-1));
        // 분할정복 알고리즘으로 오름차순

    }

}
