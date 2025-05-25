package Binary_Search;
public class nextGratestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','h','k'};
        char target =  'a';
        System.out.println(nextGratestLette(letters,target));
    }
    public static char nextGratestLette(char[] letters , char target ){
        int beg=0;
        int end=letters.length-1;
        if(target>letters[end]){
            return '\u0000';
        }
        while(beg<=end){
            int mid=(beg+end)/2;
            if(target>letters[mid]){
                beg=beg+1;
            }
            else{
                end=end-1;
            }

        }
        return letters[beg];

    }
}
