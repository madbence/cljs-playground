(require 'cljs.build.api)

(cljs.build.api/build "src"
  {:output-to "dist/bundle.js"
   :output-dir "dist"
   :optimizations :advanced
   :verbose true})

(System/exit 0)
