//260919 Aaron De Castro

public class MixedNumberTest{
  public static void main(String[] args) {

    MixedNumber mOne = new MixedNumber(8, 2); //testing two param improper fraction (good 260919)
    MixedNumber mTwo = new MixedNumber(3, 4); //testing two param regular fraction input (good 260919)
    MixedNumber mThree = new MixedNumber(3, 4, 2); // testing three param regular fraction (good 260919)
    MixedNumber mFour = new MixedNumber(3, 2, 1); // testing three param improper fraction (good 260919)

    System.out.println("mOne:\n" + mOne + "\n");
    System.out.println("mTwo:\n" + mTwo + "\n");
    System.out.println("mThree:\n" + mThree + "\n");
    System.out.println("mFour:\n" + mFour + "\n");

    //testing setting mixedNumbers to improper fractions (good 260919)
    mOne.setImproperFrac();
    mFour.setImproperFrac();

    System.out.println("mOne to improper:\n" + mOne + "\n");
    System.out.println("mFour to improper:\n" + mFour + "\n");

    //testing setting all the Mixed Numbers in improper form to a mixed number form (good 270919)
    mOne.setMixedNumber();
    mTwo.setMixedNumber();
    mThree.setMixedNumber();
    mFour.setMixedNumber();

    System.out.println("mOne to mixed number:\n" + mOne + "\n");
    System.out.println("mTwo to mixed number:\n" + mTwo + "\n");
    System.out.println("mThree to mixed number:\n" + mThree + "\n");
    System.out.println("mFour to mixed number:\n" + mFour + "\n");

    //testing arithmetic methods

    //addMixed()
    System.out.println("mOne plus mTwo: \n" + mOne.addMixed(mTwo)); //(good 270919)
    System.out.println("mFour plus mThree: \n" + mFour.addMixed(mThree)); //(good 270919)

    //subtractMixed()
    System.out.println("mOne subtract mTwo: \n" + mOne.subtractMixed(mTwo));
    System.out.println("mFour subtract mThree: \n" + mFour.subtractMixed(mThree));

    //multiplyMixed()
    System.out.println("mOne multiplied by mTwo: \n" + mOne.multiplyMixed(mTwo));
    System.out.println("mFour multiplied by mThree: \n" + mFour.multiplyMixed(mThree));

    //divideMixed()
    System.out.println("mOne divided by mTwo: \n" + mOne.divideMixed(mTwo));
    System.out.println("mFour divided by mThree: \n" + mFour.divideMixed(mThree));  





  }
}
