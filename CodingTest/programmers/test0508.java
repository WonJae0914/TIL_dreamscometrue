package CodingTest.programmers;

import java.util.Arrays;

// 문제 설명
// 정수 배열 arr와 query가 주어집니다.

// query를 순회하면서 다음 작업을 반복합니다.

// 짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
// 홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
// 위 작업을 마친 후 남은 arr의 부분 배열을 return 하는 solution 함수를 완성해 주세요.


// 제한사항
// 5 ≤ arr의 길이 ≤ 100,000
// 0 ≤ arr의 원소 ≤ 100
// 1 ≤ query의 길이 < min(50, arr의 길이 / 2)
// query의 각 원소는 0보다 크거나 같고 남아있는 arr의 길이 보다 작습니다.


// 입출력 예

// 입출력 예 설명

// 입출력 예 #1

// 이번에 매번 처리할 query의 값과 처리 전후의 arr의 상태를 표로 나타내면 다음과 같습니다.

// ※2023년 04월 24일 지문과 테스트 케이스가 수정되었습니다. 기존에 제출한 코드가 통과하지 못할 수 있습니다.

public class test0508 {
    public int[] solution(int[] arr, int[] query) {

        for(int i=0; i<query.length; i++){
            if(i%2==0){ // 짝수일 때 
                arr = Arrays.copyOfRange(arr, 0, query[i]+1); 
            }
            else{ // 홀수일 때 
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
    return arr;
    }
}
