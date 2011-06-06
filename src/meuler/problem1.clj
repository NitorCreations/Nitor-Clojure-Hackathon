(ns problem1)

(defn divisible-by-n [x n]
  (zero? (rem x n)))

(reduce +
        (filter
          (fn [x]
            (or (divisible-by-n x 3)
                (divisible-by-n x 5)))
          (range 1000)))
