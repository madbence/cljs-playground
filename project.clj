(defproject lennon/cljs-playground "0.1.0"
  :plugins [[lein-cljsbuild "1.1.7"]]
  :dependencies [[org.clojure/clojurescript "1.9.908"]
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/core.async "0.3.443"]]
  :cljsbuild
  {:builds
   [{:source-paths ["src"]
     :compiler
     {:output-to "dist/bundle.js"
      :optimizations :advanced
      :pretty-print false}}]})
