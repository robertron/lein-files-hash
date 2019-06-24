(defproject lein-files-hash "0.1.2-SNAPSHOT"
  :description "A Leiningen plugin to save hash trees of files and directories to other files."
  :url "https://github.com/otto-ec/nav_lein-files-hash"
  :license {:name "Apache License 2.0"
            :url  "http://www.apache.org/license/LICENSE-2.0.html"}
  :eval-in-leiningen true

  :dependencies [[org.clojure/clojure "1.10.0"]]

  :profiles {:dev {:dependencies [[org.clojure/test.check "0.9.0"]]}})
