cljs-checkout-example
=====================

Example on how to use the "checkouts" feature from leiningen with two clojurescript libraries during local development

The goal is that appone acceses cljs functions from apptwo.
For this i added a symbolic link from checkouts with mklink like this:
mklink /D apptwo ..\..\apptwo