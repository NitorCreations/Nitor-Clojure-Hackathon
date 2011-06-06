(ns problem2)

(def fibonacci (memoize 
                 (fn [n]
                   (cond (== 0 n) 1
                         (== 1 n) 1
                         true (+ (fibonacci (- n 1))
                                 (fibonacci (- n 2)))))
                 ))

(reduce +
        (filter even?
                (take-while #(< % 4000000)
                            (map fibonacci (range)))))
  