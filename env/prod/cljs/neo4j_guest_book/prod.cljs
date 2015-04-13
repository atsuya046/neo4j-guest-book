(ns neo4j-guest-book.app
  (:require [neo4j-guest-book.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
