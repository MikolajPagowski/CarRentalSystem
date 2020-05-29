INSERT INTO public.parkingSpace(id, parking_space_name, avaliable_place) VALUES
(1, 'park&ride1', 15),
(2, 'park&ride2', 12),
(3, 'park&ride3', 19),
(4, 'park&ride4', 10),
(5, 'park&ride5', 7);

INSERT INTO public.car(id, brand, model, car_class, rental_price, parking_space_id, user_account_id) VALUES
(6, 'Porsche', '911 Turbo S', 'Sport', 799.99, 1, NULL ),
(7, 'Porsche', 'Panamera GTS', 'Exclusive', 557.99, 5, NULL ),
(8, 'Mercedes', 'A 180', 'Economy', 199.99, 4, NULL ),
(9, 'Rolls Royce', 'Phantom', 'Exclusive', 1999.99, 3, NULL ),
(10, 'Porsche', 'Taycan Turbo S', 'Electric', 1299.99, 3, NULL ),
(11, 'Mercedes', 'Sprinter', 'Van', 275.00, 1, NULL ),
(12, 'Mercedes', 'S65 AMG', 'Exclusive', 1499.99, 5, NULL ),
(13, 'Toyota', 'GT86', 'Sport', 129.99, 4, NULL ),
(14, 'Peugeot', 'Partner', 'Van', 350.99, 2, NULL );

SELECT setval('public.hibernate_sequence', 15, true);



