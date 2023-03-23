package CodingTest;
// 재귀함수문제

// 문제 설명
// 사전에 알파벳 모음 'A', 'E', 'I', 'O', 'U'만을 사용하여 만들 수 있는, 길이 5 이하의 모든 단어가 수록되어 있습니다. 
// 사전에서 첫 번째 단어는 "A"이고, 그다음은 "AA"이며, 마지막 단어는 "UUUUU"입니다.

// 단어 하나 word가 매개변수로 주어질 때, 이 단어가 사전에서 몇 번째 단어인지 return 하도록 solution 함수를 완성해주세요.

// 제한사항
// word의 길이는 1 이상 5 이하입니다.
// word는 알파벳 대문자 'A', 'E', 'I', 'O', 'U'로만 이루어져 있습니다.
// 입출력 예
// word	result
// "AAAAE"	6
// "AAAE"	10
// "I"	1563
// "EIO"	1189
// 입출력 예 설명
// 입출력 예 #1

// 사전에서 첫 번째 단어는 "A"이고, 그다음은 "AA", "AAA", "AAAA", "AAAAA", "AAAAE", ... 와 같습니다. "AAAAE"는 사전에서 6번째 단어입니다.

// 입출력 예 #2

// "AAAE"는 "A", "AA", "AAA", "AAAA", "AAAAA", "AAAAE", "AAAAI", "AAAAO", "AAAAU"의 다음인 10번째 단어입니다.

// 입출력 예 #3

// "I"는 1563번째 단어입니다.

// 입출력 예 #4

// "EIO"는 1189번째 단어입니다

// A, AA, AAA, AAAA, 

// AAAAA, 
// AAAAE, 
// AAAAI, 
// AAAAO, 
// AAAAU,

// AAAE, 
// AAAEA, AAAEE, AAAEI, AAAEO, AAAEU, 
// AAAI, 
// AAAIA, AAAIE, AAAII, AAAIO, AAAIU, 
// AAAO, 
// AAAOA, AAAOE, AAAOI, AAAOO, AAAOU,
// AAAU, 
// AAAUA, AAAUE, AAAUI, AAAUO, AAAUU,

// AAE e, i, o, u
//   AAEA, 
//     AAEAA, AAEAE, AAEAI, AAEAO, AAEAU,
//   AAEE, 
//     AAEEA, AAEEE, AAEEI, AAEEO, AAEEU,
//   AAEI, 
//     AAEIA, AAEIE, AAEII, AAEIO, AAEIU,
//   AAEO, 
//     AAEOA, AAEOE, AAEOI, AAEOO, AAEOU,
//   AAEU, 
//     AAEUA, AAEUE, AAEUI, AAEUO, AAEUU,
 
// https://velog.io/@gyyoon4u/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4Java-%EB%AA%A8%EC%9D%8C-%EC%82%AC%EC%A0%84
public class coding0323 {
    public int solution(String word) {
        int answer = 0;
        
        return answer;
    }

}