package encrypter;

class Encrypter {

    public static String getEncryptedName(String name) {

        Validator validator = new Validator();

        boolean isStringValid = validator.validate(name);

        if(isStringValid){

            String stringToReturn = "";

            String resultNameString = name.toLowerCase();

            char[] result = new char[name.length()];

            int indexToInsert = name.length() - 1;

            for(char character : resultNameString.toCharArray()) {

                result[indexToInsert] = character;

                indexToInsert = indexToInsert - 1;
            }
            stringToReturn = stringToReturn + String.valueOf(result);

            return stringToReturn;

        } else {

            throw new IllegalArgumentException("Try again with valid name");
        }
    }
}

class Validator {

    public boolean validate(String string) {
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        Encrypter encrypter = new Encrypter();

        System.out.println(encrypter.getEncryptedName("hello"));
    }
}

