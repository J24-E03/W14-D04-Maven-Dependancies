import org.apache.commons.lang3.StringUtils;

public class StringUtilsExample {
    public static void main(String[] args) {
        String input = "  Maven Lab Example  ";

        // Trim the string
        String trimmed = StringUtils.trim(input);
        System.out.println("Trimmed: '" + trimmed + "'");

        // Reverse the string
        String reversed = StringUtils.reverse(trimmed);
        System.out.println("Reversed: " + reversed);

        // Check if the string is empty
        boolean isEmpty = StringUtils.isEmpty(trimmed);
        System.out.println("Is Empty: " + isEmpty);

        // Capitalize the string
        String capitalized = StringUtils.capitalize(trimmed);
        System.out.println("Capitalized: " + capitalized);


        String numericString = "12345";
        boolean isNumeric = StringUtils.isNumeric(numericString);
        System.out.println("Is Numeric: " + isNumeric);

        String[] words = {"Maven", "Lab", "Example"};
        String joinedString = StringUtils.join(words, " ");
        System.out.println("Joined: " + joinedString);
    }
    }

