package temperatureconverter;

// Конвертировать температуру из C в F

public class TemperatureConverter {

    public static void main(String[] args) {

        TemperatureConverter rc = new TemperatureConverter ();
        String yourTemp = rc.convertTemp(10, 'C');
        System.out.println(yourTemp);

    }

    public String convertTemp(int temperature, char convertTo) {

        String value = null;
        float convertTemp = 0;

        if (convertTo == 'F') {
            convertTemp = temperature * 9 / 5 + 32;

        } else if (convertTo == 'C') {
            convertTemp = ( temperature - 32 ) * 5 / 9;
        }

        value = String.valueOf(convertTemp);

        return value;
    }

}