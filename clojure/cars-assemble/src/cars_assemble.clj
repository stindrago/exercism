(ns cars-assemble)

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (let [cars 221]
    (case speed
      0 (* cars speed 0)
      1 (* cars speed 1)
      2 (* cars speed 1)
      3 (* cars speed 1)
      4 (* cars speed 1)
      5 (* cars speed 0.9)
      6 (* cars speed 0.9)
      7 (* cars speed 0.9)
      8 (* cars speed 0.9)
      9 (* cars speed 0.8)
      10 (* cars speed 0.77))))

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed])
