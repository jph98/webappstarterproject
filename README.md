Webapp Starter Project (Servlet 3.0/Tomcat)
==================

This is an example Servlet 3.0 project with embedded Tomcat. 

Embedded Tomcat
---------------

See the following for the goals to run on the embedded Tomcat: 

http://tomcat.apache.org/maven-plugin-2.0/context-goals.html

To get help:

	mvn tomcat7:help
	
To package and run:

	mvn package
	mvn tomcat7:run
	
This runs the current project under the context by the same finalname of the war file built:

index.jsp:              http://localhost:8080/webappstarter
HelloWorldServlet:      http://localhost:8080/webappstarter/hello
