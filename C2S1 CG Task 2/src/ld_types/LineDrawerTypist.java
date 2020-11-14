package ld_types;


import com.Leybells.line_drawers.LineDrawer;

import java.awt.*;

public interface LineDrawerTypist {
    LineDrawer createLineDrawer(Graphics g);

    void setType(LineDrawer.Type t);

    LineDrawer.Type getType();
}
