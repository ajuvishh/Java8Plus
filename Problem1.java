public class Test
{
    public static void main(String[] args)
    {
        String str = "Hello World Welcome Peace Hello World";
        char match = 'e';
        /*int firstmatch= -1,lastmatch=-1;
        for(int i=0; i<str.length()/2; i++){
            //System.out.println(str.charAt(i)+" "+str.charAt(str.length()-1-i));
            if(str.charAt(i)== match && firstmatch==-1){
                firstmatch = i;
            }
            if(str.charAt(str.length()-1-i) == match && lastmatch==-1){
                lastmatch = str.length()-1-i;
            }

        }
        Character[] charArray = new Character[str.length()];
        for(int i=0,j=0; i<str.length();i++){
            if(str.charAt(i)!=match || i==firstmatch || i==lastmatch) {
                charArray[j] = str.charAt(i);
                j++;
            }

        }
        System.out.println("Output");
        for(int i=0;i<charArray.length;i++)
            System.out.print(charArray[i]);*/

        OptionalInt rep = IntStream.range(0,str.length()).filter(i->{
            return str.charAt(i)=='e';
        }).findFirst();
        OptionalInt repLast = IntStream.range(0,str.length())
                .map(i -> (str.length() - 1 - i)).filter(i->{
            return str.charAt(i)=='e';
        }).findFirst();
        IntStream.range(0,str.length()).filter(i->{
            if(str.charAt(i)!=match || i==rep.getAsInt() || i==repLast.getAsInt()) {
                return true;
            } else
                return false;
        }).forEach(i->System.out.print(str.charAt(i)));
        System.out.println(rep+" "+repLast);
    }
}
