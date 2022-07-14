import java.util.List;

public class Test6_20220714 {
    /*
    정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

        제한사항
        arr은 길이 1 이상, 100 이하인 배열입니다.
        arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
        입출력 예
        arr	return
        [1,2,3,4]	2.5
        [5,5]	5
     */

    public static void main(String[] args) {
    // 평균 = 모든 숫자의 합 / 자료의 수


        class Solution {
            public Integer solution(int[] arr){ //arr라는 list를 인자로 받음.
                            //아니 List arr 이 아니라 이렇게 받아야하네.

                int sum = 0;

                for(int i = 0; i < arr.length; i++){
                    sum = arr[i];
                }
                //array에 들어있는 수를 하나하나 분리시킨다.
                //분리된 array의 수를 모두 더한다

                int average = sum / arr.length;
                //더해진 숫자 sum / arr.length = answer

                return average;
            }
        }


    }
}
