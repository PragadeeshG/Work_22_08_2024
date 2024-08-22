create table if not exists ways_to_bank_and_other_services(
type_code Integer not null,
digital_banking_code varchar(255) null,
mobile_banking varchar(255) null,
internet_banking varchar(255) null,
mobile_app varchar(255) null,
whatsapp_banking varchar(255) null,
pockets_app varchar(255) null,
wallets varchar(255) null,
bank_ventures varchar(255) null,
prudential_life_insurance varchar(255) null,
home_finance varchar(255) null,
general_insurance varchar(255) null,
bank_direct varchar(255) null,
security_primary_dealership varchar(255) null,
constraint ways_to_bank_and_other_services_pk primary key(type_code));