package ld_types;


import com.Leybells.line_drawers.*;
import com.Leybells.pixel_drawers.GraphicsPixelDrawer;

import java.awt.*;

public class LDTypist implements LineDrawerTypist {
    private LineDrawer.Type LDType = LineDrawer.Type.DDA;

    @Override
    public LineDrawer createLineDrawer(Graphics g) {
        switch (LDType) {
            case Briesenham : {
                return new BresenhaimLineDrawer(new GraphicsPixelDrawer(g));
            }
            case DDA : {
                return new DDALineDrawer(new GraphicsPixelDrawer(g));
            }
            case Wu : {
                return new WuLineDrawer(new GraphicsPixelDrawer(g));
            }
        }
        return null;
    }

    @Override
    public LineDrawer.Type getType() {
        return LDType;
    }

    @Override
    public void setType(LineDrawer.Type t) {
        this.LDType = t;
    }
}
