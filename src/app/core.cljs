(ns app.core
  (:require [cljs.nodejs :as node]
            [cljs.core.async :refer [<! chan >!]])
  (:require-macros [cljs.core.async.macros :refer [go]]))

(def AWS (node/require "aws-sdk"))

(node/enable-util-print!)

(defn ^:export handler [event context cb]
  (go
      (cb nil (clj->js event))))

(defn -main [] identity)
(set! *main-cli-fn* -main)
