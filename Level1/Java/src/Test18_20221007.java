import java.util.ArrayList;
import java.util.List;

public class Test18_20221007 {
    /*
    문제 설명
배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,

arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

제한사항
배열 arr의 크기 : 1,000,000 이하의 자연수
배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
입출력 예
arr	answer
[1,1,3,3,0,1,1]	[1,3,0,1]
[4,4,4,3,3]	[4,3]
입출력 예 설명
입출력 예 #1,2
문제의 예시와 같습니다.
     */


    public int[] solution(int []arr) {
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        //answerList라는 새로운 ArrayList를 생성한다. 이 배열 리스트는 Int타입만 담을 수 있다.
        int num = -1; // 값이 -1인 num이라는 변수를 선언해준다.
        for(int i=0; i<arr.length; i++) { //0부터 시작해 루프마다 +1씩 i의 숫자가 커지는 반복문. arr의 길이만큼 루프한다.
            if(arr[i] != num) { //조건문, 만약 arr[i]인덱스의 값이 num과 다르다면 아래 식이 실행된다.
                //if문에 걸리지 않는다면 식은 실행되지 않으므로 연속 중복은 사라진다.
                answerList.add(arr[i]); //answerlist에 arr[i]를 넣는다.
                num = arr[i]; //num의 숫자를 arr[i]인덱스의 값으로 변경한다.
            }
        }
        return answerList.stream().mapToInt(i->i).toArray(); //List를 Array형태로 변환하여 return한다는 뜻이다.

        /* ↓ 이 방법으로 변환도 가능. stream을 쓰면 가독성이 좋고 편리하다. 하지만 속도가 느려진다고 한다.
        // List를 Array로 변환
        int[] answer = new int[answerList.size()];
        int cnt = 0;
        for (int num : answerList)
            answer[cnt++] = num;

        return answer;
              }
         */
    }
}
