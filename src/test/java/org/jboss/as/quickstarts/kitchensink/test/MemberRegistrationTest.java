package org.jboss.as.quickstarts.kitchensink.test;

import static org.junit.Assert.assertNotNull;

import java.util.logging.Logger;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.as.quickstarts.kitchensink.controller.MemberRegistration;
import org.jboss.as.quickstarts.kitchensink.model.Member;
import org.jboss.as.quickstarts.kitchensink.util.Resources;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

@Category(org.jboss.as.quickstarts.kitchensink.test.category.UnitTest.class)
@RunWith(Arquillian.class)
public class MemberRegistrationTest {
   @Deployment
    public static WebArchive deployment() throws IllegalArgumentException, FileNotFoundException {
        return new DefaultDeployment();
}
   @Test
   public void testRegister() throws Exception {
   //  assertNotNull(new Object());
   }
   
}
