package cl.vero.mvp;

public class TipsCalculator {

    private TipsCallback callback;

    public TipsCalculator(TipsCallback callback) {
        this.callback = callback;
    }

    public void calculator(String value){

        if (value.trim().length() > 0){

            int tip = 10;
            int auxValue = Integer.parseInt(value);
            value = String.valueOf(auxValue * tip/100);
            callback.succes(value);

        } else {

            callback.blankInput();

        }

    }
}
