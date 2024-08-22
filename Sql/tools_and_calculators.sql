create table if not exists tools_and_calculators(
fixed_deposit_calc varchar(255) not null,
personal_loan_emi_calc varchar(255) null,
home_loan_emi_calc varchar(255) null,
car_loan_emi_calc varchar(255) null,
mutual_fund_calc varchar(255) null,
education_laon_calc varchar(255) null,
business_loan_calc varchar(255) null,
retirement_calc varchar(255) null,
investements_calc varchar(255) null,
other_tools varchar(255) null,
constraint tools_and_calculators_pk primary key(fixed_deposit_calc));