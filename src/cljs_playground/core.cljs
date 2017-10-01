(ns cljs-playground.core)

(def container (.querySelector js/document ".app"))
(def state (atom 0))

(defn render
  [state]
  (str "Tick: " state))

(defn update-ui
  []
  (set! (.-innerHTML container) (render @state)))


(add-watch state :my-watcher update-ui)

(update-ui)

(js/setInterval #(swap! state inc) 1000)
