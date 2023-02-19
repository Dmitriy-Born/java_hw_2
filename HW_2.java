public class HW_2 {
    public static void main(String[] args) {
        String str = "   Добрый день Как дела Все       хорошо      ";
        System.out.println(point(str));
    }
    
    public static String point (String str){
        String newStr = "";
        char p = '!';
        newStr = str.trim().replaceAll("\s+", " ")
                            .replaceAll("\s([А-ЯЁ])", ". $1");

        if (newStr.charAt(newStr.length()-1) != p){
            newStr += p;
        }

        return newStr;
    }

}
