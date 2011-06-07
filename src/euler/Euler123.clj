; Add all the natural numbers below one thousand that are multiples of 3 or 5.
(println "Euler task 1")
(println
  (reduce
    +
    (filter
      #(or
        (zero? (rem % 3))
        (zero? (rem % 5)))
      (range 1000))))

; By considering the terms in the Fibonacci sequence whose values do not
; exceed four million, find the sum of the even-valued terms.
;(println "Euler task 2")
(println "Euler task 2")
(defn fib []
  (map first
    (iterate
      (fn [[a b]]
        [b (+ a b)])
      [0 1])))

(println
  (reduce
    +
    (take-while
      #(<= % 4000000)
      (filter even? (fib)))))

; Find the largest prime factor of a composite number.
(println "Euler task 3")

(def composite-number 600851475143)

(defn biggest-divisor [a b]
  (if (zero? (rem a b))
    b
    (biggest-divisor a (+ b 1))))

(defn next-divisor [a]
  (biggest-divisor a 2))

(defn find-all-divisors [number result]
  (let [divisor (biggest-divisor number 2)]
    (if (== divisor number)
      result
      (find-all-divisors (/ number divisor) (cons divisor result)))))

(defn find-divisors [number]
  (find-all-divisors number []))

(println (first (find-divisors composite-number)))
