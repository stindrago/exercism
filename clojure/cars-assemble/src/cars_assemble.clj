(ns cars-assemble)

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (let [cars-ph 221                     ; cars per hour
        speed-rates (conj {0 0/100}
                          (zipmap (range 1 5) (repeat 100/100))
                          (zipmap (range 5 9) (repeat 90/100))
                          {8 90/100}
                          {9 80/100}
                          {10 77/100})] ; => {0 0, 7 9/10, 1 1, 4 1, 6 9/10, 3 1, 2 1, 9 4/5, 5 9/10, 10 77/100, 8 9/10}
    (* cars-ph speed (double (speed-rates speed))))) ; `double` instead of `float`

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
  (int (/ (production-rate speed) 60)))
