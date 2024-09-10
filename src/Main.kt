import kotlin.math.PI

//4강 타입(숫자)

/*
1. 숫자타입: 실수(Double, Float) 정수(Long, Int, Short, Byte)
2. 문자타입(Char), 불린 타입(Boolean), 문자열 타입(String)
3. 정수에만 사용할 수 있는 부호 없는 숫자 타입(ULong, UInt, UShort, UByte)
4. 모든 숫자타입을 대표하는 타입: Number
5. 최상위 타입 클래스, 어떤 타입과도 호환가능한 타입: Any
 */

/* 실수란, 소수점이 들어간 수. 실수의 기본 타입은 Double이다.
fun main(){
    val d = 123.4
}
 */




/* 실수를 알아보자.
fun main(){
    val d = 123.4e+04 //123.4 x 10^4라는 뜻
    val f = 123.4F // 소문자 f 로 써도 됨.
    println(Double.MAX_VALUE) Double은 Float의 정밀도의 두배이다.
    println(Double.MIN_VALUE) -> println(Double.SIZEBITS) ->64비트인 걸 확인. 더 정확하게.
    println(Float.MAX_VALUE)
    println(Float.MIN_VALUE)  -> println(Float.SIZEBITS) ->32비트인 걸 확인
}
출력: 1.7976931348623157E3084.9E-3243.4028235E381.4E-45
왜 클래스 이름, 객체를 사용하지 않았는가? 맥스나 민 벨류가 동반개체로 되어있기 때문.
 */




//정수: 소수점이 없는 수
/* 진수변환(1)

fun main() {
    val i = 123 // 타입을 지정하지 않으면 Int 타입. 숏트나 바이트를 사용하고 싶으면 선언해야함.
    val b = 0b01111 // 0b는 접두사. 이진수를 나타낼 거라는 표시
    val x = 0x01abcf // 16진수 정의한 것.
// 진수변환하는 법
    println(b.toString(10)) // 2진수 ->10진수로 변환하는 것. 출력값: 15
    println(b.toString(16)) // 2진수 ->16진수로 변환하는 것. 출력값: f
    println(x.toString(10)) // 16진수 ->10진수로 변환하는 것. 출력값: 109519
    println(x.toString(2)) // 16진수 -> 2진수로 변환하는 것. 출력값: 11010101111001111
    println(i.toShort()) // Int->Short 타입변환하는 것. 괄호 안에 아무것도 안넣어도 됨? 출력값: 123
}
*/



/* 타입변환, 진수변환 (2)
fun main(){
    val i = 123
    val b = 0b011111
    val x = 0x01abcf
    val f = b.toFloat()
    println(b.toString(10)) //출력:30
    println(f) //출력31.0
    //println() 이 상태에서 ctrl p 누르면 괄호 안 들어갈 수 있는 것들이 나온다

}
 */




/*
// Byte <Short<Int<Long<Float<Double 실수가 가장 큰 값을 나타내며, 그 다음 정수. 타입을 확대하는 방향, 축소하는 방향.
// 한번에 Byte 타입에서 Double 타입으로 변환할 수 없다. Int 타입으로 변환 후 변환해야한다.
fun main(){
    println(Byte.MAX_VALUE) //양의 값, 출력값 127
    println(Byte.MIN_VALUE) //음의 값, 출력값 -128
    println(UByte.MAX_VALUE) // 음수는 표현 x, 양의 값 2배, 출력값: 255
    println(UByte.MIN_VALUE) // 음수는 표현 x, 출력값 0
}
*/



//5강 Char 그리고 Boolean

//Char I - 문자연산하는 것
//Boolean 타입 - TorF 둘 중 하나의 값을 가짐. 비교연산, 논리연산 답을 낼 때 사용

//Char에 대하여
/*
fun main(){
    val c: Char = 'A' //ASCII code 7비트(0~127)
    val han_code_1 = '\uAC00' //한글 음절 중 첫번째 음절 '가' 출력
    val han_code_11172 = '\uD7A3' //한글 음절 중 마지막 음절 '힣' 출력
    println(han_code_1)
    println(han_code_11172)
//val c2: String = "A" 쌍따옴표는 String으로 인식한다. Char로 인식 X
//val c3: Char = 65 Char로 선언하면 문자를 받음. 숫자는 받을 수 없음.
}
*/


/* 아스키코드
fun main() {
    val c: Char = 'A' //ASCII code 7비트(0~127)

    println('A'.code) //아스키코드가 뭘까요? 65
    println((c.code+1).toChar()) //B 당연히 A 다음은 B
}
 */


/* C언어나 자바에서의 for문 작성 방법
fun main(){
    for (i=0; i<10; i++){}

 */



//for문과 if문
//fun main(){
//    for (i in 48 .. 60){
//        val c = i.toChar()
//        if(c.isDigit()) print(c) //print는 줄바꿈 없이 진행
//        else print('*')
//    }
//}
// 출력: 0123456789***


/*
fun main(){
    println('0'.toInt())
} // 출력: 48

 */


/* boolean 타입 설명 (Tor F)
fun main(){
    val n1 = 10;    val n2 = 20
    val b = n1 > n2 // >, >=, <, <=, !=, ==
// println(b) // 출력: false
    if (b) println("n1 is greater than n2")
    else println("n1 is equal to less than n2")
}

 */


/* boolean 배우기 2
fun main(){
    val b = true
    val b2 = false

    println(b && b2)
    println(b || b2)
    println(!b)

    // b = !b 는 상태토글. true일 때 false, false일 때 true 만들기
}

 */



/*String type
1. 저장공간: string pool - intern()
2. 차례로 나열된 원소들: 원소참조-indexing. - indexing, array, collection(list), inerartor
3. string.format()
4. string template
5. 평범해보이지만 절대 평범하지 않은 String
 */


//1.같은 값을 갖고 있는지 비교
//fun main(){
//    var s1: String = "Hello"
//    var s2 = "Hello"
//    if (s1.compareTo(s2) == 0) //같으면 0   //if (s1 == s2) {
//        println("2개의 String 타입 객체는 같은 값을 갖고 있습니다.")
//    }
//}




//1.같은 출처인지 비교
//fun main(){
//    var s1: String = "Hello"
//    var s2 = "Hello"
//    if (s1 === s2) {
//        println("2개의 String 타입 객체는 같은 메모리 공간을 참조하고 있습니다.")
//        //s1과 s2는 값을 참조하고 있다.
//    }
//}
//

//fun main() {
//    var foo:String = "My First Kotlin"
//    var size = foo.length
//    println(size)
//    for (i in 0..size-1){
//        print(foo[i])
//    }

//    for (i in 0 until size){
//        print(foo[i])

//    println(foo[0]) -> M
//    println(foo.get(0)) -> n

//    val c = foo.first()
//    println(foo.first())
//    println(foo.last())
//}


// String.format
//fun main() {
//    val pi:Float = PI.toFloat() //PI = 3.14159
//    val digit = 234 //234
//    val str = "Hello" //Hello
//
//    println("PI = %.5f, %5d %10s".format(pi, digit, str)) //PI = 3.14159,   234      Hello
//    println("PI = %.5f, %-5d %-10s".format(pi, digit, str))//PI = 3.14159, 234   Hello
//}


// 4. string template
//fun main() {
//    var a = 1
//    println("a = " + a) 이렇게 하지 않고
//    println("a = $a") //스트링, 따옴표 안에 $를 쓰면서 변수를 출력할 수 있다.

//    a = 2
//    var s = "[a = $a]"
//    println(s)
//    println("문자열 s의 길이는 $s.length") => 문자열 s의 길이는 [a = 2].length
//    println("문자열 s의 길이는 ${s.length}") =>문자열 s의 길이는 7
//}



//fun main() {
//    var cost = 102
//    println("이 물건의 값은 $$cost 입니다.")
//    println("이 물건의 값은 ${"$"}$cost 입니다.")
//    println("이 물건의 값은 \$$cost 입니다.")
//}


//5. 평범해 보이지만 평범하지 않은 String
// garbage collection -> out of memory

//fun main(){
//    var s = "Hello, Kotlin" //s=Hello, Java
//    var p = s               //p=Hello, Kotlin
//
//    s = s.replace("Kotlin", "Java")
//    println("s=$s, p=$p")
//}

//fun main(){
//    var s = "Hello, Kotlin"
//    var p = s
//
//    s = s.replace("Kotlin", "Java")
//    var s2 = p.substring(0,7) + "Java"
//    println("s=$s, s2=$s2")
//    println(s == s2) //값은 같지만
//    println(s === s2) //출처는 다르다.
//}


