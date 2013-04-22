CustomConnectionValidator
=========================

A connection validator for jboss datasource.

config in *-ds.xml like below:

<valid-connection-checker-class-name>com.csair.jboss.jdbc.CustomValidConnectionChecker</valid-connection-checker-class-name>
<background-validation>true</background-validation>
<background-validation-minutes>1</background-validation-minutes>

and put the export jar in deploy floder.

this project depends on jboss-common-jdbc-wrapper.jar and jbossall-client.jar.
