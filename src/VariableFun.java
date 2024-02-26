public class VariableFun {
  public static void main(String[] args) {
    int myAge; // declaration
    myAge = 19; // initialization
    // declaration must come before initialization

    // once initialized with final, the value can't be changed
    // this is called a symbolic constant
    // (literal constants are like 150 = 120 - this wouldn't work because 150 cannot equal 120)
    // similar to const in JS
    final int SOME_NUM = 150;
    final String HOME_TOWN = "Boston";

    String name = "Billy";

    // Java defaults to concatenation over addition
    // hence why a string outputs
    System.out.print(name + " is " + myAge + '\n');
    System.out.print(HOME_TOWN);
  }
}