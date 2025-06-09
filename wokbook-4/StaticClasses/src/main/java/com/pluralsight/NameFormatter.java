package com.pluralsight;

public class NameFormatter {
    private NameFormatter(){}
public static String format(String firstName, String lastName ){
        return format("", firstName, "", lastName, "");


}
public static String format(String prefix, String firstName, String middleName, String lastName, String suffix ) {
    StringBuilder nameBuilder1 = new StringBuilder();
    nameBuilder1.append(lastName).append(", ");
    if (!prefix.isEmpty()) {
        nameBuilder1.append(prefix).append(" ");
    }
    nameBuilder1.append(firstName);

    if (!middleName.isEmpty()) {
        nameBuilder1.append(" ").append(middleName);
    }
    if(!suffix.isEmpty()){
        nameBuilder1.append(", ").append(suffix);

}
    return nameBuilder1.toString();

}
public static String format(String fullName){
        String [] parts =fullName.split(",");
        String mainPart = parts[0];
        String suffix = parts.length > 1 ? parts[1] : "";



        String[] nameParts = mainPart.split(" ");

        String prefix = "", firstName = "", middleName = "", lastName = "";
        switch (nameParts.length){
            case 4:
        }

    return mainPart;
}

}
