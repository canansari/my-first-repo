package JdayThirtyFour;
/*Design a String operations class according to requirements listed below
Attributes
    +String value
Methods
    +returnReversed
    +returnOnlyFirstLetterUpperCase
    +returnAsArray
    +returnSentenceAsArray
 */
public class StringOperations {
    String str;
    public StringOperations(){
        this.str="Hello";
    }
    public StringOperations(String str){
        this.str=str;
    }
    public String reversed(){
        String reversedAttribute="";
        for(int i=this.str.length()-1; i>=0; i-- ){
            reversedAttribute=reversedAttribute+this.str.charAt(i);
        }
        return reversedAttribute;

    }
    public String reversed(String toBeReversed){
        String reversedStr="";
        for(int i=toBeReversed.length()-1; i>=0; i--){
            reversedStr=reversedStr+toBeReversed.charAt(i);
        }
        return reversedStr;
    }
    public String makeOnlyFirstLetterUpper(){
        String strUpperFirst=""; //empty String to concat
        char firstLetter=this.str.charAt(0); //first letter of class attribute
        strUpperFirst=strUpperFirst+firstLetter;//first letter of the class is concat
        strUpperFirst=strUpperFirst.toUpperCase();//first letter converted to upper case
        String allLowerCase=this.str.toLowerCase();//class attribute made all lower case
        for(int i=1; i<allLowerCase.length(); i++){
            strUpperFirst=strUpperFirst+allLowerCase.charAt(i);
        }
        return strUpperFirst;
    }
    public char [] returnAsArray(){
        char[] returningArray=new char[this.str.length()];
        for (int i=0; i<this.str.length(); i++){
            returningArray[i]=this.str.charAt(i);
        }
        return returningArray;
    }

}
