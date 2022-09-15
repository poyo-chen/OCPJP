package ocpjp;
/*which two method facilitate valid ways to read instance fields*/
public class Question52 {

  int aCount;
  int tCount;
  int cCount;
  int gCount;
  //get方法不該放入參數
  int getACount(int aCount) {
    return aCount;
  }
  //get方法不該放入參數
  int getTcount(int tCount) {
    return this.tCount;
  }

  int getCCount() {
    return getTotalCount() - this.aCount - getTcount(0) - gCount;
  }
  //get方法不該呼叫自己
  int getGCount() {
    return getGCount();
  }

  int getTotalCount() {
    return aCount + getTcount(0) + this.cCount + this.gCount;
  }
}
