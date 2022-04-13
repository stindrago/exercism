(ns bird-watcher)

(def last-week
  [0 2 5 3 7 8 4])

(defn today [birds]
  (last birds))

(defn inc-bird [birds]
  (assoc birds (dec (count birds)) (inc (today birds))))

(defn day-without-birds? [birds]
  (some? (some zero? birds)))

(defn n-days-count [birds n]
  (reduce + (take n birds)))

(defn busy-days [birds]
  (let [busy-day-count 5]
    ;; Filter `birds` and get all entries greater or equal to `busy-day-count`. Count result.
    (count (filter #(>= % busy-day-count) birds))))

(defn odd-week? [birds]
  (let [pattern [1 0 1 0 1 0 1]]
    (= birds pattern)))
