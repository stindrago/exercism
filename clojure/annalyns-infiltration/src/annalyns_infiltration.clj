(ns annalyns-infiltration)

(defn can-fast-attack?
  "Returns true if a fast-attack can be made, false otherwise."
  [knight-awake?]
  (false? knight-awake?))

(defn can-spy?
  "Returns true if the kidnappers can be spied upon, false otherwise."
  [knight-awake? archer-awake? prisoner-awake?]
  (or knight-awake? archer-awake? prisoner-awake?))

(defn can-signal-prisoner?
  "Returns true if the prisoner"
  [archer-awake? prisoner-awake?]
  (and (false? archer-awake?)
       (true? prisoner-awake?)))

(defn can-free-prisoner?
  "Returns true if prisoner can be freed, false otherwise."
  [knight-awake? archer-awake? prisoner-awake? dog-present?]
  (cond
    (and dog-present? (false? archer-awake?)) true
    (and (false? dog-present?) prisoner-awake? (false? knight-awake?) (false? archer-awake?)) true
    :else false))
