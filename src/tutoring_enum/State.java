package tutoring_enum;

public enum State
{
    /*
    An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
    To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma.
    Note that they should be in uppercase letters.

    Enum is short for "enumerations", which means "specifically listed
     */

    NEW_YORK("NEW YORK", "NY", "ALBANY"),
    WASHINGTON("WASHINGTON", "WA", "Olympia"),
    ARIZONA("ARIZONA", "AZ", "PHOENIX"),
    NEW_JERSEY("NEW JERSEY", "NJ", "Trenton");

    private String name;
    private String abbreviation;
    private String capital;


    State(String name, String abbreviation, String capital) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getCapital() {
        return capital;
    }
}
