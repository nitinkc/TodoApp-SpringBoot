# Basic Authentication

Form based basic authentication provides a form for a login. Once login is secured, the user remains
logged in forever.

Basic Authentication : Spring Security enables both basic and form based security authentication

Form based authentication is based on a session which is created on the server and a cookie which is in your browser.
So this cookie identifies this session on the browser, and that will be used as the authentication mechanism
for a form.

Basic authentication needs a additional session which is created on the server side. So that's an overhead.

In the case of a basic authentication, a basic authorization header is sent with every request. A token is generated based
on the userid and password.