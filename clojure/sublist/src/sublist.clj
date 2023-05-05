(ns sublist)

(defn is-sublist? [list1 list2]
  (or (empty? list1)
      (some #(= list1 (subvec (vec %) 0 (count list1))) (partition (count list1) 1 list2))))

(defn classify [list1 list2]
  (cond
    (= list1 list2) :equal
    (is-sublist? list1 list2) :sublist
    (is-sublist? list2 list1) :superlist
    :else :unequal))

(comment
  (classify [1 2 3] [1 2 3 4 5]) ; Returns :sublist
  (classify [3 4 5] [1 2 3 4 5]) ; Returns :sublist
  (classify [3 4] [1 2 3 4 5])   ; Returns :sublist
  (classify [1 2 3] [1 2 3])     ; Returns :equal
  (classify [1 2 3 4 5] [2 3 4]) ; Returns :superlist
  (classify [1 2 4] [1 2 3 4 5])) ; Returns :unequal
