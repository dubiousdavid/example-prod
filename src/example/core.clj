(ns example.core)

(defprotocol Printable
  (printd [this]))

(defmacro describe [description & body])
(defmacro example [form])
(defmacro ex [& forms])
