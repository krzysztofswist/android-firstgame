package com.kswist.framework;

import java.util.List;

public interface Input {
   
    public static class TouchEvent {
        public static final int TOUCH_DOWN = 0;
        public static final int TOUCH_UP = 1;
        public static final int TOUCH_DRAGGED = 2;
        public static final int TOUCH_HOLD = 3;
        public static final int TOUCH_LEFT=4;
        public static final int TOUCH_RIGHT=5;
        
        public int type;
        public int x, y;
        public int pointer;


    }

    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<TouchEvent> getTouchEvents();
}
