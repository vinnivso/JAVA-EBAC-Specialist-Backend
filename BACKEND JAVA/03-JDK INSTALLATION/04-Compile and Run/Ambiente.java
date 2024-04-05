public class Ambiente {
  public static void main(String[] args) {
    String ambiente = args[0];
    if (ambiente.equalsIgnoreCase("DEV")) {
      System.out.print("Server running on DEV Environment");
    } else if(ambiente.equalsIgnoreCase("TEST")) {
      System.out.print("Server running on TEST Environment");
    } else {
      System.out.print("Server running on " + ambiente);
    }
  }
}