public class Test15_20220924 {
    /*
    대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True,
    다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
    단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

제한사항
문자열 s의 길이 : 50 이하의 자연수
문자열 s는 알파벳으로만 이루어져 있습니다.
입출력 예
s	answer
"pPoooyY"	true
"Pyy"	false
입출력 예 설명
입출력 예 #1
'p'의 개수 2개, 'y'의 개수 2개로 같으므로 true를 return 합니다.

입출력 예 #2
'p'의 개수 1개, 'y'의 개수 2개로 다르므로 false를 return 합니다.

※ 공지 - 2021년 8월 23일 테스트케이스가 추가되었습니다.
     */

    /*
    문자열을 분리시켜 배열에 넣는다.
    반복문을 돌리며 p와 y의 갯수를 센다. if문을 두개 만들어서 조건문에 걸릴 때마다 각각의 갯수를 세는 변수의 숫자가 +1씩 커지도록 한다.
    반복문을 나온 후 조건문으로 true 혹은 false를 반화할 수 있도록 한다.
     */

    boolean solution(String s) {
        int pCount = 0, yCount = 0;
        String[] array = s.toLowerCase().split(""); //  소문자로 바꿔서 잘라서 배열에 넣음

        for (int i = 0; i < array.length; i++) { //for문 돌리면서 p 와 y 카운터 세기
            if ("p".equals(array[i])) {
                pCount++;
            } else if ("y".equals(array[i])) {
                yCount++;
            }
        }
        if (pCount != yCount) {
            return false;
        }
        return true;
    }
}
