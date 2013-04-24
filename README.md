CustomConnectionValidator
=========================

A connection validator for jboss datasource.

config in *-ds.xml like below:

&lt;valid-connection-checker-class-name&gt;com.csair.jboss.jdbc.CustomValidConnectionChecker&lt;/valid-connection-checker-class-name&gt;
&lt;background-validation&gt;true&lt;/background-validation&gt;<br/>
&lt;background-validation-minutes&gt;1&lt;/background-validation-minutes&gt;

and put the exported jar in deploy floder.

this project depends on jboss-common-jdbc-wrapper.jar and jbossall-client.jar.
