package day0119;
/**
 * 상수(constant)
 * ㄴ 우리가 한번 값을 초기화 하면 더이상 변경을 할 수 없는 공간을 상수라고 한다.
 * ㄴ 즉, 선언 후 초기화를 하고 나서는 더이상 다른 값을 할당할 수 없게 된다.
 * ㄴ 상수는 데이터타입 앞에 final  이라는 키워드를 붙여서 만들어준다.
 * 
 * @author bitcamp
 *
 */
public class Ex02Constant {
	public static void main(String[] args) {
		
		final int NUMBER = 5;   // 상수는 뱀 표기법   -> NUMBER
        System.out.println("NUMBER의 현재값 : " + NUMBER);	
        
        // NUMBER = 10;
        // ㄴ 이미 5라는 값으로 초기화된 상수에 10이라는 값으로 초기화를 하려고 했기 때문에 에러뜸.
	}

}
