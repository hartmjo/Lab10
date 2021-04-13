class Cookie{
  private int number, bakeTemp, bakeTime;
  private boolean isBaked;
  Cookie(){
    number = 0;
    bakeTemp = 0;
    bakeTime = 0;
    isBaked = false;
  }
  Cookie(int aNumber, int aBakeTemp) {
    number = aNumber;
    bakeTemp = aBakeTemp;
    bakeTime = aBakeTemp;
    isBaked = false;
  }
  boolean isReady() {
    return isBaked;
  }
  void setNumber (int aCookieNumber) {
    number = aCookieNumber;
  } 
  void bake (int aBakeTemp, int aBakeTime){
    System.out.println(number + " cookies baked at " + aBakeTemp + " degrees F for " + aBakeTime + " minutes");
    isBaked = true;
  }
}