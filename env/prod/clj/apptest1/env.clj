(ns apptest1.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[apptest1 started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[apptest1 has shut down successfully]=-"))
   :middleware identity})
