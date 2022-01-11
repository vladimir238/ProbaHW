import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {

        String controlText = "Я от бабушки ушел я от дедушки ушел ";
        System.out.println(controlText);
        controlText = controlText.trim();
        String word[] = controlText.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int b = 0; b < word.length; b++) {
            Character[] wordArr;
            wordArr = toCharacterArray(word[b]);      // Возвращает слово как массив
            int l = wordArr.length;
            String revWord = reversArray(wordArr);       // Возвращает перевернутое слово
            builder.append(revWord);
        }
        String rs = builder.toString();
        System.out.println(rs);
        System.out.println("Пробуем работать с GitHub");
        System.out.println("Пробуем работать с GitHub");
        System.out.println("Пробуем работать с GitHub");


    }


    public static Character[] toCharacterArray(String s) {    //Преобразование строки в массив букв.

        if (s == null) {
            return null;
        }

        int len = s.length();
        Character[] array = new Character[len];
        for (int i = 0; i < len; i++) {

            array[i] = s.charAt(i);
        }

        return array;
    }

    public static String reversArray(Character[] arr) {        //конверсия букв в слове и формирование слова
        int len = arr.length;
        Character[] revArr = new Character[len];
        int h = len;
        for (int k = 0; k < len; k++) {
            h--;
            char s = arr[h];
            revArr[k] = s;
        }
        String word1 = new String();
        for (char c : revArr) {
            word1 = word1 + c;
        }
        return word1 + " ";
    }

}