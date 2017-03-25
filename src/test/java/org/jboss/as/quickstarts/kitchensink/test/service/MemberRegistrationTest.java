package org.jboss.as.quickstarts.kitchensink.test.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

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
import org.jboss.shrinkwrap.impl.base.filter.ExcludeRegExpPaths;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.Mock;

@RunWith(MockitoJUnitRunner.class)
@Category(org.jboss.as.quickstarts.kitchensink.test.category.UnitTest.class)
public class MemberRegistrationTest {
   @Deployment
   public static Archive<?> createTestArchive() {
      return ShrinkWrap.create(WebArchive.class, "test.war")
            .addAsResource("META-INF/test-persistence.xml", "META-INF/persistence.xml")
            .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
            // Deploy our test datasource
            .addAsWebInfResource("test-ds.xml", "test-ds.xml");
   }


   @Test
   public void testRegister() throws Exception {
      Member member = new Member();
      member.setName("Jacob");
      member.setEmail("jb@test.dk");
      assertEquals("Jacob", member.getName());
      assertEquals("jb@test.dk", member.getEmail());
   }
   
}
