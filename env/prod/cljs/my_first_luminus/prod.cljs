(ns my-first-luminus.app
  (:require [my-first-luminus.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
