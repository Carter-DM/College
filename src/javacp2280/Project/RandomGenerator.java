package javacp2280.Project;

import java.util.Random;

public class RandomGenerator {

    public static final String[] names = {
            "Johan Lang", "Alessandro Woodward", "Savion Horton",
            "Paige Tyler", "Cheyenne Roth", "Kirsten Solomon",
            "Kaliyah Richard", "Kendrick Gentry", "Kamila Ponce",
            "Jayce Wood", "Natalie Murillo", "Shamar Bennett",
            "Genesis Silva", "Reyna Deleon", "Charlie Peters",
            "Mariyah Downs", "Matias Zavala", "Ulises Waller",
            "Luca Ware", "Isaiah Hutchinson", "Jaquan Hood",
            "Edwin Aguirre", "Jaslyn Solis", "Morgan Preston",
            "Nancy Olsen", "Riya Russo", "Rebecca Gray",
            "Yasmine Wang", "Jaxon Buchanan", "Antony Pearson",
            "Arabella Castaneda", "Armando Harvey", "Braeden Mcbride",
            "Areli Holden", "Jaden Morris", "Dereon Rivera",
            "Javion Meadows", "Dean Mcdaniel", "Odin Hurst",
            "Jaylee Jenkins", "Marisol Costa", "Kierra Conrad",
            "Aldo Ellison", "Garrett Moran", "Ruby Dyer",
            "Dante Page", "Melvin Hunter", "Roderick Ewing",
            "George Pitts", "Jazlynn Kemp"};

    /**
     * getRandomEmployee
     * <p>Generates and returns random new Employee</p>
     *
     * @return
     */
    public static Employee getRandomEmployee() {
        Random random = new Random();
        int randomNameIndex = (int) (Math.random() * 50);
        int randomEmployeeType = (int) (Math.random() * 3);
        if (randomEmployeeType == 0) {
            return new HourlyEmployee(
                    getFirstName(randomNameIndex),
                    getLastName(randomNameIndex),
                    1 + random.nextInt(30 - 1 + 1),
                    1 + random.nextInt(12 - 1 + 1),
                    1950 + random.nextInt(2000 - 1950 + 1),
                    48 + (84 - 48 + 1) * random.nextDouble(),
                    90 + (600 - 90 + 1) * random.nextDouble(),
                    20 + (80 - 20 + 1) * random.nextDouble(),
                    20 + (40 - 20 + 1) * random.nextDouble()
            );
        } else if (randomEmployeeType == 1) {
            return new SalariedEmployee(
                    getFirstName(randomNameIndex),
                    getLastName(randomNameIndex),
                    1 + random.nextInt(30 - 1 + 1),
                    1 + random.nextInt(12 - 1 + 1),
                    1950 + random.nextInt(2000 - 1950 + 1),
                    48 + (84 - 48 + 1) * random.nextDouble(),
                    90 + (600 - 90 + 1) * random.nextDouble(),
                    20000 + (120000 - 20000 + 1) * random.nextDouble()
            );
        } else {
            return new ExecutiveEmployee(
                    getFirstName(randomNameIndex),
                    getLastName(randomNameIndex),
                    1 + random.nextInt(30 - 1 + 1),
                    1 + random.nextInt(12 - 1 + 1),
                    1950 + random.nextInt(2000 - 1950 + 1),
                    48 + (84 - 48 + 1) * random.nextDouble(),
                    90 + (600 - 90 + 1) * random.nextDouble(),
                    20000 + (120000 - 20000 + 1) * random.nextDouble(),
                    500 + (10000 - 500 + 1) * random.nextDouble()
            );
        }
    }

    /**
     * getFirstName method
     * <p>Returns first name from names array</p>
     * @param index
     * @return
     */
    private static String getFirstName(int index) {
        return names[index].substring(0, names[index].indexOf(" "));
    }

    /**
     * getLastName method
     * <p>Returns last name from names array</p>
     * @param index
     * @return
     */
    private static String getLastName(int index) {
        return names[index].substring(names[index].indexOf(" ") + 1);
    }

    /**
     * getRandomCompany method
     * <p>Returns an array of random Employees.</p>
     *
     * @param size Number of Employees in company
     * @return
     */
    public static Employee[] getRandomCompany(int size) {
        Employee[] company = new Employee[size];
        for (int i = 0; i < size; i++) {
            company[i] = getRandomEmployee();
        }
        return company;
    }
}
