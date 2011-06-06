; http://projecteuler.net/index.php?section=problems&id=1
; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
<<<<<<< HEAD
; Find the sum of all the multiples of 3 or 5 below 1000.

(def numberList (fn [x]
	(filter #(or (= (mod % 5) 0)
	           (= (mod % 3) 0)
	           )
	        (range x)) 
))

(reduce + (numberList 1000))

; gives 233168
=======
;
; Find the sum of all the multiples of 3 or 5 below 1000.


>>>>>>> 182e9c9dff8d4cf23b368bd9bc2f8c57ecade207
