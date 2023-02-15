package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.*;

public class Contact {
    private String name;
    private String personalId;

    public Contact(String name, String personalId) {
        setName(name);
        setPersonalId(personalId);
    }

    public void setName(String name) {
        if (name.length() > 2 || name.length() < 30) {
            if (Pattern.matches("[\\p{L}-]{1,25}\\s[\\p{L}-]{1,50}", name)) {
                this.name = name;
            } else {
                System.out.println("Please give name as: 'fname lname'");
            }
        } else {
            System.out.println("Name too short or too long");
        }
    }

    public void setPersonalId(String personalId) {
        // check length
        if (personalId.length() == 11) { 
            // check that middle char is - or A
            if (personalId.charAt(6) == '-' || personalId.charAt(6) == 'A') {
                String individualStr = "" + personalId.charAt(7) + personalId.charAt(8) + personalId.charAt(9);
                int individualInt = Integer.parseInt(individualStr);
                // check if last three numbers are between 002 and 899
                if (individualInt >= 2 && individualInt <= 899) {
                    String date = "";
                    for (int i = 0; i < 6; i++) {
                        date += personalId.charAt(i);
                    }
                    // check if date is an actual date
                    if (checkDate(date)) {
                        String checkCh = date + individualStr;
                        int remainderCheck = Integer.parseInt(checkCh);
                        // check if last character is the result of remainder of all numbers combined
                        if (checkEndCharacter(remainderCheck, personalId)) {
                            this.personalId = personalId;
                        } else {
                            System.out.println("End character doesn't match rest of the id");
                        }
                    }
                } else {
                    System.out.println("Id individual number is out of range between 002-899");
                }
            } else {
                System.out.println("Id expected century identifier: '-', 'A'");
            }
        } else {
            System.out.println("Id not expected length (11)");
        }
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.personalId;
    }

    private boolean checkDate(String date) {
        if ((date.charAt(2) == '0' && date.charAt(3) == '2') && (date.charAt(0) >= '3' && date.charAt(1) >= '0')) {
            System.out.println("There are only 28 (or 29) days in February");
            return false;
        } else {
            try {
                LocalDate.parse(date, DateTimeFormatter.ofPattern("ddMMyy"));
                return true;
            } catch (DateTimeParseException e) {
                System.out.println(e + " Please give date in format ddMMyy");
                return false;
            }
        }
    }

    private boolean checkEndCharacter(int remainderToCheck, String personalId) {
        switch (remainderToCheck % 31) {
            case 0:
                return (personalId.charAt(10) == '0') ? true : false;
            case 1:
                return (personalId.charAt(10) == '1') ? true : false;
            case 2:
                return (personalId.charAt(10) == '2') ? true : false;
            case 3:
                return (personalId.charAt(10) == '3') ? true : false;
            case 4:
                return (personalId.charAt(10) == '4') ? true : false;
            case 5:
                return (personalId.charAt(10) == '5') ? true : false;
            case 6:
                return (personalId.charAt(10) == '6') ? true : false;
            case 7:
                return (personalId.charAt(10) == '7') ? true : false;
            case 8:
                return (personalId.charAt(10) == '8') ? true : false;
            case 9:
                return (personalId.charAt(10) == '9') ? true : false;
            case 10:
                return (personalId.charAt(10) == 'A') ? true : false;
            case 11:
                return (personalId.charAt(10) == 'B') ? true : false;
            case 12:
                return (personalId.charAt(10) == 'C') ? true : false;
            case 13:
                return (personalId.charAt(10) == 'D') ? true : false;
            case 14:
                return (personalId.charAt(10) == 'E') ? true : false;
            case 15:
                return (personalId.charAt(10) == 'F') ? true : false;
            case 16:
                return (personalId.charAt(10) == 'H') ? true : false;
            case 17:
                return (personalId.charAt(10) == 'J') ? true : false;
            case 18:
                return (personalId.charAt(10) == 'K') ? true : false;
            case 19:
                return (personalId.charAt(10) == 'L') ? true : false;
            case 20:
                return (personalId.charAt(10) == 'M') ? true : false;
            case 21:
                return (personalId.charAt(10) == 'N') ? true : false;
            case 22:
                return (personalId.charAt(10) == 'P') ? true : false;
            case 23:
                return (personalId.charAt(10) == 'R') ? true : false;
            case 24:
                return (personalId.charAt(10) == 'S') ? true : false;
            case 25:
                return (personalId.charAt(10) == 'T') ? true : false;
            case 26:
                return (personalId.charAt(10) == 'U') ? true : false;
            case 27:
                return (personalId.charAt(10) == 'V') ? true : false;
            case 28:
                return (personalId.charAt(10) == 'W') ? true : false;
            case 29:
                return (personalId.charAt(10) == 'X') ? true : false;
            case 30:
                return (personalId.charAt(10) == 'Y') ? true : false;
            default:
                System.out.println("Something went wrong");
                return false;
        }
    }

    public String toString() {
        return personalId + "," + name;
    }
}
