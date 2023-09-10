package core.view;

import core.control.BasicControl;

public interface BasicView {
    public void start(BasicControl control, String text);

    public BasicControl getControl();
}
