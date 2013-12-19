(ns appone.cljs.test
	(:require [apptwo.cljs.test :as apptwo]))

(defn ^:export greet_appone [n]
  (.log js/console "Hello appone" n))