(defproject blog "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.8.40"]
                 [org.omcljs/om "1.0.0-alpha28"]
                 [racehub/om-bootstrap "0.6.1"]]
  :main blog.core
  :plugins [[lein-cljsbuild "1.1.3"]]
  :cljsbuild {:builds [{:source-paths ["src"] ; The path to the top-level ClojureScript source directory:
                                        ; The standard ClojureScript compiler options:
                                        ; (See the ClojureScript compiler documentation for details.)
                        :compiler {:output-to "out/main.js"  ; default: target/cljsbuild-main.js
                                   :optimizations :whitespace
                                   :pretty-print true}}]})
