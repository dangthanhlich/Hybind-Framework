package javaOOP;

public class Topic_06_Getter_Setter {
	public String personName;
	public int personAge;
	public int personPhone;
	public float personBankAccountAmout;

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		// this.personAge = personAge;
		if (!String.valueOf(personPhone).startsWith("0")) {
			throw new IllegalArgumentException("Số điện thoại bắt ddaaauf bằng :09 - 03 -012-016");
		} else if (personPhone < 10 || personPhone > 11) {
			throw new IllegalArgumentException("số điện thoại phải từ số 10 -11 số");
		} else {
			this.personAge = personAge;
		}
	}

	public int getPersonPhone() {
		return personPhone;
	}

	public void setPersonPhone(int personPhone) {
		this.personPhone = personPhone;
	}

	public float getPersonBankAccountAmout() {
		return personBankAccountAmout;
	}

	public void setPersonBankAccountAmout(float personBankAccountAmout) {
		this.personBankAccountAmout = personBankAccountAmout;
	}

	// public void showPersonInfo() {
	// System.out.println(this.personName);
	// System.out.println(this.personAge);
	// System.out.println(this.personPhone);
	// }
	//
	// // setter
	// public void setPersonName(String personName) {
	// this.personName = personName;
	// }
	//
	// // getter
	// public String getPersonName() {
	// return this.personName;
	// }

}
