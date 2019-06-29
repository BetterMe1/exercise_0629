package exercise.exercise_0629;

/*
最难的问题

NowCoder生活在充满危险和阴谋的年代。为了生存，他首次发明了密码，用于军队的消息传递。假设你是军团中的一名军官，需要把发送来的消息破译出来、并提
供给你的将军。
消息加密的办法是：对消息原文中的每个字母，分别用该字母之后的第5个字母替换（例如：消息原文中的每个字母A 都分别替换成字母F），其他字符不 变，并且消息原文的所有字母都是大写的。密码中的字母与原文中的字母对应关系如下。
密码字母：A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
原文字母：V W X Y Z A B C D E F G H I J K L M N O P Q R S T U

输入描述:
输入包括多组数据，每组数据一行，为收到的密文。
密文仅有空格和大写字母组成。

输出描述:
对应每一组数据，输出解密后的明文。
示例1
输入
HELLO WORLD
SNHJ
输出
CZGGJ RJMGY
 */
/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letter[] = {'Z','Y','X','W','V','U','T','S',
                'R','Q','P','O','N','M','L','K',
                'J','I','H','G','F','E','D','C','B','A'};
        while(sc.hasNext()){
            char chars[] = sc.nextLine().toCharArray();
            for(int i=0; i<chars.length; i++){
                if(chars[i] != ' '){
                    chars[i] = letter[('Z'-chars[i]+5)%26];
                }
            }
            System.out.println(String.valueOf(chars));
        }
    }
}*/

/*
到底买不买（20）

小红想买些珠子做一串自己喜欢的珠串。卖珠子的摊主有很多串五颜六色的珠串，但是不肯把任何一串拆散了卖。于是小红要你帮忙判断一
下，某串珠子里是否包含了全部自己想要的珠子？如果是，那么告诉她有多少多余的珠子；如果不是，那么告诉她缺了多少珠子。
为方便起见，我们用[0-9]、[a-z]、[A-Z]范围内的字符来表示颜色。例如，YrR8RrY是小红想做的珠串；那么ppRYYGrrYBR2258可以买，因为包含了
全部她想要的珠子，还多了8颗不需要的珠子；ppRYYGrrYB225不能买，因为没有黑色珠子，并且少了一颗红色的珠子。

输入描述:
每个输入包含1个测试用例。每个测试用例分别在2行中先后给出摊主的珠串和小红想做的珠串，两串都不超过1000个珠子。
输出描述:
如果可以买，则在一行中输出“Yes”以及有多少多余的珠子；如果不可以买，则在一行中输出“No”以及缺了多少珠子。其间以1个空格分隔。
示例1
输入
ppRYYGrrYBR2258
YrR8RrY
输出
Yes 8
 */
import java.io.Serializable;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int j;
        char a;
        int count = 0;
        for(int i=0,len2=str2.length(); i<len2; i++){
            a = str2.charAt(i);
            j = str1.indexOf(a);
            if(j == -1){
                count++;
            }else{
                str1 = str1.substring(0,j) + str1.substring(j+1);
            }
        }
        if(count == 0){
            System.out.println("Yes "+str1.length());
        }else{
            System.out.println("No "+count);
        }
    }
}