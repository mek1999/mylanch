import java.util.*;
class StringConcat{

    public static void main(String[] args){
        int length1,length2;
        String word1,word2;
        char[] cword1,cword2,finalword;
        Scanner sc=new Scanner(System.in);
        word1=sc.nextLine();
        word2=sc.nextLine();
        cword1=word1.toCharArray();
        cword2=word2.toCharArray();

        length1=word1.length();
        length2=word2.length();
        finalword=new char[length1+length2];
        for(int k=0;k<length1;k++){
            finalword[k]=cword1[k];
        }
        for(int i=0,k=length1;k<(length1+length2);k++,i++){
            finalword[k]=cword2[i];
        }
        for(char word:finalword)
            System.out.print(word);

    }

}
