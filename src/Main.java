void main() {
    int val = 123;
    String word = "Java";
    int number = 5;
    IO.println(Reverse_String(word));
    IO.println(Find_Digit_Sum(val));
    IO.println(Sum_Of_Natural_Num(number));
    IO.println(Factorial(21L ));
}
public static int Find_Digit_Sum(int values){

    if (values == 0){
        return 0;
    }

    else{
        //Recursive Formulation
        return values % 10 + Find_Digit_Sum(values/10);
    }
   //123 = 3 + Find_Digit_Sum(12)
   //12 = 2 + Find_Digit_Sum(1)
   //1 = 1 + Find_Digit_Sum(0)
   //0 = 0
}

public static String Reverse_String(String word) {
//base case
    if(word.length()<= 1){
        return word;
    }
    else{
        //Reverses string without new variable
        return Reverse_String(word.substring(1)) + word.charAt(0);
    }
}
public static int Sum_Of_Natural_Num(int n){
    if(n == 1){
        return n;
    }
    else{
        //recursive case
        return n + Sum_Of_Natural_Num(n -1);
    }
}
public static Long Factorial(Long n){
    if(n== 0 || n == 1){
        return 1L;
    }
    return n * Factorial(n-1);
}

