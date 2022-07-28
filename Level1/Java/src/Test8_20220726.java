public class Test8_20220726 {

    /*
    문제 설명
두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

제한 사항
두 수는 1이상 1000000이하의 자연수입니다.

입출력 예
n	m	return
3	12	[3, 12]
2	5	[1, 10]

입출력 예 설명
입출력 예 #1
위의 설명과 같습니다.

입출력 예 #2
자연수 2와 5의 최대공약수는 1, 최소공배수는 10이므로 [1, 10]을 리턴해야 합니다.
     */

    public static void main(String[] args) {
        class Solution {
            public int[] solution(int n, int m) {

                //최대공약수(GCD = Greatest Comon Divisor)와 최소 공배수를 구하기 위해서
                //유클리드 호제법 을 사용할 것이다. 호제법을 서로호, 나눌제. 서로 나눈다는 의미에서 이런 이름이 붙었다.
                //호제법에 따른 최대 공약수 구하는 법은 다음과 같다.
                // mod 는 나머지 라는 뜻
                // r = a mod b
                // 0 = b mod r <-이것을 만족할 때 R은 a, b의 최대 공약수이다.
                //또한 GCD(a, b)와 GCD(b, r)의 최대 공약수가 같다.

                int r = n % m;
                boolean check = 0 == m % r;

                int gcd = r;

                System.out.println("r의 값은 %d, check 결과는 %b" + r + check);
                System.out.println("%d와 %d의 최대 공약수 값은 %d" + n + m + gcd);

                //이후 최대공배수를 구하는 방법은 (a*b)/r 을 해주면 된다.
                      // Least Common Multiple

                int lcm = (n*m) / gcd;

                System.out.println("최대 공배수의 값은 %d" + lcm);

                int[] answer = {gcd, lcm};

                return answer;
            }
        }
    }
}
