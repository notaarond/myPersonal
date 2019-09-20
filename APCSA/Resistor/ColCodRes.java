// 180919 Aaron De Castro
//could use an array to store all of the colors

public class ColCodRes extends Resistor{

  public ColCodRes(int r, double t)
  {
    super(r, t);
  }

  public String colorCode()
  {
    String output = "";
    String resistance = Double.toString((double)super.getNomRes());

    //output += resistance;

    // first two band checks
    for(int i = 0; i < 2; i++) //Resistors only have values up o their second digit
    {
      //if(i == 0 || i == 1) { output += resistance; }

      if(resistance.charAt(i) == '.'){
        i--;
        continue;
      }
      if(resistance.charAt(i) == '0'){ output += "Black | "; }
      if(resistance.charAt(i) == '1'){ output += "Brown | "; }
      if(resistance.charAt(i) == '2'){ output += "Red | "; }
      if(resistance.charAt(i) == '3'){ output += "Orange | "; }
      if(resistance.charAt(i) == '4'){ output += "Yellow | "; }
      if(resistance.charAt(i) == '5'){ output += "Green | "; }
      if(resistance.charAt(i) == '6'){ output += "Blue | "; }
      if(resistance.charAt(i) == '7'){ output += "Violet | "; }
      if(resistance.charAt(i) == '8'){ output += "Grey | "; }
      if(resistance.charAt(i) == '9'){ output += "White | "; }
    }

    //third band checks
    if(super.getNomRes() < 10){ output += "Black |"; }
    if(resistance.length() == 4){ output += "Brown |"; }
    if(resistance.length() == 5){ output += "Red |"; }
    if(resistance.length() == 6){ output += "Orange |"; }
    if(resistance.length() == 7){ output += "Yellow |"; }
    if(resistance.length() == 8){ output += "Green |"; }
    if(resistance.length() == 9){ output += "Blue |"; }
    if(resistance.length() == 10){ output += "Violet |"; }
    if(resistance.length() == 11){ output += "Gray |"; }
    if(resistance.length() == 12){ output += "White |"; }


    //Tolerance checks
    if(super.getTol() == 0.01){ output += " Brown"; }
    if(super.getTol() == 0.02){ output += " Red"; }
    if(super.getTol() == 0.005){ output += " Green"; }
    if(super.getTol() == 0.0025){ output += " Blue"; }
    if(super.getTol() == 0.001){ output += " Violet"; }
    if(super.getTol() == 0.0005){ output += " Gray"; }
    if(super.getTol() == 0.05){ output += " Gold"; }
    if(super.getTol() == 0.1){ output += " Silver"; }
    if(super.getTol() == 0.2){ output += " None"; }


    return output;
  }


}

/*
  switch (resistance.charAt(i)) { // checks the string for each digit and concatenates the correct color to the output string
    case 0: output += "Black | ";
            break;
    case 1: output += "Brown | ";
            break;
    case 2: output += "Red | ";
            break;
    case 3: output += "Orange | ";
            break;
    case 4: output += "Yellow | ";
            break;
    case 5: output += "Green | ";
            break;
    case 6: output += "Blue | ";
            break;
    case 7: output += "Violet | ";
            break;
    case 8: output += "Grey | ";
            break;
    case 9: output += "White | ";
            break;

}
*/
