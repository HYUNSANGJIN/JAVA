package day0120;
/*
 * 조건문02 - Switch
 * ㄴ if 조건문은 true/false가 나올 수 있는 조건식을 만들어서 
 * ㄴ 해당 조건식이 true가 나올떄에 코드블락이 실행이 되었지만 
 * ㄴ switch 조건문은 우리가 조건식이 아닌 값이 변화될 수 있는
 * ㄴ 변수를 선택해서 그 변수의 값에 따른 코드를 정의하는 형태의 조건문이다.
 * 
 * switch 조건문의 형태
 * switch(변수){
 * case 값:
 *     실행할 코드
 *      break;
 *  default :
 *     실행할 코드
 *     break;
 *     }
 *     
 */
public class Ex12Switch {
    public static void main(String[] args) {
        int number = 2;
        
        switch(number) {
        case 1:
            System.out.println("1입니다");
            break;
        case 3:
            System.out.println("3입니다");
            break;
        case 2:
            System.out.println("2입니다");
            break;
            default :
                System.out.println("그외입니다.");
                break;
        }
    }

}
