(defproject appone "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
				
  :dependencies [[org.clojure/clojure "1.5.1"]
				[org.clojure/clojurescript "0.0-2080"]
				[apptwo/apptwo "0.1.0-SNAPSHOT"]]
  :plugins [[lein-cljsbuild "1.0.1-SNAPSHOT"]]
  :cljsbuild {:builds
               [{:source-paths ["src/appone/cljs" "checkouts/apptwo/src/cljs"],
                 :compiler
                 {:pretty-print true,
                  :output-to "resources/generated/appone.js",
                  :optimizations :advanced}}]})
