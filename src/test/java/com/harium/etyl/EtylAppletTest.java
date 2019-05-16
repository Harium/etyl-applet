package com.harium.etyl;

import com.harium.etyl.commons.context.Application;
import org.junit.Assert;
import org.junit.Test;

public class EtylAppletTest {

    @Test
    public void dummyTest() {
        int width = 16;
        int height = 9;

        EtylApplet applet = new EtylApplet(width,height) {
            @Override
            public Application startApplication() {
                return null;
            }
        };

        Assert.assertEquals(16, applet.w);
        Assert.assertEquals(9, applet.h);
    }

}
