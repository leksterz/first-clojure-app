;; creating a scratch file

(+ 1 1)

;; hello just doing some coding
;; objective is to create a basic
;; interaction between the artist  and
;; booking service.

;; spending some time to create different
;; varioutions of user data models. part
;; of user/auth service.

(def artist-1
  [
   [:user-id (int 1)
   :email "ablazevix@gmail.com"
    :user-name "blaze"
    ;; user type 10 = artist
   :user-type (int 10)]
  [:user-id (int 2)
   :email "explodestudioa@gmail.com"
   :user-name "pricey"
   ;; user type 20 == engineer
   :user-type (int 20)]
   ])

artist-1
(get-in artist-1 [1 :email])

;; function that makes new user-id
;; 
;; (defn user-id-increment
;; {FN TO INCREMENT})

(def artist-4
  {{:user-id (int 1)
   :username "blaze"
   :password "blazeint"
   :profile {:name "Blaze"
             :email "ablazevix@gmail.com"
             }
   ;; user type 10 = artist
    :user-type (int 10)}
   {:user-id (int 2)
    :username "pricey"
    :password "priceyint"
    :profile {:name "Pricey"
              :email "explodestudioa@gmail.com"
              }
    ;; user type 20 = engineer
    :user-type (int 20)}
   })

artist-4
(get-in artist-4 [0 :user-id])
(get 1 artist-4)



;; artist array

artist-1

;; artist map

(def artist-2 (apply map vector [[:user-id :user-name]
                   
                                 ["1" "JC"]]))

artist-2

(def artist-3 (let [[first-element second-element third-element fourth-element] 
      ["1" "explodestudioa%gmail.com" "JC" "artist"]] 
  (str "first=" first-element " second=" second-element 
       " third=" third-element " fourth=" fourth-element)))

artist-1

(get artist-1 1)
artist-2
artist-3



(def engineer-1
  ["2"
   "explodestudioa@gmail.com"
   ""])

user

