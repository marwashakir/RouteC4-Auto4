package day7;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello big boy!");
        System.out.println(sb);

        sb.append(" ,How are you?");
        System.out.println(sb);

        sb.insert(5, "😟"); // insert at index
        System.out.println(sb);

        sb.delete(0, 5); // delete from index 0 to 5 (exclusive)
        System.out.println(sb);

        sb.replace(0, 5, "Hellooooooooooooooooo".toLowerCase()); // replace from index 0 to 5 (exclusive) with " "
        System.out.println(sb);

        sb.reverse(); // reverse the string
        System.out.println(sb);

        addSpace("EgyptianNationalTeamWillPlayTodayAt 9Pm");

        String a = "abdu ";
        String b = "allah ";
        String c = "Fa";

        System.out.println(a + b + c);
    }
    static void addSpace(String text)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch) && i > 0)
            {
                sb.append(" ");
            }
            sb.append(ch);
        }

        System.out.println(sb);
    }
}