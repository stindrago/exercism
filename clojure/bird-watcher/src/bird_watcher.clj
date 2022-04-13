(ns bird-watcher)

(def last-week
  [0 2 5 3 7 8 4])

(defn today [birds]
  (last birds))

(defn inc-bird [birds]
  (assoc birds 6 (inc (today birds))))

(defn day-without-birds? [birds]
  (contains? birds 0))

(defn n-days-count [birds n])

(defn busy-days [birds])

(defn odd-week? [birds])

;; In-line CIDER evaluation with C-c C-e. Info @ https://docs.cider.mx/cider/usage/code_evaluation.html
(comment
  last-week
  (today last-week)
  (inc-bird last-week))
