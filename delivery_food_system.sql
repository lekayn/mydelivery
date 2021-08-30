CREATE DATABASE delivery_food_system
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;
	
CREATE TABLE cafe
(
	cafe_id SERIAL PRIMARY KEY,
	cafe_name CHARACTER VARYING(30) NOT NULL,
	address CHARACTER VARYING(50) NOT NULL 
	
);

CREATE TABLE menu
(
	menu_id SERIAL PRIMARY KEY,
	cafe_id INTEGER REFERENCES cafe(cafe_id) ON DELETE CASCADE ON UPDATE CASCADE,
	menu_name CHARACTER VARYING(30) NOT NULL,
	description CHARACTER VARYING(100) NOT NULL
	
);

CREATE TABLE dishes
(
	dish_id SERIAL PRIMARY KEY,
	menu_id INTEGER REFERENCES menu(menu_id) ON DELETE CASCADE ON UPDATE CASCADE,
	dish_name CHARACTER VARYING(30) NOT NULL,
	description CHARACTER VARYING(100) NOT NULL,
	price NUMERIC NOT NULL CHECK(price > 0::numeric) 	
);

CREATE TABLE orders
(
	order_id SERIAL PRIMARY KEY,
	cafe_id INTEGER REFERENCES cafe(cafe_id) ON DELETE CASCADE ON UPDATE CASCADE,
	client_address CHARACTER VARYING(100) NOT NULL,
	client_phone CHARACTER VARYING(30)
);

CREATE TABLE order_dishes
(
	order_dishes_id SERIAL PRIMARY KEY,
	order_id INTEGER REFERENCES orders(order_id) ON DELETE CASCADE ON UPDATE CASCADE,
	dish_id INTEGER  REFERENCES dishes(dish_id) ON DELETE CASCADE ON UPDATE CASCADE,
	dish_quantity INTEGER DEFAULT 1
);


INSERT INTO cafe (cafe_name, address) VALUES
('Окорочок','ул.Гоголя, 358'),
('Московский','ул.Пушкина, 38'),
('Венеция','ул.Большая, 24');

INSERT INTO menu(cafe_id, menu_name, description) VALUES
(1,'Меню Окорочка','У нас все вкусно и сытно!'),
(2,'Меню ресторана Московский','Пальчики оближешь!'),
(3,'Меню ресторана Венеция','Хрум-хрум-хрум...');

INSERT INTO dishes(menu_id, dish_name, description, price) VALUES
(1,'Окорочок по-домашнему','Как делает мама.', 200),
(1,'Картошечка','Аппетитная, жареная с маслом и чесночком', 100),
(1,'Квашеная капуста','Хрустит на зубах', 50),
(1,'Морс смородиновый','С витамином С', 50),
(1,'Чай','Из Индии', 50),

(2,'Котлета по-московски','Из мяса бычков Сибири', 150),
(2,'Гречка','Выращена в Сибири', 50),
(2,'Салат Оливье','Классический рецепт, 100г', 70),
(2,'Морс вишневый','С витамином С', 50),
(2,'Чай','Из Индии', 50),

(3,'Паста с овощами','Ом-ном-ном', 150),
(3,'Паста с сыром','Она самая, из Италии', 150),
(3,'Пицца','Классический рецепт, 500г', 500),
(3,'Капучино','Приготовлено по старым рецептам', 100),
(3,'Чай','Из Китая', 50);

INSERT INTO orders(cafe_id, client_address, client_phone) VALUES
(1,'ул.Первая, д.1','89002002001'),
(1,'ул.Вторая, 2','89001001020'),
(1,'ул.Толстого, д.1','89002003001'),
(2,'ул.Витебская, 2','89001001420'),
(2,'ул.Островская, д.1','89002502001'),
(2,'ул.Бережная, 2','89001001060'),
(3,'ул.Министерств, д.1','89007002001'),
(3,'ул.Мира, 2','89001001028'),
(3,'ул.Дружбы, д.1','89002092001');


INSERT INTO order_dishes(order_id, dish_id, dish_quantity) VALUES
(1, 1, 2),
(1, 2, 2),
(2, 1, 1),
(2, 4, 3),
(3, 2, 2),
(3, 3, 2),

(4, 6, 2),
(4, 7, 2),
(5, 8, 1),
(5, 9, 3),
(6, 6, 2),
(6, 10, 2),

(7, 11, 2),
(7, 12, 2),
(8, 11, 1),
(8, 14, 3),
(9, 12, 2),
(9, 13, 2);



