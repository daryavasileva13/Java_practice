package Practice17;

public class User {
    private String name;
    private String INN;

    User(String name, String INN){
        this.name = name;
        this.INN = INN;
    }

    public void checkINN() throws IncorrectINN{
        if (INN.compareTo("") != 0 && INN.length() == 12 && INN.matches("[0-9]+")) {
            int organisation = Integer.parseInt(INN.substring(0, 4));
            int orderNumber = Integer.parseInt(INN.substring(4, 10));
            int controlNumber = Integer.parseInt(INN.substring(10));
            if (organisation >= 1000 && organisation <= 9999 && controlNumber >= 10 && controlNumber <= 90 && controlNumber % 7 != 0) {
                System.out.println("Все хорошо!");
            } else {
                throw new IncorrectINN("Проверьте ИНН");
            }

        } else {
            throw new IncorrectINN("Проверьте ИНН");
        }
    }
}
