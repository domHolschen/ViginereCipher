import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Encryptor {
    public void encryptToTerminal(File file, String key, boolean isEncrypting) {
        try {
            Scanner scan = new Scanner(file);
            ArrayList<Character> letterArray = new ArrayList<>();
            letterArray.add('a');
            letterArray.add('b');
            letterArray.add('c');
            letterArray.add('d');
            letterArray.add('e');
            letterArray.add('f');
            letterArray.add('g');
            letterArray.add('h');
            letterArray.add('i');
            letterArray.add('j');
            letterArray.add('k');
            letterArray.add('l');
            letterArray.add('m');
            letterArray.add('n');
            letterArray.add('o');
            letterArray.add('p');
            letterArray.add('q');
            letterArray.add('r');
            letterArray.add('s');
            letterArray.add('t');
            letterArray.add('u');
            letterArray.add('v');
            letterArray.add('w');
            letterArray.add('x');
            letterArray.add('y');
            letterArray.add('z');
            int keyIndex = 0;
            char newC;
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                for (int i=0;i<line.length();i++) {
                    char c = line.charAt(i);
                    char cLow = Character.toLowerCase(line.charAt(i));
                    if (letterArray.contains(cLow)) {
                        if (key.charAt(keyIndex) != '.') {
                            if (isEncrypting) {
                                newC = numToChar((charToNum(cLow)+charToNum(key.charAt(keyIndex)))%26);
                            } else {
                                newC = numToChar((charToNum(cLow)-charToNum(key.charAt(keyIndex))+26)%26);
                            }
                        } else {
                            newC = cLow;
                        }
                        if (Character.isUpperCase(c)) newC = Character.toUpperCase(newC);
                        keyIndex = (keyIndex+1)%key.length();
                        System.out.print(newC);
                    } else {
                        System.out.print(c);
                    }
                }
                System.out.println("");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Oops! File not found.");
        }
    }

    public char numToChar(int num) {
        switch (num) {
            case 0:
                return 'a';
            case 1:
                return 'b';
            case 2:
                return 'c';
            case 3:
                return 'd';
            case 4:
                return 'e';
            case 5:
                return 'f';
            case 6:
                return 'g';
            case 7:
                return 'h';
            case 8:
                return 'i';
            case 9:
                return 'j';
            case 10:
                return 'k';
            case 11:
                return 'l';
            case 12:
                return 'm';
            case 13:
                return 'n';
            case 14:
                return 'o';
            case 15:
                return 'p';
            case 16:
                return 'q';
            case 17:
                return 'r';
            case 18:
                return 's';
            case 19:
                return 't';
            case 20:
                return 'u';
            case 21:
                return 'v';
            case 22:
                return 'w';
            case 23:
                return 'x';
            case 24:
                return 'y';
            case 25:
                return 'z';
            default:
                return '?';
        }
    }

    public int charToNum(char c) {
        switch (c) {
            case 'a':
                return 0;
            case 'b':
                return 1;
            case 'c':
                return 2;
            case 'd':
                return 3;
            case 'e':
                return 4;
            case 'f':
                return 5;
            case 'g':
                return 6;
            case 'h':
                return 7;
            case 'i':
                return 8;
            case 'j':
                return 9;
            case 'k':
                return 10;
            case 'l':
                return 11;
            case 'm':
                return 12;
            case 'n':
                return 13;
            case 'o':
                return 14;
            case 'p':
                return 15;
            case 'q':
                return 16;
            case 'r':
                return 17;
            case 's':
                return 18;
            case 't':
                return 19;
            case 'u':
                return 20;
            case 'v':
                return 21;
            case 'w':
                return 22;
            case 'x':
                return 23;
            case 'y':
                return 24;
            case 'z':
                return 25;
            default:
                return '?';
        }
    }
}
