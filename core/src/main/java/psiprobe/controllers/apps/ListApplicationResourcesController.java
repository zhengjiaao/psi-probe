/**
 * Licensed under the GPL License. You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 *
 * THIS PACKAGE IS PROVIDED "AS IS" AND WITHOUT ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
 * WITHOUT LIMITATION, THE IMPLIED WARRANTIES OF MERCHANTIBILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE.
 */
package psiprobe.controllers.apps;

import org.apache.catalina.Context;
import org.springframework.web.servlet.ModelAndView;

import psiprobe.controllers.AbstractContextHandlerController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Creates a list of resources for a particular web application.
 */
public class ListApplicationResourcesController extends AbstractContextHandlerController {

  @Override
  protected ModelAndView handleContext(String contextName, Context context,
      HttpServletRequest request, HttpServletResponse response) throws Exception {

    return new ModelAndView(getViewName(), "resources", getContainerWrapper().getResourceResolver()
        .getApplicationResources(context, getContainerWrapper()));
  }

}
