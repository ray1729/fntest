(defproject org.immutant/fntest "0.3.3"
  :description "A harness for running Immutant integration tests"
  :url "https://github.com/immutant/fntest"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [jboss-as-management "0.1.3"]]
  :lein-release {:deploy-via :clojars})