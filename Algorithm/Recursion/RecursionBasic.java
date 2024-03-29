// 코딩테스트(알고리즘)

// 2022년 기준 출제 경향 : 완전탐색, DFS/BFS, 이진탐색, 다이나믹 프로그래밍, 그리디, 재귀함수, 순열, 그래프, 시뮬레이션
// 기본 : 스택/큐, 정렬, 트리 
// 공부 방법 : 
// 프로그래머스에서 검색 후 풀이 먼저 확인. 본인이 이해되는 답을 선택하여 디버깅하며 구조 파악
// 이 후 개념 같이 보기
// 본인 스타일의 알고리즘 3개 선정 

// 동적프로그래밍-시뮬레이션에 대해 알아볼 것임

// 코딩테스트에 나오는 수학개념(정수론)
// 정수론 : 소수, 약수, 배수 등의 관계 
// 피타고라스 정리, 에라토스테네스의 체, 거듭제곱, 최대공약수/최소공배수
// 소수체크, 소인수분해

// 재귀 : 어떤 것을 정의할 때 나를 참조한다. 
// 예) 양파 : 양파껍질을 까다보면 점점 작아진다.
// 자신을 계속 호출함으로 값이 작아진다.
// 농구공이 반복해서 튕길때마다 값이 작아진다.
// 재귀함수 : 계속 호출되는 함수!

// 재귀 관점 

// 1. 점화식 관점 : 
//  - 반복 순차 방식 : 
//    (재귀호출 방식이 아닌 하나의 반복문으로도 해결 가능)
//  - 분할 병합 방식 : 하나의 반복문으로 해결이 어려운 문제들
//  * 점화식으로 표현할 수 있는 것은 실행 흐름을 따라가는 것 보다 점화식 그 자체를 코드로 옮기는 데에 익숙해질 필요가 있다 

// 2. 분할관점
// - 배열 : 중앙값(앞 인덱스 + 마지막 인덱스) / 2
//   좌/우의 합계
//   좌측 : (앞 인덱스, 중앙값)
//   우측 : 중앙값 + 1, 마지막 인덱스

// 3. 백트래킹 관점
// - 퇴각검색, 재귀호출 시 스택프레임이 쌓이고 pop되는 스택의 특징을 이용하여 
// - 탐색 가능한 이전의 경우로 돌아가 다시 탐색하는 것. 
// - 조건을 만족하는 한 모든 경우의 수를 탐색

package Algorithm.Recursion;

/**
 * RecursionBasic
 */
public class RecursionBasic {
    public static int factorial(int n){
        // 탈출 조건
        if(n<1){
            return 1;
        }
        return n * factorial(n-1); 
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}