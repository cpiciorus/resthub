package org.resthub.core.util;

import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.Test;

public class ClassUtilsTest {

    @Test
    public void testGetGenericType() {
        Assert.assertNull(ClassUtils.getGenericType(Object.class));
        Assert.assertNull(ClassUtils.getGenericType(SampleResource.class));
    }

    @Test
    public void testGetGenericTypeFromBean() {
        Assert.assertNull(ClassUtils.getGenericTypeFromBean(new Object()));
        Assert.assertNull(ClassUtils.getGenericTypeFromBean(new SampleResource()));
        Assert.assertEquals("Base class generic type", SampleResource.class,
                ClassUtils.getGenericTypeFromBean(new SampleResourceArrayList()));
    }

    private static class SampleResource {
        private static final long serialVersionUID = 4925762850344399849L;
    }

    private static class SampleResourceArrayList extends ArrayList<SampleResource> {
        private static final long serialVersionUID = 4925762850344399849L;
    }

}
