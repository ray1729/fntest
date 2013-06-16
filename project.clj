(defproject org.immutant/fntest "0.3.16-SNAPSHOT"
  :description "A harness for running Immutant integration tests"
  :url "https://github.com/immutant/fntest"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0" :scope "test"]
                 [jboss-as-management "0.2.1"]
                 [org.clojure/tools.nrepl "0.2.1"]
                 [backtick "0.1.0"]
                 [bultitude "0.2.0"]]
  :signing {:gpg-key "BFC757F9"}
  :lein-release {:deploy-via :clojars})
