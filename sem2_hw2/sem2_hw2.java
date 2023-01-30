package sem2_hw2;
/*Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.

Входная строка:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

Выходная строка:
select * from students where name = "Ivanov" and country = "Russia" and city = "Moscow" */

public class sem2_hw2 {
    public static void main(String[] args) {
        String strDir = "{\"name\": \"Ivanov\", \"country\": \"Russia\", \"city\": \"Moscow\", \"age\": \"null\"}";
        String strStart = "select * from students where";
        System.out.println(strDir);
        String str = strDir.replace("{", "").replace("}", "")
                .replace("\"", "");
        System.out.println(str);
        StringBuilder string = new StringBuilder();
        String[] newStr = str.split(",");

        for (int i = 0; i < newStr.length; i++) {
            String[] string3 = newStr[i].split(":");
            if (!"null".equals(string3[1].trim())) {

                string.append(string3[0].trim()).append(" ").append("=").append(" ").append("'")
                        .append(string3[1].trim())
                        .append("'").append(" ");
            }
            if (i < string3.length) {
                string.append("and ");
            }
        }

        System.out.println(strStart + " " + string);
    }

}
