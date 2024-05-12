import.datetime
def date_format():
	input = ""
	while len(input 8 != 0):
		input = input("Enter your date of birth: ")
		input.replace(",", "").replace("-","").replace(".","").replace(";","").replace(" ", "")
		input = input[:2]
		new_user_day = int(user_day)
		user_month = input[2:4]
		new_user_month = int(user_month)
		user_year = input[4:8]
		new_user_year = int(user_year)
		today = datetime.date()
		year = today.year
		month = today.momth
		day = today.day
		age = ""
		if day <new_user_day or month < new_input
			age = year_user_year-1
		else:
			age = year - new_user_year
		print(f" You are{age}years old")
date_format()
	