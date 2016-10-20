/***************************************************************
* file: Krishnan_Decoder.java
* author: Kimberlyn Krishnan
* class: CS 141 – Programming and Problem Solving
*
* assignment: program 1
* date last modified: 4/6/2016
*
* purpose: this program decodes a secret message contained in a text
file
*
****************************************************************/
import java.util.Scanner;

public class Krishnan_Decoder {
public static void main (String[] args) {

Scanner inputFile = new Scanner(System.in);

String keyPhrase = inputFile.nextLine();

String integers = inputFile.nextLine();
String[] key = integers.split(" ");

String[] assignment = new String[keyPhrase.length()];
for (int i = 0; i < keyPhrase.length(); i++)
{
assignment[i] = Integer.toString(i);
}

char[] output = new char[keyPhrase.length()];
for (int k = 0; k < keyPhrase.length(); k++)
{
output[k] = keyPhrase.charAt(k);
}

int y = 0;
int g = 0;
String[] message = new String[key.length];
for (int p = 0; p < key.length; p++)
{
String c = key[y];
String a = assignment[p];
String b = String.valueOf(output[Integer.parseInt(key[y])]);
boolean contains = false;

  for (int x = 0; x < assignment.length; x++)
{
   if(assignment[x] == c)
   {
     contains = true;
     break;
   }
}
   if (contains = true)
{
    message[g] = b;
    y++;
    g++;
}  else {
message[g] = "no c";
        }
}

String wow = "";
for (String str: message)
wow=wow+str;
System.out.println("Your secret message is: " + wow);

}
}




