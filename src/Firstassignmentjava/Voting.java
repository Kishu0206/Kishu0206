package Firstassignmentjava;

public class Voting {
    static class UnderAgeException extends Exception {
        public UnderAgeException(String message) {
            super(message);
        }
    }
        public static void checkEligibility(int age) throws UnderAgeException {
            if (age < 18) {
                throw new UnderAgeException("Not eligible to vote since age is less than 18");
            } else {
                System.out.println("Candidate is eligible to vote.");
            }
        }

        public static void main(String[] args) {
            // Assume the candidate's age is provided as input, or you can get it from the user.
            int candidateAge = 19;

            try {
                checkEligibility(candidateAge);
            } catch (UnderAgeException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }

