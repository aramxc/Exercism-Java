public class Hamming {
  /* Initial psuedo-code:
  *Create a global variable "hammingDistance" to store different values based on test results
  * Perform string checks, assign corresponding hammingDistance values.
  * If strings are not equal, perform for loop calculating differences between corresponding characters.
  * If strings are not of equal length, throw custom exception
  */

  public  int hammingDistance;

  public Hamming(String leftStrand, String rightStrand) {

    // Initial tests: check if both strands are identical and of equal length
    Boolean lengthsIdentical = (leftStrand.length() == rightStrand.length());
    Boolean nucelotidesIdentical = (leftStrand.equals(rightStrand));

    // Convert both strings to character arrays for comparison
    char[] leftStrandArray = leftStrand.toLowerCase().toCharArray();
    char[] rightStrandArray = rightStrand.toLowerCase().toCharArray();

    //Start of compaison if statement here
    if (lengthsIdentical && nucelotidesIdentical){
      hammingDistance = 0;

    } else if (lengthsIdentical && !nucelotidesIdentical) {
    // for loop comparing corresponding nucleotides
    for (int i = 0; i < leftStrand.length(); i++) {
      if (leftStrandArray[i] != rightStrandArray[i]) {
        hammingDistance++;

      }
    }


    } else {
      // throw illegal exception with custom error message if strands are not equal length
      throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    }
  }

  /* Returns hamming distance variable
  *
  */
  int getHammingDistance() {
    return hammingDistance;
  }
}
