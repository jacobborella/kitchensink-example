package org.jboss.as.quickstarts.tasksrs;

import java.io.File;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;

/**
 *  * Enables prepare project-specific {@link WebArchive} for deployment.
 *   *
 *    * @author Lukas Fryc
 *     *
 *      */
public class DefaultDeployment {

    private static final String WEBAPP_SRC = "src/main/webapp";

    private WebArchive webArchive;

    public DefaultDeployment() {
        webArchive = ShrinkWrap.create(WebArchive.class, "test.war").addAsWebInfResource(
                new File(WEBAPP_SRC, "WEB-INF/beans.xml"));
    }
}
