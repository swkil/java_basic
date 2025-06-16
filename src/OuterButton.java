import java.awt.*;
import java.lang.Override;

public class OuterButton {
    interface OnClickListener {
        void onClick();
    }

    private OnClickListener listener;

    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        if (listener != null) {
            listener.onClick();
        }
    }

    private class ClickHandler implements OnClickListener {
        @Override
        public void onClick() {
            System.out.println("Button was clicked!");
        }
    }

    public void simulate() {
        setOnClickListener(new ClickHandler());
        click();
    }

    public static void main(String[] args) {
        OuterButton button = new OuterButton();
        button.simulate();
    }
}
