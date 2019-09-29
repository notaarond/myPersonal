// 260919 Aaron De Castro
//protected makes it so that only CHILD of the class can access some behaviors or variables of the parent


public class MixedNumber extends Fraction{

    //variables/states
    private int wholeNum;

    //constructors
    //this.setMixedNumber() is called at the end of each constructor to make sure the mixed number is in proper form

    //no param constructor
    public MixedNumber(){
      super(0, 1); //denominator can't be set to 0
      wholeNum = 0;
    }

    //two param constructor
    public MixedNumber(int n, int d){
      super(n, d); //sets Fraction regularly
      wholeNum = 0;

      this.setMixedNumber();

    }

    //three param constructor
    public MixedNumber(int n, int d, int w){ //takes a whole number as input
      super(n, d); //super must be first in constructor
      wholeNum = w;

      this.setMixedNumber();

    }

    //constructor for fraction input
    public MixedNumber(Fraction f){
      super(f.getNumerator(), f.getDenominator());
      wholeNum = 0; //still needs to be initialized, but 0 since fractions have no whole nums

      this.setMixedNumber();

    }

    //constructor for MixedNumber input
    public MixedNumber(MixedNumber m){
      super(m.getNumerator(), m.getDenominator());
      wholeNum = m.getWholeNumber();

      this.setMixedNumber();
    }


    //get and set methods
    public void setWholeNumber(int w) { wholeNum = w; }
    public int getWholeNumber() { return wholeNum; }

    /* returns an improper fraction version of MixedNumber
    public MixedNumber returnImproperFrac(){
      MixedNumber f = new MixedNumber();

      f.setNumerator((wholeNum * this.getDenominator()) + this.getNumerator());
      f.setDenominator(this.getDenominator());

      return f;
    }
    */

    //sets this MixedNumber to an improper fraction
    public void setImproperFrac(){

      this.setNumerator((wholeNum * this.getDenominator()) + this.getNumerator()); //using equation from picture
      this.setWholeNumber(0); //improper fractions don't have a whole number

    }

    public void setMixedNumber(){
      //set whole number first, since you'll need old numerator to get whole number
      this.setWholeNumber( wholeNum + (this.getNumerator() / this.getDenominator()) ); //how ever many times denom divides into num, sets whole num to that num plus the current whole num
      this.setNumerator( this.getNumerator() % this.getDenominator() ); //use modulus operator to get numerator for proper fraction(leftovers)

    }

    public MixedNumber addMixed(MixedNumber n){

      /* sets the mixed numbers to improper fractions so that we can use the add() functions
      in the parent class to add them */
      n.setImproperFrac();
      this.setImproperFrac();

      //creates a new MixedNumber object to be outputted
      //Since n and this have been set to improper fraction, you can use the parent class' add() method
      //the add() function returns a result of type Fraction, which MixedNumber has a constructor for
      //so, this result can be stored in the sum object and then outputted
      MixedNumber result = new MixedNumber(this.add(n));

      //set the originally used objects back to their mixed number forms
      n.setMixedNumber();
      this.setMixedNumber();

      return result;
    }

    // ----- The Following Arithmetic Methods work similarly to the previous ----- //
    public MixedNumber subtractMixed(MixedNumber n){

      n.setImproperFrac();
      this.setImproperFrac();

      MixedNumber result = new MixedNumber(this.subtract(n));

      n.setMixedNumber();
      this.setMixedNumber();

      return result;
    }

    public MixedNumber multiplyMixed(MixedNumber n){

      n.setImproperFrac();
      this.setImproperFrac();

      MixedNumber result = new MixedNumber(this.multiply(n));

      n.setMixedNumber();
      this.setMixedNumber();

      return result;
    }


    public MixedNumber divideMixed(MixedNumber n){

      n.setImproperFrac();
      this.setImproperFrac();

      MixedNumber result = new MixedNumber(this.divide(n));

      n.setMixedNumber();
      this.setMixedNumber();

      return result;
    }


    public String toString()
    {
      String output = "Whole Number: " + wholeNum +
                      "\nNumerator: " + super.getNumerator() +
                      "\nDenominator: " + super.getDenominator();

      return output;
    }


}
