(ns interest-is-interesting)

(defn interest-rate
  [balance]
  (let [a -3.213
        b 0.5
        c 1.621
        d 2.475]
    (cond
      (neg? balance) a
      (< balance 1000.0M) b
      (< balance 5000.0M) c
      :else d)))

(defn annual-balance-update
  [balance]
  (* balance (inc ((fn [n]
                     (max n (- n)))
                   (/ (bigdec (interest-rate balance)) 100)))))

(defn amount-to-donate
  [balance tax-free-percentage]
  (if (pos? balance)
    (int (* balance 2 (/ tax-free-percentage 100)))
    0))
