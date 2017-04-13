# SpringMVCDemo

<BR>
This is basic Spring MVC Module Demo. Once imported this code, you can run the application using Apache Tomcat and access the path <br>
http://localhost:8080/SpringMVCDemo/

<br>
For more details, see the code or the request paths in the controller classes which are annotated with @Controller. (Eg: WelcomeController)

<br><br>

<pre>
<h2> Common Issue: </h2>
Issue: The spring application does not receive the request for the default aplication path such as 
http://localhost:8080/notary/ 
which is mapped to 
@RequestMapping(value = "/", method = RequestMethod.GET) 
in the controller servlet.

<h2> <u>Solution: </u> </h2>
See if the "<mvc:annotation:driven/>" is added in dispatcher-servlet.xml. 
This should be added in order to recognize the annotations (Eg: @Controller).

Check two more things:
1) The package name of the controller.

package com.subhani.notary.controller;
						             ----------------
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NotaryController {

2) The base-package attribute value in the dispatcher-servlet.xml
<context:component-scan base-package="com.subhani.notary.controller"></context:component-scan>
													                            	------------

The base-package value should end with the "controller" instead of "....controller.*"

Not like this...
<context:component-scan base-package="com.subhani.notary.controller.*"></context:component-scan>

What it means is... look for the base component directory only in the subdirectories of "com.subhani.notary.controller." sub packages.
Our controller classes are on sub controller package. Hence, the Spring unable to find the controller annotations.
Just remove the ".*" and see the result. 

OR 

You can keep one directory less and use "*"

Like, <context:component-scan base-package="com.subhani.notary.*"></context:component-scan>

</pre>

Thank you. <br>
Subhani.
