(set-env!
 :source-paths #{"src"}
 :dependencies '[[adzerk/boot-cljs            "1.7.228-1"      :scope "test"]
                 [org.clojure/clojurescript   "1.9.89"]
                 [org.clojure/core.async      "0.2.374"]])

(require
  '[adzerk.boot-cljs      :refer :all])

(deftask build []
  (task-options! cljs   {:compiler-options {:optimizations :simple
                                            :target :nodejs}})
  (comp (cljs)
        (target)))

(deftask dev []
  (comp (watch)
        (build)))
