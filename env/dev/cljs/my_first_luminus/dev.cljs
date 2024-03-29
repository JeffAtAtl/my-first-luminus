(ns ^:figwheel-no-load my-first-luminus.app
  (:require [my-first-luminus.core :as core]
            [figwheel.client :as figwheel :include-macros true]))

(enable-console-print!)

(figwheel/watch-and-reload
  :websocket-url "ws://localhost:3449/figwheel-ws"
  :jsload-callback core/mount-components)

(core/init!)
