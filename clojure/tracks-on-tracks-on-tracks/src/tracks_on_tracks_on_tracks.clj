(ns tracks-on-tracks-on-tracks)

(def ok 30)

(defn new-list
  "Creates an empty list of languages to practice."
  []
  (list))

(defn add-language
  "Adds a language to the list."
  [lang-list lang]
  (conj lang-list lang))

(defn first-language
  "Returns the first language on the list."
  [lang-list]
  (first lang-list))

(defn remove-language
  "Removes the first language added to the list."
  [lang-list]
  (rest lang-list))

(defn count-languages
  "Returns the total number of languages on the list."
  [lang-list]
  (count lang-list))

(defn learning-list
  "Creates an empty list, adds Clojure and Lisp, removes Lisp, adds
  Java and JavaScript, then finally returns a count of the total number
  of languages."
  []
  (count (conj (new-list) (first (conj (new-list) "Clojure" "Lisp")) "Java" "JavaScript")))
