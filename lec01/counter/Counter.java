public class Counter {
  public int count;

  /*TODO: 
   * What is a constructor?
   * What is the return type?
   * Can you have multiple constructors?
   */
  public Counter(int start) {
    count = start;
  }


  /*TODO default constructor - 
   * what happens if we don't have one?
   * Let's implement it.
   */

  //public Counter() { fidjakfaslfjsdf }

  /* TODO getter (accessor)
   * What is a getter?
   * Let's implement it.
   * */

  public int getCount() {
    return this.count;
  }


  /*TODO: setters 
   * What is a setter?
   * */
  public void inc() {
    count += 1;
  }


  //TODO setter2 - increment by an input value
  public void inc(int val) {
    count += val;
  }

  //TODO setter3 - reset to zero
  public void reset() {
    count = 0;
}

}
