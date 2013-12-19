(ns apptwo.cljs.test)

(defn ^:export greet-apptwo [n]
  (.log js/console "Hello apptwo" n))