delimiter $$

CREATE TABLE `bus_refuellings` (
  `assignment_id` bigint(20) unsigned NOT NULL,
  `gas_volume` int(5) unsigned DEFAULT NULL,
  PRIMARY KEY (`assignment_id`),
  CONSTRAINT `refuelling_bus_service` FOREIGN KEY (`assignment_id`) REFERENCES `bus_services` (`assignment_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `bus_repairments` (
  `assignment_id` bigint(20) unsigned NOT NULL,
  `expendables_price` decimal(8,2) DEFAULT NULL,
  PRIMARY KEY (`assignment_id`),
  CONSTRAINT `repairment_bus_service` FOREIGN KEY (`assignment_id`) REFERENCES `bus_services` (`assignment_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `bus_services` (
  `assignment_id` bigint(20) unsigned NOT NULL,
  `bus` bigint(20) unsigned DEFAULT NULL,
  PRIMARY KEY (`assignment_id`),
  KEY `service_bus_idx` (`bus`),
  CONSTRAINT `bus_service_assignment` FOREIGN KEY (`assignment_id`) REFERENCES `technical_assignments` (`assignment_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `service_bus` FOREIGN KEY (`bus`) REFERENCES `buses` (`bus_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `buses` (
  `bus_id` bigint(20) unsigned NOT NULL,
  `model` bigint(20) unsigned DEFAULT NULL,
  `state` bigint(20) unsigned DEFAULT NULL,
  `plate` varchar(20) DEFAULT NULL,
  `station` bigint(20) unsigned DEFAULT NULL,
  `station_order` int(5) unsigned DEFAULT NULL,
  PRIMARY KEY (`bus_id`),
  KEY `bus_model_idx` (`model`),
  KEY `bus_tech_state_idx` (`state`),
  KEY `bus_station_idx` (`station`),
  CONSTRAINT `bus_model` FOREIGN KEY (`model`) REFERENCES `models` (`model_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `bus_station` FOREIGN KEY (`station`) REFERENCES `stations` (`station_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `bus_tech_state` FOREIGN KEY (`state`) REFERENCES `technical_states` (`state_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `driver_skills` (
  `skill_id` bigint(20) unsigned NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `max_ride_length` int(6) unsigned DEFAULT NULL,
  `max_passengers` int(3) unsigned DEFAULT NULL,
  PRIMARY KEY (`skill_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `drivers` (
  `employee_id` bigint(20) unsigned NOT NULL,
  `skill` bigint(20) unsigned DEFAULT NULL,
  PRIMARY KEY (`employee_id`),
  KEY `driver_dr_skill_idx` (`skill`),
  CONSTRAINT `driver_dr_skill` FOREIGN KEY (`skill`) REFERENCES `driver_skills` (`skill_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `driver_employee` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`employee_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `employees` (
  `employee_id` bigint(20) unsigned NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `salary` decimal(8,2) DEFAULT NULL,
  `hiring_date` datetime DEFAULT NULL,
  `station` bigint(20) unsigned DEFAULT NULL,
  `station_order` int(5) unsigned DEFAULT NULL,
  PRIMARY KEY (`employee_id`),
  KEY `employee_station_idx` (`station`),
  CONSTRAINT `employee_station` FOREIGN KEY (`station`) REFERENCES `stations` (`station_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `gas_labels` (
  `label_id` bigint(20) unsigned NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `price` decimal(8,2) DEFAULT NULL,
  PRIMARY KEY (`label_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `id_generation_sequences` (
  `entity` varchar(20) NOT NULL,
  `last_id` bigint(20) unsigned DEFAULT NULL,
  PRIMARY KEY (`entity`),
  UNIQUE KEY `idid_generation_sequences_UNIQUE` (`entity`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `mechanic_skills` (
  `skill_id` bigint(20) unsigned NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `max_diff_level` int(2) unsigned DEFAULT NULL,
  PRIMARY KEY (`skill_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `mechanics` (
  `employee_id` bigint(20) unsigned NOT NULL,
  `skill` bigint(20) unsigned DEFAULT NULL,
  PRIMARY KEY (`employee_id`),
  KEY `mechanic_mech_skill_idx` (`skill`),
  CONSTRAINT `mechanic_employee` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`employee_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `mechanic_mech_skill` FOREIGN KEY (`skill`) REFERENCES `mechanic_skills` (`skill_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `models` (
  `model_id` bigint(20) unsigned NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `seats_number` int(3) unsigned DEFAULT NULL,
  `tank_volume` int(4) unsigned DEFAULT NULL,
  `gas_label` bigint(20) unsigned DEFAULT NULL,
  `gas_rate` decimal(10,5) DEFAULT NULL,
  PRIMARY KEY (`model_id`),
  KEY `model_gas_label_idx` (`gas_label`),
  CONSTRAINT `model_gas_label` FOREIGN KEY (`gas_label`) REFERENCES `gas_labels` (`label_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `regions` (
  `region_id` bigint(20) unsigned NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `num_code` int(3) unsigned DEFAULT NULL,
  PRIMARY KEY (`region_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `ride_points` (
  `ride_point_id` bigint(20) unsigned NOT NULL,
  `route_point` bigint(20) unsigned DEFAULT NULL,
  `arrival_time` datetime DEFAULT NULL,
  `departure_time` datetime DEFAULT NULL,
  `ride` bigint(20) unsigned DEFAULT NULL,
  `ride_order` int(5) unsigned DEFAULT NULL,
  PRIMARY KEY (`ride_point_id`),
  KEY `ride_point_route_point_idx` (`route_point`),
  KEY `ride_point_ride_idx` (`ride`),
  CONSTRAINT `ride_point_ride` FOREIGN KEY (`ride`) REFERENCES `rides` (`ride_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `ride_point_route_point` FOREIGN KEY (`route_point`) REFERENCES `route_points` (`route_point_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `ride_roads` (
  `ride_road_id` bigint(20) unsigned NOT NULL,
  `road` bigint(20) unsigned DEFAULT NULL,
  `driver` bigint(20) unsigned DEFAULT NULL,
  `ride` bigint(20) unsigned DEFAULT NULL,
  `ride_order` int(5) unsigned DEFAULT NULL,
  PRIMARY KEY (`ride_road_id`),
  KEY `ride_road_road_idx` (`road`),
  KEY `ride_road_ride_idx` (`ride`),
  KEY `ride_road_driver_idx` (`driver`),
  CONSTRAINT `ride_road_driver` FOREIGN KEY (`driver`) REFERENCES `drivers` (`employee_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `ride_road_ride` FOREIGN KEY (`ride`) REFERENCES `rides` (`ride_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ride_road_road` FOREIGN KEY (`road`) REFERENCES `roads` (`road_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `rides` (
  `ride_id` bigint(20) unsigned NOT NULL,
  `bus` bigint(20) unsigned DEFAULT NULL,
  `route` bigint(20) unsigned DEFAULT NULL,
  `route_order` int(5) unsigned DEFAULT NULL,
  PRIMARY KEY (`ride_id`),
  KEY `ride_route_idx` (`route`),
  KEY `ride_bus_idx` (`bus`),
  CONSTRAINT `ride_bus` FOREIGN KEY (`bus`) REFERENCES `buses` (`bus_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `ride_route` FOREIGN KEY (`route`) REFERENCES `routes` (`route_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `roads` (
  `road_id` bigint(20) unsigned NOT NULL,
  `a_station` bigint(20) unsigned DEFAULT NULL,
  `z_station` bigint(20) unsigned DEFAULT NULL,
  `length` int(6) unsigned DEFAULT NULL,
  `ride_price` decimal(8,2) DEFAULT NULL,
  PRIMARY KEY (`road_id`),
  KEY `road_a_station_idx` (`a_station`),
  KEY `road_z_station_idx` (`z_station`),
  CONSTRAINT `road_a_station` FOREIGN KEY (`a_station`) REFERENCES `stations` (`station_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `road_z_station` FOREIGN KEY (`z_station`) REFERENCES `stations` (`station_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `route_points` (
  `route_point_id` bigint(20) unsigned NOT NULL,
  `station` bigint(20) unsigned DEFAULT NULL,
  `route` bigint(20) unsigned DEFAULT NULL,
  `route_order` int(5) unsigned DEFAULT NULL,
  PRIMARY KEY (`route_point_id`),
  KEY `route_idx` (`route`),
  KEY `station_idx` (`station`),
  CONSTRAINT `route_point_route` FOREIGN KEY (`route`) REFERENCES `routes` (`route_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `route_point_station` FOREIGN KEY (`station`) REFERENCES `stations` (`station_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `routes` (
  `route_id` bigint(20) unsigned NOT NULL,
  `num_code` int(3) unsigned DEFAULT NULL,
  `ticket_price` decimal(8,2) DEFAULT NULL,
  PRIMARY KEY (`route_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `salesmen` (
  `employee_id` bigint(20) unsigned NOT NULL,
  `total_sales` int(8) unsigned DEFAULT NULL,
  PRIMARY KEY (`employee_id`),
  CONSTRAINT `salesman_employee` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`employee_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `station_services` (
  `assignment_id` bigint(20) unsigned NOT NULL,
  `description` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`assignment_id`),
  CONSTRAINT `station_service_assignment` FOREIGN KEY (`assignment_id`) REFERENCES `technical_assignments` (`assignment_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `stations` (
  `station_id` bigint(20) unsigned NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `latitude` decimal(8,5) DEFAULT NULL,
  `longitude` decimal(8,5) DEFAULT NULL,
  `region` bigint(20) unsigned DEFAULT NULL,
  `region_order` int(5) unsigned DEFAULT NULL,
  PRIMARY KEY (`station_id`),
  KEY `region_id_idx` (`region`),
  CONSTRAINT `station_region` FOREIGN KEY (`region`) REFERENCES `regions` (`region_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `technical_assignments` (
  `assignment_id` bigint(20) unsigned NOT NULL,
  `mechanic` bigint(20) unsigned DEFAULT NULL,
  `begin_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `service_cost` decimal(8,2) DEFAULT NULL,
  PRIMARY KEY (`assignment_id`),
  KEY `assignment_mechanic_idx` (`mechanic`),
  CONSTRAINT `assignment_mechanic` FOREIGN KEY (`mechanic`) REFERENCES `mechanics` (`employee_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `technical_states` (
  `state_id` bigint(20) unsigned NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  `difficulty_level` int(2) unsigned DEFAULT NULL,
  PRIMARY KEY (`state_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `tickets` (
  `ticket_id` bigint(20) unsigned NOT NULL,
  `departure_point` bigint(20) unsigned DEFAULT NULL,
  `arrival_point` bigint(20) unsigned DEFAULT NULL,
  `seat` int(3) unsigned DEFAULT NULL,
  `salesman` bigint(20) unsigned DEFAULT NULL,
  `sale_date` datetime DEFAULT NULL,
  `customer_name` varchar(150) DEFAULT NULL,
  `price` decimal(8,2) DEFAULT NULL,
  `is_sold` tinyint(1) unsigned DEFAULT NULL,
  `ride` bigint(20) unsigned DEFAULT NULL,
  `ride_order` int(5) unsigned DEFAULT NULL,
  PRIMARY KEY (`ticket_id`),
  KEY `ticket_dep_point_idx` (`departure_point`),
  KEY `ticket_end_point_idx` (`arrival_point`),
  KEY `ticket_salesman_idx` (`salesman`),
  KEY `ticket_ride_idx` (`ride`),
  CONSTRAINT `ticket_dep_point` FOREIGN KEY (`departure_point`) REFERENCES `ride_points` (`ride_point_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `ticket_end_point` FOREIGN KEY (`arrival_point`) REFERENCES `ride_points` (`ride_point_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `ticket_ride` FOREIGN KEY (`ride`) REFERENCES `rides` (`ride_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `ticket_salesman` FOREIGN KEY (`salesman`) REFERENCES `salesmen` (`employee_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$